package com.atguigu.qmall.service;

import com.atguigu.qmall.bean.UmsMember;
import com.atguigu.qmall.bean.UmsMemberReceiveAddress;

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
