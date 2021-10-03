package com.bharathi.shopping.order.core.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;



@Component
@PropertySource({
        "classpath:app-config.properties" })
public class AppConfig
{

    @Value("${auth.type}")
    private String authType;

    
}
