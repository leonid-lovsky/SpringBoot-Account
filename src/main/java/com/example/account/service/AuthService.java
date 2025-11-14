package com.example.account.service;

import com.example.account.dto.auth.*;
import com.example.account.dto.user.CreateUserRequest;
import com.example.account.dto.user.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    public RegisterResponse register(RegisterRequest request) {
        String encodedPassword = passwordEncoder.encode(request.password());

        CreateUserRequest createUserRequest = CreateUserRequest.builder()
            .username(request.username())
            .email(request.email())
            .phone(request.phone())
            .encodedPassword(encodedPassword)
            .build();

        UserResponse userResponse = userService.createUser(createUserRequest);

        return RegisterResponse.builder()
            .id(userResponse.id())
            .username(userResponse.username())
            .email(userResponse.email())
            .phone(userResponse.phone())
            .build();
    }

    public LoginResponse login(LoginRequest request) {
        return null;
    }

    public LogoutResponse logout(LogoutRequest request) {
        return null;
    }

    public RefreshTokenResponse refreshToken(RefreshTokenRequest request) {
        return null;
    }
}
