package com.ky.bmall.user.service.impl;

import com.ky.bmall.user.bean.UmsMember;
import com.ky.bmall.user.mapper.UserMember;
import com.ky.bmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
     @Autowired
     UserMember userMember;

     @Override
     public List<UmsMember> getAllUser() {
         List<UmsMember> umsMemberList= userMember.selectAllUser();
          return umsMemberList;
     }
}
