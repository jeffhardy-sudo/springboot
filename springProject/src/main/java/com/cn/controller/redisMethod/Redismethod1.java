package com.cn.controller.redisMethod;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@Controller
public class Redismethod1 {

    @Resource
    private RedisTemplate redisTemplate;

    @ResponseBody
    @RequestMapping(value = "/setRedis", method = RequestMethod.POST)
    public void method1(@RequestBody Map<String, Object> map){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        Set<String> key=map.keySet();
        Iterator<String> iterator=map.keySet().iterator();
        for(;iterator.hasNext();){
            valueOperations.set(iterator.next(),map.get(iterator.next()));
        }
    }

    @ResponseBody
    @RequestMapping(value = "/getRedis", method = RequestMethod.POST)
    public String method2(){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        return valueOperations.get("three").toString();
    }
}
