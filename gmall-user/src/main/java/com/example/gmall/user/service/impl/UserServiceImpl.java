package com.example.gmall.user.service.impl;

import com.example.gmall.user.bean.UmsMember;
import com.example.gmall.user.bean.UmsMemberReceiveAddress;
import com.example.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.example.gmall.user.mapper.UserMapper;
import com.example.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Override
    public List<UmsMember> getAllUserMember() {
        return userMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> selectUmsMemberReceiveAddressByUserMemberId(String userId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(userId);
        return umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
    }
}
