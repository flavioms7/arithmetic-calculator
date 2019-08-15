package com.calculatorservice.arithmetic.rest.subtraction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.logging.Logger;

@EnableAutoConfiguration
@EnableDiscoveryClient
public class SubtractionServer {

    protected Logger logger = Logger.getLogger(SubtractionServer.class.getName());
    public static void main(String[] args) {
        System.setProperty("spring.config.name", "subtraction-server");
        SpringApplication.run(SubtractionServer.class, args);
    }
}
