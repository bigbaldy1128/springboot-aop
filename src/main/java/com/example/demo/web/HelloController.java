package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangjinzhao on 2017/5/23.
 */
@RestController
public class HelloController {
    @GetMapping("/hello/{id}")
    public String hello(@PathVariable int id)
    {
        return String.valueOf(id);
    }
}
