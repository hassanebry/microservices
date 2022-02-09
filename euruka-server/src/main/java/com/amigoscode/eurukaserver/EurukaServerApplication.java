package com.amigoscode.eurukaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class EurukaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurukaServerApplication.class, args);
    }
}
