package com.example.shared.dto;

import lombok.Builder;

@Builder
public record UserRequestCreate(
    String username,
    String email,
    String phone,
    String password
) {

}
