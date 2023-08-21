package com.tinquinstore.zooostore.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.example.zooostore"})
@ComponentScan(basePackages = {"com.example.zooostore"})
@EntityScan(basePackages = {"com.example.zooostore.persistance.models"})
@EnableJpaRepositories(basePackages = {"com.example.zooostore.persistance.repositories"})
public class ZoooStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZoooStoreApplication.class, args);
    }

}