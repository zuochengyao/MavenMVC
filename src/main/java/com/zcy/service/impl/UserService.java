package com.zcy.service.impl;

import com.zcy.dao.IUserDao;
import com.zcy.model.User;
import com.zcy.service.IUserService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService implements IUserService
{
    @Resource
    private IUserDao userDao;

    @Override
    public int insertUser(User user)
    {
        return userDao.insert(user);
    }

    @Override
    public int deleteUserById(int id)
    {
        return userDao.delete(id);
    }

    @Override
    public User getUserById(int id)
    {
        return userDao.get(id);
    }
}
