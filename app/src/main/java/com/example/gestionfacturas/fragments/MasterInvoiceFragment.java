package com.example.gestionfacturas.fragments;

import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.gestionfacturas.R;
import com.example.gestionfacturas.adapters.InvoicesListViewAdapter;
import com.example.gestionfacturas.models.InvoiceModel;
import com.example.gestionfacturas.persistence.IDAOInvoice;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;


public class MasterInvoiceFragment extends Fragment {

    private FloatingActionButton _fabInsertar;
    private ListView _listView;
    private ArrayList<InvoiceModel> _elements;
    private InvoicesListViewAdapter _adapter;
    private IDAOInvoice idaoInvoice = IDAOInvoice.getInstance();


    //Constructor
    public MasterInvoiceFragment() {
    }


    public static MasterInvoiceFragment newInstance(String param1, String param2) {
        MasterInvoiceFragment fragment = new MasterInvoiceFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Get the reference of the toolbar from the activityMain
        Toolbar toolbar = getActivity().findViewById(R.id.toolbar);

        //Configure the search logic
        SearchView searchView = toolbar.findViewById(R.id.search_view);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                _adapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_master_invoice, container, false);
    }
}