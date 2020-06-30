package com.example.gmall.user.controller;

import com.example.gmall.user.bean.UmsMember;
import com.example.gmall.user.bean.UmsMemberReceiveAddress;
import com.example.gmall.user.service.impl.UserServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping("getAllUserMember")
    public List<UmsMember> getAllUserMember() {
        return userService.getAllUserMember();
    }
    @RequestMapping("findUmsMemberReceiveAddressByUserMemberId")
    public List<UmsMemberReceiveAddress> findUmsMemberReceiveAddressByUserMemberId(String userId) {
        return userService.selectUmsMemberReceiveAddressByUserMemberId(userId);
    }
}
