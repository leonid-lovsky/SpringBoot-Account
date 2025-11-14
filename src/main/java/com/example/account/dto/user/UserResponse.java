package com.example.account.dto.user;

public record UserResponse(
    String id,
    String username,
    String email,
    String phone
) {

}
