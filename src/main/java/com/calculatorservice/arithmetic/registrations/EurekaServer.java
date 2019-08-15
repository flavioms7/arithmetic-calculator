package com.calculatorservice.arithmetic.registrations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //spins up a registry server that other applications can talk to
public class EurekaServer {

        public static void main(String[] args) {
            //Tells Spring Boot to look for the file registrations-server.properties for its configuration
            System.setProperty("spring.config.name", "eureka-server");
            SpringApplication.run(EurekaServer.class, args);
        }
}
