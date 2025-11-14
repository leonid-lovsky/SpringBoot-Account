package account.auth.controller;

import account.auth.dto.request.LoginRequest;
import account.auth.dto.request.LogoutRequest;
import account.auth.dto.request.RefreshTokenRequest;
import account.auth.dto.request.RegisterRequest;
import account.auth.dto.response.LoginResponse;
import account.auth.dto.response.LogoutResponse;
import account.auth.dto.response.RefreshTokenResponse;
import account.auth.dto.response.RegisterResponse;
import account.auth.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest request) {
        RegisterResponse response = authService.register(request);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping("/login")
    ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {
        LoginResponse response = authService.login(request);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping("/logout")
    ResponseEntity<LogoutResponse> logout(@RequestBody LogoutRequest request) {
        LogoutResponse response = authService.logout(request);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping("/refresh-token")
    ResponseEntity<RefreshTokenResponse> refreshToken(@RequestParam RefreshTokenRequest request) {
        RefreshTokenResponse response = authService.refreshToken(request);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
