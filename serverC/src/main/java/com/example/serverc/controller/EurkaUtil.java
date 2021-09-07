package com.example.serverc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurkaUtil {

    @Autowired
    private RestTemplate restTemplate;


   @ResponseBody
   @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String getBlogName(){
       System.out.println("--------c------------------");
        String s1= restTemplate.postForObject("http://localhost:8001/test1",null, String.class);
        return s1;
    }

    @ResponseBody
    @RequestMapping(value = "/test2", method = RequestMethod.POST)
    public String getBlogName2(){
        System.out.println("--------c2------------------");
        String s1= restTemplate.postForObject("http://serverB/test1",null, String.class);
        return s1;
    }
}
