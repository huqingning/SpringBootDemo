package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/11/30.
 */
@Service
@Slf4j
public class MemberService {


    @Async //异步调用，这个方法重新开启一个线程执行
    public String addMemeber(){
        log.info("2");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("3");

        return "huqingning";
    }


}
