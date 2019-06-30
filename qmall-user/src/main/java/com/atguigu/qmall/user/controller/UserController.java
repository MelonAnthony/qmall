package com.atguigu.qmall.user.controller;

import com.atguigu.qmall.user.bean.UmsMember;
import com.atguigu.qmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.qmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: Anthony
 * @Date: 2019/6/27 21:45
 * @Description:
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList=null;
        umsMemberReceiveAddressList=userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddressList;
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMemberList=null;
        umsMemberList=userService.getAllUser();
        return umsMemberList;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }
}
