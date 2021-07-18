package com.example.ayepersistenceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableDiscoveryClient
public class AyePersistenceApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AyePersistenceApiApplication.class, args);
    }

}
