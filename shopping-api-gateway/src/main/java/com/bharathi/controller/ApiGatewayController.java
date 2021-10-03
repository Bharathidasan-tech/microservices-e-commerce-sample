package com.bharathi.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiGatewayController
{

    private Logger logger = Logger.getLogger(ApiGatewayController.class);

    @GetMapping(value = "/")
    public String home()
    {
        logger.info("Called API Gateway root API");
        return "Message from API-Gateway!!";
    }

}
