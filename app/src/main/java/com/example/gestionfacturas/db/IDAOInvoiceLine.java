package com.example.gestionfacturas.db;


import com.example.gestionfacturas.AppConfig;
import com.example.gestionfacturas.models.InvoiceLineModel;

public abstract class IDAOInvoiceLine {
    public abstract InvoiceLineModel getById(int id);
    public static IDAOInvoiceLine getInstance(){

        if(AppConfig.mode == "MEMORY"){
            return new DAOMemoryInvoiceLine();
        }
        if(AppConfig.mode =="FIREBASE" ){
            //return new DAOFirebaseClient()
        }

        if(AppConfig.mode =="SQLLITE" ){
            //return new DAOSqliteClient()
        }
        return null;

    }
}
