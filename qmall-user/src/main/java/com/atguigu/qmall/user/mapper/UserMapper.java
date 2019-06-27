package com.atguigu.qmall.user.mapper;

import com.atguigu.qmall.user.bean.UmsMember;

import java.util.List;

/**
 * @Auther: Anthony
 * @Date: 2019/6/27 21:54
 * @Description:
 */
public interface UserMapper {

    List<UmsMember> selectAllUser();
}
