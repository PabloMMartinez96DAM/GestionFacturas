package com.example.gestionfacturas.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.gestionfacturas.R;
import com.example.gestionfacturas.adapters.InvoicesListViewAdapter;
import com.example.gestionfacturas.persistence.IDAOInvoice;
import com.example.gestionfacturas.models.InvoiceModel;

import java.util.ArrayList;


public class MasterClientFragment extends Fragment {


    private ListView _listView;
    private ArrayList<InvoiceModel> _elements;
    private InvoicesListViewAdapter _adapter;
    private IDAOInvoice _idaoFactura = IDAOInvoice.getInstance();




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_master_client,container,false);
        //_listView = view.findViewById(R.id.listView);
        _elements = _idaoFactura.getAll();
        _adapter = new InvoicesListViewAdapter(getContext(),_elements);
        _listView.setAdapter(_adapter);


        return view;

    }
}