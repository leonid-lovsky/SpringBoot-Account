package com.example.account.user.dto.response;

public record UserResponse(
    String id,
    String username,
    String email,
    String phone
) {

}
