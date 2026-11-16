package com.example.petmach_tab.api.mapper;

import org.springframework.stereotype.Component;

import com.example.petmach_tab.api.dto.SupportRequestRequest;
import com.example.petmach_tab.api.dto.SupportRequestResponse;
import com.example.petmach_tab.dto.SupportRequestForm;
import com.example.petmach_tab.model.SupportRequest;

@Component
public class SupportRequestApiMapper {

    public SupportRequestForm toForm(SupportRequestRequest request) {
        SupportRequestForm form = new SupportRequestForm();
        form.setType(request.type());
        form.setDescription(request.description());
        return form;
    }

    public SupportRequestResponse toResponse(
        SupportRequest request,
        long petId
    ) {
        return new SupportRequestResponse(
            request.getId(),
            petId,
            request.getType(),
            request.getDescription(),
            request.getStatus()
        );
    }
}