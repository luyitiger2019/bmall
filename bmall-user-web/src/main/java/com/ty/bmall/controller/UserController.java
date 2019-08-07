package com.ty.bmall.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.ty.bmall.bean.UmsMember;
import com.ty.bmall.bean.UmsMemberReceiveAddress;
import com.ty.bmall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Reference
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
