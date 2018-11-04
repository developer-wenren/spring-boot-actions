package com.one.springbootexception;



class UserNotFoundException extends BusinessException{

    private static final long serialVersionUID = 1L;

    public UserNotFoundException() {
        super(404, "用户不存在");
    }

}