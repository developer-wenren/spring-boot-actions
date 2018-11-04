package com.one.springbootexception;

/**
 * 对返回结果的统一封装
 * 
 * @param <T>
 */
public class ResultVo<T> {
    public static final int ERROR = -1;
    public static final int FAIL = 0;
    public static final int SUCCESS = 1;
    private int status;
    private String message;
    private String timestamp = String.valueOf(System.currentTimeMillis());
    private T data;

    /**
     * 成功
     * @param t
     * @param <T>
     * @return
     */
    public static  <T> ResultVo<T> success(T t){
        ResultVo<T> response = new ResultVo<>();
        response.setStatus(SUCCESS);
        response.setMessage("SUCCESS");
        response.setData(t);
        return response;
    }

    /**
     * @return the timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * 异常
     * 
     * @param e
     * @param   <T>
     * @return
     */
    public static  <T> ResultVo<T> error(BusinessException e){
        ResultVo<T> response = new ResultVo<>();
        response.setStatus(e.getCode());
        response.setMessage(e.getMsg());
        response.setData(null);
        return response;
    }

    /**
     * 异常
     * @param e
     * @param <T>
     * @return
     */
    public static <T> ResultVo<T> error(Throwable e){
        ResultVo<T> response = new ResultVo<>();
        response.setStatus(ERROR);
        response.setMessage(e.toString());
        response.setData(null);
        return response;
    }

    /**
     * 失败
     * @param msg
     * @param <T>
     * @return
     */
    public static  <T> ResultVo<T> fail(String msg){
        ResultVo<T> response = new ResultVo<>();
        response.setStatus(FAIL);
        response.setMessage(msg);
        return response;
    }

}