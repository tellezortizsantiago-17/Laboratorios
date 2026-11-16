package com.example.petmach_tab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.petmach_tab.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {
}