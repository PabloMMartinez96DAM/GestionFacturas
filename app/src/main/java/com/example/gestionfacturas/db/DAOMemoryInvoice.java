package com.example.gestionfacturas.db;

import com.example.gestionfacturas.AppConfig;
import com.example.gestionfacturas.models.InvoiceModel;

public class DAOMemoryInvoice extends IDAOInvoice{
    @Override
    public InvoiceModel getById(int id) {
        return null;
    }

    public static DAOMemoryInvoice getInstance(){

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
