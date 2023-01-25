package com.example.gestionfacturas.db;


import com.example.gestionfacturas.models.InvoiceLineModel;

public abstract class IDAOInvoiceLine {
    public abstract InvoiceLineModel getById(int id);
}
