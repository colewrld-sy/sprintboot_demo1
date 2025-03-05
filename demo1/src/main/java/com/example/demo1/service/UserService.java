package com.example.demo1.service;

import com.example.demo1.pojo.User;
import com.example.demo1.pojo.dto.UserDto;
import com.example.demo1.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User add(UserDto user) {
        User userPojo=new User();

        BeanUtils.copyProperties(user,userPojo);

        //调用数据访问类
        return userRepository.save(userPojo);
    }

    @Override
    public User getUser(Integer userId) {
        return userRepository.findById(userId).orElseThrow(()->{
            throw new IllegalArgumentException("用户不存在");
        });
    }

    @Override
    public User edit(UserDto user) {

        User userPojo = new User();
        BeanUtils.copyProperties(user,userPojo);
        return userRepository.save(userPojo);
    }

    @Override
    public void delete(Integer userId) {
        userRepository.deleteById(userId);
    }


}
