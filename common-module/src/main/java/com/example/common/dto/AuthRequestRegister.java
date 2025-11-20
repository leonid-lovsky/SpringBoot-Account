package com.example.common.dto;

public record AuthRequestRegister(
    String username,
    String email,
    String phone,
    String password
) {

}
