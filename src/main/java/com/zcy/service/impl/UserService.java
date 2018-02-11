package com.zcy.service.impl;

import com.zcy.dao.IUserDao;
import com.zcy.model.User;
import com.zcy.pojo.UserQueryVo;
import com.zcy.service.IUserService;

import org.springframework.stereotype.Service;

import java.util.List;

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
    public int update(User user)
    {
        return userDao.update(user);
    }

    @Override
    public User getUserById(int id)
    {
        return userDao.get(id);
    }

    @Override
    public List<User> getUserListByVO(UserQueryVo userVO)
    {
        List<User> users = userDao.getUserList(userVO);
        return users;
    }

    @Override
    public int getUserCount()
    {
        return userDao.getUserCount();
    }
}
