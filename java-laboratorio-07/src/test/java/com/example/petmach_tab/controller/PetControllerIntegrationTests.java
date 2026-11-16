package com.example.petmach_tab.controller;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class PetControllerIntegrationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldRenderCreateForm() throws Exception {
        mockMvc.perform(get("/pets/new")
                .with(user("admin@example.com").roles("ADMIN")))
            .andExpect(status().isOk())
            .andExpect(view().name("pets/form"))
            .andExpect(model().attributeExists("petForm"));
    }

    @Test
    void shouldRejectInvalidPetFormWithoutRedirect() throws Exception {
        mockMvc.perform(post("/pets")
                .with(user("admin@example.com").roles("ADMIN"))
                .with(csrf())
                .param("name", "")
                .param("species", "")
                .param("age", "-5"))
            .andExpect(status().isOk())
            .andExpect(view().name("pets/form"))
            .andExpect(model().attributeHasFieldErrors("petForm", "name", "species", "age"));
    }

    @Test
    void shouldRedirectAfterValidCreation() throws Exception {
        mockMvc.perform(post("/pets")
                .with(user("admin@example.com").roles("ADMIN"))
                .with(csrf())
                .param("name", "Canela")
                .param("species", "Dog")
                .param("age", "3")
                .param("description", "Friendly"))
            .andExpect(status().is3xxRedirection());
    }

    @Test
    void shouldReturnNotFoundWhenEditingMissingPet() throws Exception {
        mockMvc.perform(get("/pets/{id}/edit", Long.MAX_VALUE)
                .with(user("admin@example.com").roles("ADMIN")))
            .andExpect(status().isNotFound());
    }

    @Test
    void shouldReturnNotFoundWhenDeletingMissingPet() throws Exception {
        mockMvc.perform(post("/pets/{id}/delete", Long.MAX_VALUE)
                .with(user("admin@example.com").roles("ADMIN"))
                .with(csrf()))
            .andExpect(status().isNotFound());
    }
}