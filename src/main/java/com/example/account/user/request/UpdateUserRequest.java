package com.example.account.user.request;

public record UpdateUserRequest(
    String username,
    String email,
    String phone,
    String password
) {

}
