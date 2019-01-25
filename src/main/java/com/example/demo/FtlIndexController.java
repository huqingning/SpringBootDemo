package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/11/29.
 */
@Controller
public class FtlIndexController {


    @RequestMapping("/ftlIndex")
    public String ftlIndex(){
        int i = 1/0;
        System.out.println("sdsdsd");
        return "index.ftl";
    }

    @RequestMapping("/test")
    public String test(){
        return "index";
    }
}
