package com.one.springbootshardingjdbc;

import com.one.springbootshardingjdbc.service.CommonService;
import com.one.springbootshardingjdbc.service.SpringPojoService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.one.springbootshardingjdbc.*")
@MapperScan(basePackages = "com.one.springbootshardingjdbc.repository")
@SpringBootApplication
public class SpringbootShardingjdbcApplication {

    public static void main(String[] args) {
        try (ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringbootShardingjdbcApplication.class, args)) {
            CommonService commonService = applicationContext.getBean(SpringPojoService.class);
            commonService.initEnvironment();
            commonService.processSuccess();
//            commonService.cleanEnvironment();
        }
    }

}
