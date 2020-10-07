package org.example.controller;

import org.example.entity.RespBean;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/findUser")
    public RespBean findUser(@RequestParam(value = "username", required = false) String username,
                             @RequestParam(value = "password", required = false) String password){
        return null != userService.findUser(username, password) ? RespBean.ok("okay", userService.findUser(username, password)) : RespBean.error();
    }
}
