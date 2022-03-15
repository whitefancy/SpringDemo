package com.whitefancy.demo.json;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

//此代码使用 Spring@RestController注释，它将类标记为控制器，其中每个方法都返回域对象而不是视图。
// 它是同时包含@Controller和的简写@ResponseBody。
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    //http://localhost:8080/greeting
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        //该Greeting对象必须转换为 JSON。感谢 Spring 的 HTTP 消息转换器支持，您无需手动进行此转换。
        // 因为Jackson 2在类路径上，所以会自动选择 SpringMappingJackson2HttpMessageConverter将Greeting实例转换为 JSON。
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}