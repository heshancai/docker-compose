package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 *
 * @author heshancai
 * @Package com.example.controller
 * @data 2020/11/10 10:12
 */
@RestController
@RequestMapping("/app")
public class TestController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/getMassage")
    public String getMassage(){
        Long view = stringRedisTemplate.opsForValue().increment("view");
        return "hello:view="+view;
    }

}
