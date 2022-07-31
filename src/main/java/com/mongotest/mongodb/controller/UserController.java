package com.mongotest.mongodb.controller;

import com.mongotest.mongodb.collection.User;
import com.mongotest.mongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/person")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping
    public String save(@RequestBody User user)
    {
        return userService.save(user);
    }


}
