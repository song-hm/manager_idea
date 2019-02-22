package com.shm.web.controller;

import com.shm.pojo.Users;
import com.shm.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: shm
 * @Date: 2019/2/22
 * @Description: com.shm.web.controller
 * @version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @RequestMapping("/addUser")
    public String addUser(Users users){

        this.usersService.addUser(users);
        return "ok";
    }
}
