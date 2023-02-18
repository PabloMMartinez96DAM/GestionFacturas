package com.example.gestionfacturas.models;

public class ClientModel {

    // Properties

    //Id of the client
    private int id;

    //Name of the client
    private String name;

    //Constructors


    //Default constructor
    public ClientModel() {}

    //This constructor initialize the properties of this class
    public ClientModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters & Setters
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
        return "ClientModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
