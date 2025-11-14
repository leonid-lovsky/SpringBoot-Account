package com.example.account.dto.user;

import lombok.Builder;

@Builder
public record CreateUserRequest(
    String username,
    String email,
    String phone,
    String encodedPassword
) {

}
