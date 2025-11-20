package com.example.common.dto;

import lombok.Builder;

@Builder
public record UserRequestUpdate(
    String username,
    String email,
    String phone,
    String password
) {

}
