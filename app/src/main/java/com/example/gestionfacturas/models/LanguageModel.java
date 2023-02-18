package com.example.gestionfacturas.models;

public class LanguageModel {

    //Properties
    private int id;
    private String countryCode;
    private String description;

    //Constructors

    //Default constructor without parameters
    public LanguageModel() {}

    //This constructor initialize the properties of this class
    public LanguageModel(int id, String countryCode, String description) {
        this.id = id;
        this.countryCode = countryCode;
        this.description = description;
    }

    //Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
