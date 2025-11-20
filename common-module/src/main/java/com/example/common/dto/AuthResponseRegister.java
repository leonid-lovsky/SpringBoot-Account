package com.example.common.dto;

import lombok.Builder;

@Builder
public record AuthResponseRegister(
    String id,
    String username,
    String email,
    String phone
) {

}
