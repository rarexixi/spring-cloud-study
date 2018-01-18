package org.xi.registerservereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegistryServerEurekaApplication {
	public static void main(String[] args) {
		SpringApplication.run(RegistryServerEurekaApplication.class, args);
	}
}
