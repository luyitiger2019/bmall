package com.ky.bmall.user.controller;

import com.ky.bmall.user.bean.UmsMember;
import com.ky.bmall.user.bean.UmsMemberReceiveAddress;
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
    @RequestMapping("getAddressByMemberId")
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId)
    {
        List<UmsMemberReceiveAddress> receiveAddress = userService.getReceiveAddressByMemberId(memberId);
        return receiveAddress;
    }
    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser()
    {
         List<UmsMember> umsMember= userService.getAllUser();
         return umsMember;
    }
}
