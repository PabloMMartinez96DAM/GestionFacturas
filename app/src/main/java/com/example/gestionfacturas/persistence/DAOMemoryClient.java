package com.example.gestionfacturas.persistence;

import com.example.gestionfacturas.models.ClientModel;

public class DAOMemoryClient extends IDAOClient{

    @Override
    public ClientModel getById(int id) {
        for (ClientModel c: DataMemory.getInstance().clientData) {
            if (c.getId() == id){
                return c;
            }
        }
        return null;
    }
}
