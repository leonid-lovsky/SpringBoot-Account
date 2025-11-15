package com.example.auth.service;

import com.example.contract.auth.dto.request.LoginRequest;
import com.example.contract.auth.dto.request.LogoutRequest;
import com.example.contract.auth.dto.request.RefreshTokenRequest;
import com.example.contract.auth.dto.request.RegisterRequest;
import com.example.contract.auth.dto.response.LoginResponse;
import com.example.contract.auth.dto.response.LogoutResponse;
import com.example.contract.auth.dto.response.RefreshTokenResponse;
import com.example.contract.auth.dto.response.RegisterResponse;
import com.example.contract.user.client.UserClient;
import com.example.contract.user.dto.request.CreateUserRequest;
import com.example.contract.user.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserClient userClient;
    private final PasswordEncoder passwordEncoder;

    @Override
    public RegisterResponse register(RegisterRequest request) {
        String encodedPassword = passwordEncoder.encode(request.password());

        CreateUserRequest createUserRequest = CreateUserRequest.builder()
            .username(request.username())
            .email(request.email())
            .phone(request.phone())
            .password(encodedPassword)
            .build();

        UserResponse userResponse = userClient.createUser(createUserRequest);

        return RegisterResponse.builder()
            .id(userResponse.id())
            .username(userResponse.username())
            .email(userResponse.email())
            .phone(userResponse.phone())
            .build();
    }

    @Override
    public LoginResponse login(LoginRequest request) {
        return null;
    }

    @Override
    public LogoutResponse logout(LogoutRequest request) {
        return null;
    }

    @Override
    public RefreshTokenResponse refreshToken(RefreshTokenRequest request) {
        return null;
    }
}
