package com.example.account.auth;

import com.example.account.auth.dto.request.LoginRequest;
import com.example.account.auth.dto.request.LogoutRequest;
import com.example.account.auth.dto.request.RefreshTokenRequest;
import com.example.account.auth.dto.request.RegisterRequest;
import com.example.account.auth.dto.response.LoginResponse;
import com.example.account.auth.dto.response.LogoutResponse;
import com.example.account.auth.dto.response.RefreshTokenResponse;
import com.example.account.auth.dto.response.RegisterResponse;

public interface AuthService {

    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);

    LogoutResponse logout(LogoutRequest request);

    RefreshTokenResponse refreshToken(RefreshTokenRequest request);
}
