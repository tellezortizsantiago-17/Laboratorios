package com.example.petmach_tab.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.petmach_tab.model.Pet;
import com.example.petmach_tab.repository.InMemoryPetRepository;

@Service
public class PetService {

    private final InMemoryPetRepository petRepository;

    public PetService(InMemoryPetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<Pet> findAll() {
        return petRepository.findAll();
    }

    public Optional<Pet> findById(long id) {
        return petRepository.findById(id);
    }
}