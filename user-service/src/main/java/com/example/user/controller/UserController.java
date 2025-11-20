package com.example.user.controller;

import com.example.common.contract.UserContract;
import com.example.common.dto.UserRequestCreate;
import com.example.common.dto.UserRequestUpdate;
import com.example.common.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
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
