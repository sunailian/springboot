package com.sunhanbin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by sunhanbin on 16/8/4.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {


    public static  void main(String[] args){
        SpringApplication.run(EurekaClientApplication.class);
    }
}
