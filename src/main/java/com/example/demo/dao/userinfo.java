package com.example.demo.dao;

import lombok.Data;

/**
 * Created by Administrator on 2018/9/27.
 */
@Data
public class userinfo {
    int uid;
    String uname;
    String password;

    @Override
    public String toString() {
        return "userinfo{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
