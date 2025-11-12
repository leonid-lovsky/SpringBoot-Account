package com.example.account.auth;

import com.example.account.auth.request.LoginRequest;
import com.example.account.auth.request.LogoutRequest;
import com.example.account.auth.request.RefreshTokenRequest;
import com.example.account.auth.request.RegisterRequest;
import com.example.account.auth.response.AuthResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    public AuthResponse register(RegisterRequest request) {
        return null;
    }

    public AuthResponse login(LoginRequest request) {
        return null;
    }

    public AuthResponse logout(LogoutRequest request) {
        return null;
    }

    public AuthResponse refreshToken(RefreshTokenRequest request) {
        return null;
    }
}
