package com.one.springbootehcache2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootEhcache2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEhcache2Application.class, args);
    }

}
