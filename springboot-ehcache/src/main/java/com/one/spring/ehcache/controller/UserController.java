package com.one.spring.ehcache.controller;

import com.one.spring.ehcache.domain.User;
import com.one.spring.ehcache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author One
 * @description
 * @date 2019/02/18
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/get/{id}")
    public User get(@PathVariable Integer id) {
        User user = userService.getFromLocalCache(id);
        return user;
    }

    @RequestMapping("/get2/{id}")
    public User get2(@PathVariable Integer id) {
        User user = userService.getFromLocalCache2(id);
        return user;
    }

    @RequestMapping("/save")
    public User save(User user) {
        User user1 = userService.saveUser2LocalCache(user);
        return user1;
    }
}

