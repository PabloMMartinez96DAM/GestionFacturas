package com.example.gestionfacturas.db;

import com.example.gestionfacturas.models.ClientModel;
import com.example.gestionfacturas.models.InvoiceLineModel;
import com.example.gestionfacturas.models.InvoiceModel;
import com.example.gestionfacturas.models.UserModel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DataMemory {

    public ArrayList<ClientModel> clientData;
    public ArrayList<InvoiceModel> invoiceData;
    public ArrayList<InvoiceLineModel> invoiceLineData;
    public ArrayList<UserModel> userData;

    private static DataMemory instance;

    public static DataMemory getInstance() {
        if (instance == null) {
            instance = new DataMemory();
        }
        return instance;
    }

    private DataMemory() {
        initializeUserData();
        initializeInvoiceData();
        initializeInvoiceLineData();
        initializeClientData();
    }

    private void initializeClientData() {

        this.clientData = new ArrayList<ClientModel>();
        this.clientData.add(new ClientModel(1, "Cliente 1"));
        this.clientData.add(new ClientModel(2, "Cliente 2"));
        this.clientData.add(new ClientModel(3, "Cliente 3"));
        this.clientData.add(new ClientModel(4, "Cliente 4"));
        this.clientData.add(new ClientModel(5, "Cliente 5"));
    }

    private void initializeInvoiceLineData() {
        this.invoiceLineData = new ArrayList<InvoiceLineModel>();
        this.invoiceLineData.add(new InvoiceLineModel(1, 1, 1, "Producto 1"));
        this.invoiceLineData.add(new InvoiceLineModel(2, 2, 2, "Producto 2"));
        this.invoiceLineData.add(new InvoiceLineModel(3, 3, 3, "Producto 3"));
        this.invoiceLineData.add(new InvoiceLineModel(4, 4, 4, "Producto 4"));
        this.invoiceLineData.add(new InvoiceLineModel(5, 5, 5, "Producto 5"));


    }

    private void initializeInvoiceData() {
        this.invoiceData = new ArrayList<InvoiceModel>();
        this.invoiceData.add(new InvoiceModel(1, 1, 100,new SimpleDateFormat("yyyy-MM-dd").parse("2023-02-01")));
        this.invoiceData.add(new InvoiceModel(1, 2, 200));
        this.invoiceData.add(new InvoiceModel(1, 3, 300));
        this.invoiceData.add(new InvoiceModel(1, 4, 400));
        this.invoiceData.add(new InvoiceModel(1, 5, 500));
    }

    private void initializeUserData() {

        this.userData = new ArrayList<UserModel>();
        this.userData.add(new UserModel("Pablo", "console.log()"));
        this.userData.add(new UserModel("Usuario 1", "prueba01"));
        this.userData.add(new UserModel("Usuario 2", "prueba02"));
        this.userData.add(new UserModel("Usuario 3", "prueba03"));
        this.userData.add(new UserModel("Usuario 4", "prueba04"));
        this.userData.add(new UserModel("Usuario 5", "prueba05"));
    }

}
