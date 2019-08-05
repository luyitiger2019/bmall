package com.ky.bmall.user.service.impl;

import com.ky.bmall.user.mapper.UserMember;
import com.ky.bmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
     @Autowired
     UserMember userMember;

}
