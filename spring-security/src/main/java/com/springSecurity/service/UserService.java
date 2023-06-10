package com.springSecurity.service;



import com.springSecurity.dto.UserDto;
import com.springSecurity.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}