package com.whitefancy.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication是一个方便的注释，它添加了以下所有内容：
//
//@Configuration: 将类标记为应用程序上下文的 bean 定义源。
//
//@EnableAutoConfiguration：告诉 Spring Boot 根据类路径设置、其他 bean 和各种属性设置开始添加 bean。例如，如果spring-webmvc位于类路径上，则此注释将应用程序标记为 Web 应用程序并激活关键行为，例如设置DispatcherServlet.
//
//@ComponentScan: 告诉 Spring 在包中查找其他组件、配置和服务com/example，让它找到控制器。
@SpringBootApplication
@RestController
public class MallDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallDemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
