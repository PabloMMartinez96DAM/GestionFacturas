package com.example.gestionfacturas.persistence;

import com.example.gestionfacturas.models.UserModel;

public class DAOMemoryUser extends IDAOUser{
    @Override
    public UserModel getById(int id) {
        return null;
    }
    public UserModel login(String user, String pass){
        for(UserModel u: DataMemory.getInstance().userData){
            if(u.getUser().equals(user) && u.getPassword().equals(pass)){
                return u;
            }
        }
        return null;
    }
}
