package com.example.petmach_tab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.petmach_tab.dto.PetForm;
import com.example.petmach_tab.exception.BusinessRuleException;
import com.example.petmach_tab.model.Pet;
import com.example.petmach_tab.repository.PetRepository;
import com.example.petmach_tab.repository.SupportRequestRepository;

@Service
public class PetService {

    private final PetRepository petRepository;
    private final SupportRequestRepository supportRequestRepository;

    public PetService(
        PetRepository petRepository,
        SupportRequestRepository supportRequestRepository
    ) {
        this.petRepository = petRepository;
        this.supportRequestRepository = supportRequestRepository;
    }

    public List<Pet> findAll() {
        return petRepository.findAll();
    }

    public Optional<Pet> findById(long id) {
        return petRepository.findById(id);
    }

    public Pet create(PetForm form) {
        validateForm(form);

        Pet pet = new Pet(
            form.getName().strip(),
            form.getSpecies().strip(),
            form.getAge(),
            normalizeDescription(form.getDescription())
        );

        return petRepository.save(pet);
    }

    public Optional<Pet> update(long id, PetForm form) {
        validateForm(form);

        return petRepository.findById(id).map(existing -> {
            existing.updateDetails(
                form.getName().strip(),
                form.getSpecies().strip(),
                form.getAge(),
                normalizeDescription(form.getDescription())
            );
            return petRepository.save(existing);
        });
    }

    @Transactional
    public boolean delete(long id) {
        return petRepository.findById(id).map(pet -> {
            if (supportRequestRepository.existsByPet_Id(id)) {
                throw new BusinessRuleException(
                    "No se puede eliminar una mascota que tiene solicitudes."
                );
            }

            petRepository.delete(pet);
            return true;
        }).orElse(false);
    }

    private void validateForm(PetForm form) {
        if (form == null) {
            throw new IllegalArgumentException("Pet form is required");
        }
        if (invalidRequiredText(form.getName(), 100)) {
            throw new IllegalArgumentException("Pet name is invalid");
        }
        if (invalidRequiredText(form.getSpecies(), 80)) {
            throw new IllegalArgumentException("Pet species is invalid");
        }
        if (form.getAge() == null || form.getAge() < 0) {
            throw new IllegalArgumentException("Pet age is invalid");
        }
        if (form.getDescription() != null
            && form.getDescription().length() > 1000) {
            throw new IllegalArgumentException("Pet description is too long");
        }
    }

    private boolean invalidRequiredText(String value, int maxLength) {
        return value == null
            || value.strip().isEmpty()
            || value.strip().length() > maxLength;
    }

    private String normalizeDescription(String description) {
        if (description == null || description.isBlank()) {
            return null;
        }
        return description.strip();
    }
}