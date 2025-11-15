package com.example.auth.service;

import com.example.contract.auth.dto.request.LoginRequest;
import com.example.contract.auth.dto.request.LogoutRequest;
import com.example.contract.auth.dto.request.RefreshTokenRequest;
import com.example.contract.auth.dto.request.RegisterRequest;
import com.example.contract.auth.dto.response.LoginResponse;
import com.example.contract.auth.dto.response.LogoutResponse;
import com.example.contract.auth.dto.response.RefreshTokenResponse;
import com.example.contract.auth.dto.response.RegisterResponse;

public interface AuthService {

    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);

    LogoutResponse logout(LogoutRequest request);

    RefreshTokenResponse refreshToken(RefreshTokenRequest request);
}
