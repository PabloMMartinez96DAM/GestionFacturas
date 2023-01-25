package com.example.gestionfacturas.models;

public class UserModel {

    // Properties
    private String user;
    private String password;


    // Constructor

    public UserModel(String user, String password) {
        this.user = user;
        this.password = password;
    }

    // Getters & Setters

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
