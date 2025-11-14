package com.example.account.dto.auth;

public record RegisterRequest(
    String username,
    String email,
    String phone,
    String password
) {

}
