package com.bitcamp.web.java.servlet.day02;

public class UserVO {

    //F
    private String id;
    private String pwd;
    private boolean active;

    //C
    public UserVO() {
    }

    //M

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", active=" + active +
                '}';
    }
}

