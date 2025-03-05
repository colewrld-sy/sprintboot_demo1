package com.example.demo1.service;

import com.example.demo1.pojo.User;
import com.example.demo1.pojo.dto.UserDto;

public interface IUserService {
    /**
     * 插入用户
     * @param user参数
     */
    User add(UserDto user);

    /**
     * 查询用户
     * @param userId
     * @return
     */
    User getUser(Integer userId);

    /**
     * 修改信息
     * @param user
     * @return
     */
    User edit(UserDto user);

    /**
     * 删除用户
     * @param userId
     * @return
     */
    void delete(Integer userId);
}
