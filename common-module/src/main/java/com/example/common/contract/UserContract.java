package com.example.common.contract;

import com.example.common.dto.UserRequestCreate;
import com.example.common.dto.UserRequestUpdate;
import com.example.common.dto.UserResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface UserContract {

    @RequestMapping(method = RequestMethod.POST)
    UserResponse createUser(@RequestBody UserRequestCreate request);

    @RequestMapping(method = RequestMethod.GET)
    List<UserResponse> getAllUsers();

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    UserResponse getUserById(@PathVariable("id") long id);

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    UserResponse updateUser(@PathVariable("id") long id, @RequestBody UserRequestUpdate request);

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    UserResponse deleteUser(@PathVariable("id") long id);
}
