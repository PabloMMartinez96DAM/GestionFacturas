package com.example.gestionfacturas.persistence;

import com.example.gestionfacturas.models.InvoiceModel;

import java.util.ArrayList;

public class DAOMemoryInvoice extends IDAOInvoice {
    @Override
    public InvoiceModel getById(int id) {

        for (InvoiceModel c : DataMemory.getInstance().invoiceData) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @Override
    public ArrayList<InvoiceModel> getAll() {
        return DataMemory.getInstance().invoiceData;
    }

    @Override
    public ArrayList<InvoiceModel> search(String text) {
        return null;
    }

    public static DAOMemoryInvoice getInstance() {

        if (AppConfig.mode == "MEMORY") {
            return new DAOMemoryInvoice();
        }
        if (AppConfig.mode == "FIREBASE") {
            //return new DAOFirebaseClient()
        }

        if (AppConfig.mode == "SQLLITE") {
            //return new DAOSqliteClient()
        }
        return null;

    }


}
