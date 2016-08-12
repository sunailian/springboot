package com.sunhanbin.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sunhanbin on 16/8/12.
 */
@RestController
public class ComputeController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value="/add",method = RequestMethod.GET)
    public  String add(){
        //直接调用服务
       return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20",String.class).getBody();
    }
}
