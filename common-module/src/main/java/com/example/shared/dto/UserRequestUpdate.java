package com.example.shared.dto;

import lombok.Builder;

@Builder
public record UserRequestUpdate(
    String username,
    String email,
    String phone,
    String password
) {

}
