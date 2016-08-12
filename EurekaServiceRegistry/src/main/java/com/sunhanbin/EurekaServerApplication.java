package com.sunhanbin;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EnableEurekaServer标明是服务注册中心
 * Created by sunhanbin on 16/6/16.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {


    public static void main(String[] args){
        new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
    }
}
