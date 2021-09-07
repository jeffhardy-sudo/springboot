package com.example.serverc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServerCApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerCApplication.class, args);
    }

}
