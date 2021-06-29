package com.semicolon.healthyeats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class HealthyEatsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthyEatsApplication.class, args);
    }

}
