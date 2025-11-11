package com.kapil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching // to enable caching in Spring Boot application
public class Main {
        public static void main(String[] args) {
            SpringApplication.run(Main.class, args);
    }
}
