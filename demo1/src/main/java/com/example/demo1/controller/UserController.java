package com.example.demo1.controller;


import com.example.demo1.pojo.ResponseMessage;
import com.example.demo1.pojo.User;
import com.example.demo1.pojo.dto.UserDto;
import com.example.demo1.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")//路由定义
public class UserController {

    @Autowired
    IUserService userService;
    //REST
    //增加
    @PostMapping
    //传入json文本自动转对象
    public ResponseMessage add(@Validated @RequestBody UserDto user){
        User userNew=userService.add(user);
        return ResponseMessage.success(userNew);
    }

    //查询

    //修改

    //删除

}
