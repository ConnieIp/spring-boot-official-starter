package com.oocl.web.sampleWebApp.model;

public class User {
    private static int counter=0;
    private int id;
    private String username;

    public User() {
        this.id=counter++;
    }

    public User(String username) {
        this.username = username;
        this.id=counter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
