package com.atguigu.qmall.user.service;

import com.atguigu.qmall.user.bean.UmsMember;
import com.atguigu.qmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @Auther: Anthony
 * @Date: 2019/6/27 21:45
 * @Description:
 */
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
