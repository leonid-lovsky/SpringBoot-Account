package com.example.auth.controller;

import com.example.shared.contract.AuthContract;
import com.example.shared.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController implements AuthContract {

    @Override
    public AuthResponseRegister register(AuthRequestRegister request) {
        return null;
    }

    @Override
    public AuthResponseLogin login(AuthRequestLogin request) {
        return null;
    }

    @Override
    public AuthResponseLogout logout(AuthRequestLogout request) {
        return null;
    }

    @Override
    public AuthResponseRefreshToken refreshToken(AuthRequestRefreshToken request) {
        return null;
    }
}
