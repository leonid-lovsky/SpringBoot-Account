package com.example.account.dto.auth;

import lombok.Builder;

@Builder
public record RegisterResponse(
    String id,
    String username,
    String email,
    String phone
) {

}
