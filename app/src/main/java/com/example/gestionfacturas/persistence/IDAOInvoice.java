package com.example.gestionfacturas.persistence;


import com.example.gestionfacturas.models.InvoiceModel;

import java.util.ArrayList;

public abstract class IDAOInvoice {
    public abstract InvoiceModel getById(int id);
    public abstract ArrayList<InvoiceModel> search(String text);
    public static IDAOInvoice getInstance(){

        if(AppConfig.mode == "MEMORY"){
            return new DAOMemoryInvoice();
        }
        if(AppConfig.mode =="FIREBASE" ){
            //return new DAOFirebaseClient()
        }

        if(AppConfig.mode =="SQLLITE" ){
            //return new DAOSqliteClient()
        }
        return null;

    }


    public abstract ArrayList<InvoiceModel> getAll();
}
