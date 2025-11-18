// package com.example.auth;
//
//
// import lombok.RequiredArgsConstructor;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.stereotype.Service;
//
// @Service
// @RequiredArgsConstructor
// public class AuthService implements AuthService {
//
//     private final UserClient userClient;
//     private final PasswordEncoder passwordEncoder;
//
//     @Override
//     public RegisterResponse register(RegisterRequest request) {
//         String encodedPassword = passwordEncoder.encode(request.password());
//
//         CreateUserRequest createUserRequest = CreateUserRequest.builder()
//             .username(request.username())
//             .email(request.email())
//             .phone(request.phone())
//             .password(encodedPassword)
//             .build();
//
//         UserResponse userResponse = userClient.createUser(createUserRequest);
//
//         return RegisterResponse.builder()
//             .id(userResponse.id())
//             .username(userResponse.username())
//             .email(userResponse.email())
//             .phone(userResponse.phone())
//             .build();
//     }
//
//     @Override
//     public LoginResponse login(LoginRequest request) {
//         return null;
//     }
//
//     @Override
//     public LogoutResponse logout(LogoutRequest request) {
//         return null;
//     }
//
//     @Override
//     public RefreshTokenResponse refreshToken(RefreshTokenRequest request) {
//         return null;
//     }
// }
