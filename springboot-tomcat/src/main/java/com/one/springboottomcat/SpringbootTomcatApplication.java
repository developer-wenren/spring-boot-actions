package com.one.springboottomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @decription war方式启动spirngboot
 * @author One
 */
@SpringBootApplication
@RestController
public class SpringbootTomcatApplication extends SpringBootServletInitializer  {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	    return builder.sources(SpringbootTomcatApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTomcatApplication.class, args);
	}


	@RequestMapping(value = "/")
	public String hello() {
		return "hello tomcat";
	}
}
