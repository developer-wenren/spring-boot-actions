package com.one.thymeleaf.domain;

/**
 * @author One
 * @description
 * @date 2019/03/16
 */
public class User {
    private String name;
    private int age;
    private String pass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public User(String s, int i, String s1) {
        this.name = s;
        this.age = i;
        this.pass = s1;
    }
}
