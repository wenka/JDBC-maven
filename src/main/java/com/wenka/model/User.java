package com.wenka.model;

import java.util.Date;

/**
 * 用户
 */
public class User extends BaseModel {

    private String username;

    private String password;

    private Date createTime = new Date();

    private boolean active;

    private Integer status;

    public User(){

    }

    public User(String username, String password,boolean active, Integer status) {
        this.username = username;
        this.password = password;
        this.active = active;
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + this.getId() + '\'' +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", createTime=" + createTime +
                ", active=" + active +
                ", status=" + status +
                '}';
    }
}
