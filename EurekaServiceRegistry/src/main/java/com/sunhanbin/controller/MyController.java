package com.sunhanbin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunhanbin on 16/6/17.
 */
@RestController
@RequestMapping(value = "/my")
public class MyController {


    @RequestMapping(value = "/yes")
    public String yes(){
        return "yes";
    }
}
