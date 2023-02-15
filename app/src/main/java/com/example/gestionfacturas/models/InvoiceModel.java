package com.example.gestionfacturas.models;

import java.util.Date;

public class InvoiceModel {

    // Properties
    private int id;
    private int idClient;
    private int amount;
    private Date date;

    // Constructor

    public InvoiceModel(int id, int idClient, int amount, Date date) {
        this.id = id;
        this.idClient = idClient;
        this.amount = amount;
        this.date = date;

    }

    // Methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
