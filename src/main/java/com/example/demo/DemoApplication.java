package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@ServletComponentScan(basePackages = "com.example.demo.*")
@RestController  //表示该类中的所有方法返回json格式，等同于@Controller+ @ResponseBody
//让spring boot自动给程序进行必要的配置，等价于以默认属性使用@Configuration，@EnableAutoConfiguration 和@ComponentScan
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        //整个程序的入口，启动Springboot项目
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("Hello CY");
    }
    @RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
    String index(){
        return "Hello Spring Boot  大大苏打实打实打算!";
    }
}
