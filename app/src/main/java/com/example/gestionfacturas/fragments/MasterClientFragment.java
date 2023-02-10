package com.example.gestionfacturas.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.gestionfacturas.R;
import com.example.gestionfacturas.adapters.FacturasListViewAdapter;
import com.example.gestionfacturas.db.IDAOInvoice;
import com.example.gestionfacturas.models.InvoiceModel;

import java.util.ArrayList;


public class MasterClientFragment extends Fragment {


    private ListView _listView;
    private ArrayList<InvoiceModel> _elements;
    private FacturasListViewAdapter _adapter;
    private IDAOInvoice _idaoFactura = IDAOInvoice.getInstance();




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_master_client,container,false);
        _listView = view.findViewById(R.id.listView);
        _elements = _idaoFactura.getAll();
        _adapter = new FacturasListViewAdapter(getContext(),_elements);
        _listView.setAdapter(_adapter);


        return view;

    }
}