package com.example.gestionfacturas.persistence;

import com.example.gestionfacturas.models.LanguageModel;

import java.util.ArrayList;

public abstract class IDOLanguage {

    public abstract ArrayList<LanguageModel> getAll();

    public static IDOLanguage GetInstance()
    {
        if (AppConfig.mode == "MEMORY")
        {
            return new DAOMemoryLanguage();
        }
        if (AppConfig.mode == "FIREASE")
        {
            //return new DAOFirebaseIdioma();
        }
        if (AppConfig.mode == "SQLITE")
        {
            //return new DAOSQLiteIdioma();
        }
        return null;
    }
}
