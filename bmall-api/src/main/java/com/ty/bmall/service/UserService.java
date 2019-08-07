package com.ty.bmall.service;


import com.ty.bmall.bean.UmsMember;
import com.ty.bmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
