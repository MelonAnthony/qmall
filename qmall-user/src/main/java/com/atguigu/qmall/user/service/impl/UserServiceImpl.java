package com.atguigu.qmall.user.service.impl;

import com.atguigu.qmall.user.bean.UmsMember;
import com.atguigu.qmall.user.mapper.UserMapper;
import com.atguigu.qmall.user.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Anthony
 * @Date: 2019/6/27 21:46
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList=userMapper.selectAllUser();
        return umsMemberList;
    }
}
