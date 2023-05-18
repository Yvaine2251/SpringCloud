package com.yvaine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Yvaine
 * @date 2023/05/17/19:15
 * @description
 */
@SpringBootApplication
@EnableEurekaServer
public class eurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(eurekaApplication.class,args);
    }
}
