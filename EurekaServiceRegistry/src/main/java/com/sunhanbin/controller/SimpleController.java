package com.sunhanbin.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunhanbin on 16/6/16.
 */
@RestController
public class SimpleController {

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "hello world";
    }

    @RequestMapping(value = "/ok",method = RequestMethod.GET)
    @ResponseBody
    public String ok(String name){
        return "name="+name;
    }

    public static  void  main(String[] args){
        SpringApplication.run(SimpleController.class,args);
    }

}
