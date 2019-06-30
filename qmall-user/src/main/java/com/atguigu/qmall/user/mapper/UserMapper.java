package com.atguigu.qmall.user.mapper;

import com.atguigu.qmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Auther: Anthony
 * @Date: 2019/6/27 21:54
 * @Description:
 */
public interface UserMapper extends Mapper<UmsMember>{

    List<UmsMember> selectAllUser();
}
