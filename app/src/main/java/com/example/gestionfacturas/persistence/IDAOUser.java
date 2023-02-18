package com.example.gestionfacturas.persistence;


import com.example.gestionfacturas.models.UserModel;

public abstract class IDAOUser {

    public static IDAOUser getInstance(){

        if(AppConfig.mode == "MEMORY"){
            return new DAOMemoryUser();
        }
        if(AppConfig.mode =="FIREBASE" ){
            //return new DAOFirebaseClient()
        }

        if(AppConfig.mode =="SQLLITE" ){
            //return new DAOSqliteClient()
        }
        return null;

    }

    public abstract UserModel getById(int id);

    public  abstract UserModel login(String userName, String userPass);
}
