package com.example.petmach_tab.api.dto;

import com.example.petmach_tab.model.RequestStatus;
import com.example.petmach_tab.model.SupportType;

public record SupportRequestResponse(
    Long id,
    Long petId,
    SupportType type,
    String description,
    RequestStatus status
) {
}