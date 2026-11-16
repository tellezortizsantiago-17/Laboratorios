package com.example.petmach_tab.api.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.petmach_tab.api.dto.PetRequest;
import com.example.petmach_tab.api.dto.PetResponse;
import com.example.petmach_tab.dto.PetForm;
import com.example.petmach_tab.model.Pet;

class PetApiMapperTests {

    private PetApiMapper mapper;

    @BeforeEach
    void setUp() {
        mapper = new PetApiMapper();
    }

    @Test
    void shouldMapJsonRequestFieldsToExistingServiceForm() {
        PetRequest request = new PetRequest(
            "Luna", "Dog", 3, "Enjoys walks."
        );

        PetForm form = mapper.toForm(request);

        assertEquals("Luna", form.getName());
        assertEquals("Dog", form.getSpecies());
        assertEquals(Integer.valueOf(3), form.getAge());
        assertEquals("Enjoys walks.", form.getDescription());
    }

    @Test
    void shouldKeepOptionalDescriptionNull() {
        PetRequest request = new PetRequest("Milo", "Cat", 2, null);

        PetForm form = mapper.toForm(request);

        assertNull(form.getDescription());
    }

    @Test
    void shouldMapEntityToResponseWithoutChangingTheEntity() {
        Pet pet = new Pet("Kira", "Dog", 4, null);

        PetResponse response = mapper.toResponse(pet);

        assertEquals("Kira", response.name());
        assertEquals("Dog", response.species());
        assertEquals(4, response.age());
        assertNull(response.description());
    }
}