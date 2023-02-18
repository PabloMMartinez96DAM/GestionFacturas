package com.example.gestionfacturas.models;

public class InvoiceLineModel {

    // Properties

    //Id of the invoice line model
    private int id;

    //price of all products
    private double totalAmount;

    //reference to the client which it belongs
    private int idClient;

    //Name of the product
    private String product;

    //Price of the product
    private double price;

    // Constructor


    //Default constructor
    public InvoiceLineModel() {
    }

    //This constructor initialize the properties of this class
    public InvoiceLineModel(int id, double totalAmount, int idClient, String product, double price) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.idClient = idClient;
        this.product = product;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "InvoiceLineModel{" +
                "id=" + id +
                ", totalAmount=" + totalAmount +
                ", idClient=" + idClient +
                ", product='" + product + '\'' +
                ", price=" + price +
                '}';
    }
}
