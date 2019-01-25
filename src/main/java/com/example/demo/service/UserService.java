package com.example.demo.service;

import com.example.demo.dao.userinfo;
import com.github.pagehelper.PageInfo;

/**
 * Created by Administrator on 2018/9/27.
 */
public interface UserService {

    PageInfo<userinfo> findAll(int page,int pageSize);

    userinfo findById(Integer uid);

    String insert(String name);
}
