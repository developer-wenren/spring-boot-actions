package com.one.spring.ehcache.service;

import com.one.spring.ehcache.domain.User;

/**
 * ${DESCRIPTION}
 * One on 2019-02-18.
 */
public interface UserService {

    User getFromLocalCache(Integer id);
    User saveUser2LocalCache(User user);
    User getFromLocalCache2(Integer id);
}
