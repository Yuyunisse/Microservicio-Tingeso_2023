package com.example.alumnoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class AlumnoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlumnoServiceApplication.class, args);
    }

}
