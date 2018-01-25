package org.xi.service.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
@EnableEurekaClient
@SpringBootApplication
public class UserServiceApplication {
    public static void main( String[] args ) {
        SpringApplication.run(UserServiceApplication.class, args);
    }
}
