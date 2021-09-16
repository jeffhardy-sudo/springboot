package com.example.serverc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.SpringServletContainerInitializer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableDiscoveryClient
@SpringBootApplication
@EnableDiscoveryClient
//@EnableConfigurationProperties(value = Person.class)
@EnableSwagger2
public class ServerCApplication extends SpringServletContainerInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ServerCApplication.class, args);
    }

   /* @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }*/
}
