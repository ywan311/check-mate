package com.example.externalapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
@EnableR2dbcRepositories
@EnableR2dbcAuditing
public class ExternalApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExternalApiApplication.class, args);
    }

}
