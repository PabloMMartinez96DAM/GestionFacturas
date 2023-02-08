package com.example.gestionfacturas.db;


import com.example.gestionfacturas.AppConfig;
import com.example.gestionfacturas.models.InvoiceModel;

public abstract class IDAOInvoice {
    public abstract InvoiceModel getById(int id);
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


}
