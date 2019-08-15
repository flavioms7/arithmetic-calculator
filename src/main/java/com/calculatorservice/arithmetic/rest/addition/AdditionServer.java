package com.calculatorservice.arithmetic.rest.addition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.logging.Logger;

@EnableAutoConfiguration
@EnableDiscoveryClient
public class AdditionServer {

    protected Logger logger = Logger.getLogger(AdditionServer.class.getName());
    public static void main(String[] args) {
        System.setProperty("spring.config.name", "addition-server");
        SpringApplication.run(AdditionServer.class, args);
    }
}
