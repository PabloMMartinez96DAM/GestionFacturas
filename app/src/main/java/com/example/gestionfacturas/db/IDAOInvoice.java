package com.example.gestionfacturas.db;


import com.example.gestionfacturas.AppConfig;
import com.example.gestionfacturas.models.InvoiceModel;

public abstract class IDAOInvoice {
    public abstract InvoiceModel getById(int id);



}
