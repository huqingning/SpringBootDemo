package com.example.demo.mapper;

import com.example.demo.dao.userinfo;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2018/9/27.
 */
public interface userinfoMapper {
    List<userinfo> findList();

    userinfo findById(Integer uid);

    int insert(userinfo userinfo);
}
