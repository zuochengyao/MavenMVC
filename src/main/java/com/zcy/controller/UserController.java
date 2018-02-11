package com.zcy.controller;

import com.zcy.model.User;
import com.zcy.pojo.UserQueryVo;
import com.zcy.service.IUserService;
import com.zcy.util.Utils;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController
{
    @Resource
    private IUserService userService;

    @RequestMapping("/manager")
    public String manager(UserQueryVo userVo, Model model) throws UnsupportedEncodingException
    {
        // 乱码
        if (!Utils.isEmpty(userVo.getUsername()))
            userVo.setUsername(new String(userVo.getUsername().getBytes("iso8859-1"), "utf-8"));
        // 计算分页
        userVo.setStart((userVo.getCurrentageIndex() - 1) * userVo.getPageSize());
        List<User> users = userService.getUserListByVO(userVo);
        int count = userService.getUserCount();
        model.addAttribute("users", users);
        model.addAttribute("id", userVo.getId());
        model.addAttribute("userName", userVo.getUsername());
        model.addAttribute("password", userVo.getPassword());
        model.addAttribute("gender", userVo.getGender());
        model.addAttribute("userCount", count);
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
        return "OK";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(int id)
    {
        userService.deleteUserById(id);
        return "OK";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update(User user)
    {
        userService.update(user);
        return "OK";
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(int id)
    {
        User user = userService.getUserById(id);
        return user;
    }
}
