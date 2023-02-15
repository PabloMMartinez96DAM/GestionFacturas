package com.example.gestionfacturas.db;

import com.example.gestionfacturas.models.InvoiceLineModel;

import java.util.ArrayList;

public class DAOMemoryInvoiceLine extends IDAOInvoiceLine {
    @Override
    public ArrayList<InvoiceLineModel> getByInvoiceId(int id) {

     return null;
    }

    @Override
    public double getTotal(int id) {
        ArrayList<InvoiceLineModel> list = getByInvoiceId(id);
        int sum = 0;

        for(InvoiceLineModel line : list){
            sum +=line.getTotalAmount() * line.getPrice();
        }

        return sum;
    }
}
