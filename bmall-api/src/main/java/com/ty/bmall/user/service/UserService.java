package com.ty.bmall.user.service;


import com.ty.bmall.user.bean.UmsMember;
import com.ty.bmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
