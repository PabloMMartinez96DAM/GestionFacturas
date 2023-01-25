package com.example.gestionfacturas.db;


import com.example.gestionfacturas.models.UserModel;

public abstract class IDAOUser {

    public abstract UserModel getById(int id);

}
