package com.example.shared.dto;

public record UserResponse(
    String id,
    String username,
    String email,
    String phone
) {

}
