package com.example.demo;

import com.example.demo.dao.userinfo;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018/8/18.
 */
@RestController
public class HelloWorldController {
    private  final Logger log= LoggerFactory.getLogger(HelloWorldController.class);

    @Value("${name}") //获取自定义参数
    private String name;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/hello/{id}/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable Integer id,@PathVariable String name){
        System.out.println(id);
        return "hello world!";
    }

    @RequestMapping(value = "/find/{page}/{pageSize}", method = RequestMethod.GET)
    public String find(@PathVariable Integer page,@PathVariable Integer pageSize){
        PageInfo<userinfo> userinfo =  userService.findAll(page,pageSize);
        return userinfo.toString();
    }

    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public String findById(@PathVariable Integer id){
        userinfo userinfo =  userService.findById(id);
//        log.info("日志打印成功");
        return userinfo.toString();
    }

    @RequestMapping(value = "/insert/{name}", method = RequestMethod.GET)
    public String insertUser(@PathVariable String name){

        return userService.insert(name);
    }


}
