package com.example.gestionfacturas.models;

import java.io.Serializable;

public class UserModel implements Serializable {

    // Properties

    //Nickname of the user
    private String user;

    //User´s password
    private String password;


    // Constructor


    //Default constructor
    public UserModel() { }

    //This constructor initialize the properties of this class
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


    @Override
    public String toString() {
        return "UserModel{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
