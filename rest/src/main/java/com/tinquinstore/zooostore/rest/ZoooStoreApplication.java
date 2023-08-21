package com.tinquinstore.zooostore.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.tinquinstore.zooostore"})
@ComponentScan(basePackages = {"com.tinquinstore.zooostore"})
@EntityScan(basePackages = {"com.tinquinstore.zooostore.persistance.models"})
@EnableJpaRepositories(basePackages = {"com.tinquinstore.zooostore.persistance.repositories"})
public class ZoooStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZoooStoreApplication.class, args);
    }

}
