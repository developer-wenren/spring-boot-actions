package com.one.spring.ehcache.service;

import com.one.spring.ehcache.domain.User;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.cache.annotation.CacheResult;

/**
 * @author One
 * @description
 * @date 2019/02/18
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    @Cacheable(cacheNames = "people", key = "'user_'+#id")
    public User getFromLocalCache(Integer id) {
        System.out.println("没有从缓存中获取 User 对象");
        return new User(1, "haha", "beijing");
    }

    @Override
    @CachePut(cacheNames = "people", key = "'user_'+#user.getId()")
    public User saveUser2LocalCache(User user) {
        System.out.println("获取 User 对象并保存到本地缓存");
        return user;
    }

    @Override
    @CacheResult(cacheName = "people")
    public User getFromLocalCache2(Integer id) {
        return new User(id, "haha", "ningbo");
    }
}
