package com.yvaine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Yvaine
 * @date 2023/05/17/21:45
 * @description
 */
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }


    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
