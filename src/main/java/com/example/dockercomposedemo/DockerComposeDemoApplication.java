package com.example.dockercomposedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class DockerComposeDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerComposeDemoApplication.class, args);
    }

}
