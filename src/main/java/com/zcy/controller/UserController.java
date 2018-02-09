package com.zcy.controller;

import com.zcy.model.User;
import com.zcy.service.IUserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController
{
    @Resource
    private IUserService userService;

    @RequestMapping("/manager")
    public String manager()
    {
        return "user/manager";
    }

    @RequestMapping("/insert")
    @ResponseBody
    public String insert()
    {
        User user = new User();
        user.setGender((short) 0);
        user.setUsername("Zuocy");
        user.setPassword("zuo901213");
        userService.insertUser(user);
        return "success";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(int id)
    {
        userService.deleteUserById(id);
        return "OK";
    }
}
