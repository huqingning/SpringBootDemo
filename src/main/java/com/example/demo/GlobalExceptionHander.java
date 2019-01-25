package com.example.demo;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;

/**
 * 全局捕获异常处理器
 * Created by Administrator on 2018/11/29.
 */
@ControllerAdvice
public class GlobalExceptionHander {


    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> errorResult(){
        Map<String,Object> errorResultMap = new HashMap<>();
        errorResultMap.put("errorCode","500");
        errorResultMap.put("msg","哈哈哈哈系统开小差了");
        return errorResultMap;

    }
}
