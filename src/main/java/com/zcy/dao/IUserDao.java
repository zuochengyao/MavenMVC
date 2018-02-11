package com.zcy.dao;

import com.zcy.model.User;
import com.zcy.pojo.UserQueryVo;

import java.util.List;

public interface IUserDao extends IBaseDao<User>
{
    int getUserCount();

    List<User> getUserList(UserQueryVo userVO);
}
