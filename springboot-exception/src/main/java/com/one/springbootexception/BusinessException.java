package com.one.springbootexception;

/**
 * 继承在RuntimeException，为不受检查异常<br />
 *
 *
 */
public abstract class BusinessException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    /**
     * 异常处理码
     */
    private final int code;

    /**
     * 异常消息
     */
    private final String msg;

    /**
    * JS中long类型会造成精度上的损失，因此将其转化为String类型
    */
    private final String timestamp = String.valueOf(System.currentTimeMillis());

    protected BusinessException(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    protected BusinessException(int code, String msg, Exception e) {
        super(e);
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}