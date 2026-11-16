package com.example.petmach_tab.api.dto;

import java.util.Map;

public record ApiErrorResponse(
    String code,
    String message,
    Map<String, String> fieldErrors
) {
}