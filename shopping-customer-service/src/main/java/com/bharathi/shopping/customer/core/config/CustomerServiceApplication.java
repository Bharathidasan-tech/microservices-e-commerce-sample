package com.bharathi.shopping.customer.core.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan({ "com.bharathi.shopping.customer" })
@EntityScan("com.bharathi.shopping.customer.entity")
public class CustomerServiceApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

}
