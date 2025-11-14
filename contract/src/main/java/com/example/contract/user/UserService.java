package com.example.contract.user;

import com.example.contract.user.dto.request.CreateUserRequest;
import com.example.contract.user.dto.request.UpdateUserRequest;
import com.example.contract.user.dto.response.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(CreateUserRequest request);

    List<UserResponse> getAllUsers();

    UserResponse getUserById(Long id);

    UserResponse updateUser(Long id, UpdateUserRequest request);

    UserResponse deleteUser(Long id);
}
