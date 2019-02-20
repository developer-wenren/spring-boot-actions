package com.one.springbootehcache2.controller;

import com.one.springbootehcache2.domain.Person;
import com.one.springbootehcache2.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author One
 * @description
 * @date 2019/02/20
 */
@RequestMapping("/person")
@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/get")
    public Person getPerson(int id) {
        Person person = personService.getPerson(id);
        System.out.println("读取到数据 " + person.getFirstName() + "," + person.getLastName());
        return person;
    }
}
