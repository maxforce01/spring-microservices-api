package com.epam.models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class User implements Serializable {
    @Id
    private String id;
    private String login;
    private String url;
    private String type;

    public User() {
    }

    public User(String id, String login, String url, String type) {
        this.id = id;
        this.login = login;
        this.url = url;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", url='" + url + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}