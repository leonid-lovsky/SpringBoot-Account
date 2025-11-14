package com.example.account.dto.user;

public record UpdateUserRequest(
    String username,
    String email,
    String phone,
    String password
) {

}
