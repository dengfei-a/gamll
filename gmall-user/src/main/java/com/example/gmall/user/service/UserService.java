package com.example.gmall.user.service;

import com.example.gmall.user.bean.UmsMember;
import com.example.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUserMember();

    List<UmsMemberReceiveAddress> selectUmsMemberReceiveAddressByUserMemberId(String userId);
}
