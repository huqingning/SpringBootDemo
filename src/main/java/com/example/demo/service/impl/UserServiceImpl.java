package com.example.demo.service.impl;

import com.example.demo.dao.userinfo;
import com.example.demo.mapper.userinfoMapper;
import com.example.demo.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/9/27.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    userinfoMapper userinfoMapper;

    @Override //分页
    public PageInfo<userinfo> findAll(int page,int pageSize) {
        PageHelper.startPage(page,pageSize);  //底层实现，改写sql语句，
        List<userinfo> list = userinfoMapper.findList();
        PageInfo<userinfo> pageInfo = new PageInfo<userinfo>(list);
        return pageInfo;
    }

    @Override
    public userinfo findById(Integer uid) {
        return userinfoMapper.findById(uid);
    }

    @Override
    @Transactional  //Spring事务原理 基于aop技术，环绕通知实现
    public String insert(String name) {
        userinfo userinfo = new userinfo();
        userinfo.setUname(name);
        userinfo.setPassword("321312");
        int ret = userinfoMapper.insert(userinfo);
//        int i = 1/0;
        System.out.println(ret);
        return "SUCCESS";
    }
}
