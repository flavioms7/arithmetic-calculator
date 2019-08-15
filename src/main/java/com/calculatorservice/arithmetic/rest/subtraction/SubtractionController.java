package com.calculatorservice.arithmetic.rest.subtraction;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Logger;

public class SubtractionController {

    protected Logger logger = Logger.getLogger(SubtractionController.class
            .getName());
    @RequestMapping("/subtract")
    public String doSubtract(@RequestParam(defaultValue="0") String minuend,
                             @RequestParam(defaultValue="0") String subtrahend) {
        int m = Integer.valueOf(minuend);
        int s = Integer.valueOf(subtrahend);
        int difference = m - s;
        return "{\"minuend\":\"" + minuend + "\", \"subtrahend\":\"" + subtrahend + "\", \"difference\": \"" + difference + "\"}";
    }
}
