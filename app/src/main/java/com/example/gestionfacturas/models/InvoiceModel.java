package com.example.gestionfacturas.models;

public class InvoiceModel {

    // Properties
    private int id;
    private int idInvoice;
    private int amount;


    // Constructor

    public InvoiceModel(int id, int idInvoice, int amount) {
        this.id = id;
        this.idInvoice = idInvoice;
        this.amount = amount;
    }

    // Methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(int idInvoice) {
        this.idInvoice = idInvoice;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
