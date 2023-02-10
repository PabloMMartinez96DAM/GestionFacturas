package com.example.gestionfacturas.models;

import java.util.Date;

public class InvoiceModel {

    // Properties
    private int id;
    private int idInvoice;
    private int amount;
    private Date date;

    // Constructor

    public InvoiceModel(int id, int idInvoice, int amount,Date date) {
        this.id = id;
        this.idInvoice = idInvoice;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
