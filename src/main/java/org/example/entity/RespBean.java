package org.example.entity;

public class RespBean {
    private Integer status; // 状态 200 500
    private String message; // 返回的描述消息
    private Object object; // 返回到前端的数据

    public static RespBean ok(){
        return new RespBean(200, null, null);
    }
    public static RespBean ok(String message){
        return new RespBean(200, message, null);
    }
    public static RespBean ok(Object object){
        return new RespBean(200, null, null);
    }
    public static RespBean ok(String message, Object object){
        return new RespBean(200, message, object);
    }

    public static RespBean error(){
        return new RespBean(500, null, null);
    }
    public static RespBean error(String message){
        return new RespBean(500, message, null);
    }
    public static RespBean error(Object object){
        return new RespBean(500, null, null);
    }
    public static RespBean error(String message, Object object){
        return new RespBean(500, message, object);
    }

    private RespBean() {
    }

    private RespBean(Integer status, String message, Object object) {
        this.status = status;
        this.message = message;
        this.object = object;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
