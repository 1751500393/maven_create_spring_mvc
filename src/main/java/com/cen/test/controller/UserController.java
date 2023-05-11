package com.cen.test.controller;


import com.cen.test.entity.User;
import com.cen.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("UserController")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("test")
    public String list() {
        return "hapi";
    }

    @GetMapping("list")
    public String getList() {
        System.out.println(userService.selectList().toString());
        return userService.selectList().toString();
    }

    @PostMapping("register")
    public Integer register(@RequestBody User user) {
        Integer rows = userService.register(user);
        return rows;
    }

}
