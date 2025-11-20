package com.example.shared.dto;

public record AuthRequestRegister(
    String username,
    String email,
    String phone,
    String password
) {

}
