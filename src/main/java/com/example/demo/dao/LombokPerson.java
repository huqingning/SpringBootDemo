package com.example.demo.dao;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Administrator on 2018/11/30.
 */

@Slf4j
//@Setter
//@Getter
@Data  /**可以用@Data代替@Setter和@Getter，效果一样**/
public class LombokPerson {
    @Value("${name}") //获取自定义参数
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "LombokPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        LombokPerson lombokPerson = new LombokPerson();
        lombokPerson.setAge(21);
//        lombokPerson.setName("huqingning");
        System.out.println(lombokPerson);
    }
}




