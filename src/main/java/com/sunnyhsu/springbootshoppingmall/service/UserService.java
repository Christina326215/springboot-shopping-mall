package com.sunnyhsu.springbootshoppingmall.service;

import com.sunnyhsu.springbootshoppingmall.dto.UserLoginRequest;
import com.sunnyhsu.springbootshoppingmall.dto.UserRegisterRequest;
import com.sunnyhsu.springbootshoppingmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
