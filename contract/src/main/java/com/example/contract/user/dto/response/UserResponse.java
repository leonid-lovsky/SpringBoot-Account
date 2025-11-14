package com.example.contract.user.dto.response;

public record UserResponse(
    String id,
    String username,
    String email,
    String phone
) {

}
