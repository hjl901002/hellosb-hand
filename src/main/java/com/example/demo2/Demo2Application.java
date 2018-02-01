package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chao.du on 2018/02/01.
 */
@RestController
@SpringBootApplication
public class Demo2Application {
    @RequestMapping("/")
    public String getHome(){
        return "hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class,args);
    }
}
