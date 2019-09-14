package com.bdqn.pojo;

import java.io.Serializable;

/**
 * ClassName: User
 * create by:  xyf
 * description: TODO
 * create time: 2019/9/14 0014 下午 5:58
 */
public class User implements Serializable {
    private static final long serialVersionUID = 4807726701244811618L;
    private int id;
    private String name;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
