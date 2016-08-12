package com.sunhanbin.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sunhanbin on 16/8/12.
 */
@EnableEurekaClient  //发现服务
@LoadBalanced       //负载均衡
public class RibbonApplication {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate{
        return new RestTemplate();
    }

    public static void main(String args[]){
        SpringApplication.run(RibbonApplication.class);
    }
}
