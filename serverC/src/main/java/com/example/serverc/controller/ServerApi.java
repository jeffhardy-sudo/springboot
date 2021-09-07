package com.example.serverc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/feign")
public class ServerApi {

    @Autowired
    EurkaUtil eurkaUtil;
    @RequestMapping("/blogName")
    public String getBlogNameByFeign() {
        System.out.println("-----------------------------------------");
        return "通过feign方式得到：" + eurkaUtil.getBlogName();
    }
}


