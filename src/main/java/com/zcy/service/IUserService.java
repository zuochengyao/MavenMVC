package com.zcy.service;

import com.zcy.model.User;

public interface IUserService
{
    int insertUser(User user);

    int deleteUserById(int id);

    User getUserById(int id);
}
