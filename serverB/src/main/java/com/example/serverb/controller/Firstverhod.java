package com.example.serverb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Firstverhod {

    @ResponseBody
    @RequestMapping(value = "/test1", method = RequestMethod.POST)
    public String test(){
        System.out.println("-------------B--------------");
        return "这是服务B";
    }
}
