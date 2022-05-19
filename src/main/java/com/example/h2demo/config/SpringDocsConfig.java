package com.example.h2demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocsConfig {
    private static final String desc = "Provides 4 APIs to Add, Fetch, Delete Data and Fetch By ID";
    private static final Contact CONTACT = new Contact().name("Prateek Yashaswi").email("prateekyashaswi34@gmail.com");
    private static final Info INFO = new Info().description(desc).title("CRUD Operations on Postgresql Database - Demo").version("1.0").contact(CONTACT);

    @Bean
    public OpenAPI springShopOpenAPI(){
        return new OpenAPI().info(INFO);
    }
}
