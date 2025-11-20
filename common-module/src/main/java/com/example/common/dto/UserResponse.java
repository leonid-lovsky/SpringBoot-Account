package com.example.common.dto;

public record UserResponse(
    String id,
    String username,
    String email,
    String phone
) {

}
