package com.zcy.service;

import com.zcy.model.User;
import com.zcy.pojo.UserQueryVo;

import java.util.List;

public interface IUserService
{
    int insertUser(User user);

    int deleteUserById(int id);

    int update(User user);

    User getUserById(int id);

    List<User> getUserListByVO(UserQueryVo userVO);

    int getUserCount();
}
