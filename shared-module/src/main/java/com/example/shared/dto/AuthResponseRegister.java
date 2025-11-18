package com.example.shared.dto;

import lombok.Builder;

@Builder
public record AuthResponseRegister(
    String id,
    String username,
    String email,
    String phone
) {

}
