package com.shm.service.impl;

import com.shm.mapper.UsersMapper;
import com.shm.pojo.Users;
import com.shm.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: shm
 * @Date: 2019/2/22
 * @Description: com.shm.service.impl
 * @version: 1.0
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUser(Users users) {
        this.usersMapper.insertUser(users);
    }
}
