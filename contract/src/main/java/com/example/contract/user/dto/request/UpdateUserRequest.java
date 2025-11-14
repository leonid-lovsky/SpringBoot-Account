package com.example.contract.user.dto.request;

import lombok.Builder;

@Builder
public record UpdateUserRequest(
    String username,
    String email,
    String phone,
    String password
) {

}
