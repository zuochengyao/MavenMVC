package com.zcy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class WebController
{
    // host:port/home/hello
    @RequestMapping("/hello")
    public String helloMVC()
    {
        return "hello"; // hello.jsp
    }
}
