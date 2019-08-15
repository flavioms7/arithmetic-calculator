package com.calculatorservice.arithmetic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@Service
public class WebAdditionService {

    @Autowired
    @LoadBalanced
    protected RestTemplate restTemplate;
    protected String serviceUrl;
    protected Logger logger = Logger.getLogger(WebAdditionService.class
            .getName());
    public WebAdditionService(String serviceUrl) {
        this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
                : "http://" + serviceUrl;
    }
    public String add(String addend1, String addend2) {
        return restTemplate.getForObject(serviceUrl + "/add?addend1={addend1}&addend2={addend2}", String.class, addend1, addend2);
    }
}
