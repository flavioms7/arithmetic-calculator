package com.calculatorservice.arithmetic;

import com.calculatorservice.arithmetic.registrations.EurekaServer;
import com.calculatorservice.arithmetic.rest.addition.AdditionServer;
import com.calculatorservice.arithmetic.rest.subtraction.SubtractionServer;
import com.calculatorservice.arithmetic.web.WebServer;

public class Main {
    public static void main(String[] args) {

        String serverName = "";

        switch (args.length) {
            case 2:
                System.setProperty("server.port", args[1]);
            case 1:
                serverName = args[0].toLowerCase();
                break;

            default:
                return;
        }

        if (serverName.equals("eureka")) {
            EurekaServer.main(args);
        } else if (serverName.equals("addition")) {
            AdditionServer.main(args);
        } else if (serverName.equals("subtraction")) {
            SubtractionServer.main(args);
        } else if (serverName.equals("web")) {
            WebServer.main(args);
        } else {
            System.out.println("Unknown server type: " + serverName);
        }
    }
}
