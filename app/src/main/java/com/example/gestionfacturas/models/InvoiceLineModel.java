package com.example.gestionfacturas.models;

public class InvoiceLineModel {

    // Properties
    private int id;
    private double totalAmount;
    private int idClient;

    private String product;

// Constructor
    public InvoiceLineModel(int id, double totalAmount, int idClient, String product) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.idClient = idClient;
        this.product = product;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
