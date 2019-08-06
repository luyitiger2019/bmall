package com.ky.bmall.user.controller;

import com.ky.bmall.user.bean.UmsMember;
import com.ky.bmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("index")
    @ResponseBody
    public String index()
    {
        return "hello 老虎";
    }
    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser()
    {
         List<UmsMember> umsMember= userService.getAllUser();
         return umsMember;
    }
}
