package com.one.spring.ehcache.domain;

import java.io.Serializable;

/**
 * @author One
 * @description
 * @date 2019/02/18
 */
public class User implements Serializable {
    private Integer id;
    private String name;
    private String address;

    public User() {
    }

    public User(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
