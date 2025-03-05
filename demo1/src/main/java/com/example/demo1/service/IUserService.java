package com.example.demo1.service;

import com.example.demo1.pojo.User;
import com.example.demo1.pojo.dto.UserDto;

public interface IUserService {
    /**
     * 插入用户
     * @param user参数
     */
    User add(UserDto user);
}
