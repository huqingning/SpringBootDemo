package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * Created by Administrator on 2018/11/30.
 */
@Component
@Aspect
public class LoggerAophander {

    private  final Logger log= LoggerFactory.getLogger(LoggerAophander.class);



    @Pointcut("execution(public * com.example.demo.*.*(..))")
    public void point(){
    }

    @Before("point()")
    public void doBefore(JoinPoint joinPoint) throws Throwable{
        //接收到请求，记录请求内容
        ServletRequestAttributes  attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //记录请求内容
        log.info("URL：" + request.getRequestURL().toString());  //请求地址
        log.info("HTTP_METHOD：" + request.getMethod()); //请求类型
        log.info("IP：" + request.getRemoteAddr()); //请求ip
        Enumeration<String> enu = request.getParameterNames();
        while (enu.hasMoreElements()){
            String name = enu.nextElement();
            log.info("name:{},value:{}",name, request.getParameter(name)); //请求参数
        }
    }

    @AfterReturning(returning = "ret",pointcut = "point()")
    public void doAfterReturning(Object ret) throws Throwable{
        log.info("response：-",ret); //返回值
    }

}
