package com.one.springbootehcache2.service;

import com.one.springbootehcache2.domain.Person;
import org.springframework.stereotype.Service;

import javax.cache.annotation.CacheResult;

/**
 * @author One
 * @description
 * @date 2019/02/20
 */
@Service
public class PersonService {

    @CacheResult(cacheName = "people")
    public Person getPerson(int id) {
        System.out.println("未从缓存读取 " + id);
        switch (id) {
            case 1:
                return new Person(id, "Steve", "Jobs");
            case 2:
                return new Person(id, "Bill", "Gates");
            default:
                return new Person(id, "unknown", "unknown");
        }
    }
}
