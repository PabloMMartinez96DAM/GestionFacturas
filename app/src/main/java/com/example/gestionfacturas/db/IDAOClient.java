package com.example.gestionfacturas.db;

import com.example.gestionfacturas.AppConfig;
import com.example.gestionfacturas.models.ClientModel;

public abstract class IDAOClient {

    public abstract ClientModel getById(int id);

    public static IDAOClient getInstance(){

        if(AppConfig.mode == "MEMORY"){
            return new DAOMemoryClient();
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
