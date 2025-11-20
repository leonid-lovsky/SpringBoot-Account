package com.example.user.controller;

import com.example.shared.contract.UserContract;
import com.example.shared.dto.UserRequestCreate;
import com.example.shared.dto.UserRequestUpdate;
import com.example.shared.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController implements UserContract {

    @Override
    public UserResponse createUser(UserRequestCreate request) {
        return null;
    }

    @Override
    public List<UserResponse> getAllUsers() {
        return null;
    }

    @Override
    public UserResponse getUserById(long id) {
        return null;
    }

    @Override
    public UserResponse updateUser(long id, UserRequestUpdate request) {
        return null;
    }

    @Override
    public UserResponse deleteUser(long id) {
        return null;
    }
}
