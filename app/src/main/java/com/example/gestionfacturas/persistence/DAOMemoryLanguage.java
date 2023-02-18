package com.example.gestionfacturas.persistence;

import com.example.gestionfacturas.models.LanguageModel;

import java.util.ArrayList;

public class DAOMemoryLanguage extends IDOLanguage {

    @Override
    public ArrayList<LanguageModel> getAll() {
        return DataMemory.getInstance().languageData;
    }
}
