package com.example.account.user.dto.request;

import lombok.Builder;

@Builder
public record CreateUserRequest(
    String username,
    String email,
    String phone,
    String password
) {

}
