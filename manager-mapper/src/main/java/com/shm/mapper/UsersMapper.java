package com.shm.mapper;

import com.shm.pojo.Users;

import java.util.List;

/**
 * @Auther: shm
 * @Date: 2019/2/17
 * @Description: com.shm.mapper
 * @version: 1.0
 */
public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}
