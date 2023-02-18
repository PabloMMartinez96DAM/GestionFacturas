package com.example.gestionfacturas.models;

import java.util.Date;

public class InvoiceModel {

    // Properties

    //Id of the invoice model
    private int id;

    //Reference to the client to which belongs
    private int idClient;

    //Total amount of the invoice
    private int amount;

    //date on which the invoice was made
    private Date date;

    //Constructors

    //Default constructor
    public InvoiceModel() {
    }

    //This constructor initialize the properties of this class
    public InvoiceModel(int id, int idClient, int amount, Date date) {
        this.id = id;
        this.idClient = idClient;
        this.amount = amount;
        this.date = date;

    }

    //Getters & Setters
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


    @Override
    public String toString() {
        return "InvoiceModel{" +
                "id=" + id +
                ", idClient=" + idClient +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }

}
