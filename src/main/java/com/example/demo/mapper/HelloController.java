package com.example.demo.mapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String aaa(@RequestParam("name")String name){
        log.info("请求锦鲤啊aaaaaxxxxxxhot-fix11111"+name);
        return "Hello ,Spring"+name;
    }
}
