package com.ky.bmall.user.service;

import com.ky.bmall.user.bean.UmsMember;
import com.ky.bmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
