package account.auth.service;

import account.auth.dto.request.LoginRequest;
import account.auth.dto.request.LogoutRequest;
import account.auth.dto.request.RefreshTokenRequest;
import account.auth.dto.request.RegisterRequest;
import account.auth.dto.response.LoginResponse;
import account.auth.dto.response.LogoutResponse;
import account.auth.dto.response.RefreshTokenResponse;
import account.auth.dto.response.RegisterResponse;
import account.auth.service.UserService;
import account.user.CreateUserRequest;
import account.user.UserResponse;
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
