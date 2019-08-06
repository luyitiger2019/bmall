package com.ky.bmall.user.service.impl;

import com.ky.bmall.user.bean.UmsMember;
import com.ky.bmall.user.bean.UmsMemberReceiveAddress;
import com.ky.bmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.ky.bmall.user.mapper.UserMember;
import com.ky.bmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
     @Autowired
     UserMember userMember;
     UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

     @Override
     public List<UmsMember> getAllUser() {
         List<UmsMember> umsMemberList= userMember.selectAll();
          return umsMemberList;
     }

    /**
     * 根据用户ID查询相应的收货地址
     * @param memberId
     * @return
     */
    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        // 封装的参数对象
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddresses;
    }
}
