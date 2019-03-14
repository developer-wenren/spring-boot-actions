package com.one.web;

import com.one.web.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/web")
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

    @RequestMapping("/saveUser")
    public void saveUser(@Valid User user, BindingResult bindingResult) {
        System.out.println("user: " + user);
        if (bindingResult.hasErrors()) {
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            for (ObjectError error : allErrors) {
                System.out.println(error.getCode() + ":" + error.getDefaultMessage());
            }
        }
    }

}
