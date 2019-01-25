package com.example.demo;

import com.example.demo.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/11/30.
 */
@RestController
@Slf4j
public class MemberController {

    @Autowired
    MemberService memberService;


    @RequestMapping("/addMember")
    public String addMember(){
        log.info("1");
        String result = memberService.addMemeber();
        log.info("4");
        return result;
    }

}
