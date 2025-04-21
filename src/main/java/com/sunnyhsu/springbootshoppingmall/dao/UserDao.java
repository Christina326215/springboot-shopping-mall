package com.sunnyhsu.springbootshoppingmall.dao;

import com.sunnyhsu.springbootshoppingmall.dto.UserRegisterRequest;
import com.sunnyhsu.springbootshoppingmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
