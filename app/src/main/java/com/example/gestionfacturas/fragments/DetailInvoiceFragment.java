package com.example.gestionfacturas.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.gestionfacturas.R;
import com.example.gestionfacturas.adapters.InvoiceLineListViewAdapter;
import com.example.gestionfacturas.persistence.IDAOClient;
import com.example.gestionfacturas.persistence.IDAOInvoice;
import com.example.gestionfacturas.persistence.IDAOInvoiceLine;
import com.example.gestionfacturas.models.ClientModel;
import com.example.gestionfacturas.models.InvoiceLineModel;
import com.example.gestionfacturas.models.InvoiceModel;

import java.util.ArrayList;

public class DetailInvoiceFragment extends Fragment {

    private ListView _listView;
    private TextView _txtInvoiceId;
    private TextView _txtClient;
    private TextView _txtTotal;
    private ArrayList<InvoiceLineModel> _elements;
    private InvoiceLineListViewAdapter _adapter;
    private InvoiceModel _invoice;
    private IDAOInvoice _idaoInvoice = IDAOInvoice.getInstance();
    private IDAOInvoiceLine _idaoInvoiceLine = IDAOInvoiceLine.getInstance();
    private IDAOClient idaoClient = IDAOClient.getInstance();


    public DetailInvoiceFragment() {
        // Required empty public constructor
    }


    public static DetailInvoiceFragment newInstance(String param1, String param2) {
        DetailInvoiceFragment fragment = new DetailInvoiceFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle args = getArguments();
        if (args != null) {
            int idInvoice = args.getInt("invoiceId");
            _invoice = _idaoInvoice.getById(idInvoice);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detail_invoice,container,false);

        _listView = view.findViewById(R.id.listView);
        _txtInvoiceId = view.findViewById(R.id.txtCodigoFactura);
        _txtClient = view.findViewById(R.id.txtCliente);
        _txtTotal = view.findViewById(R.id.txtTotal);

        ClientModel client = idaoClient.getById(_invoice.getIdClient());
        double total = _idaoInvoiceLine.getTotal(_invoice.getId());
        _txtInvoiceId.setText(String.valueOf(_txtInvoiceId));
        _txtTotal.setText(String.valueOf(total));
        _txtClient.setText(client.getName());

        _elements = _idaoInvoiceLine.getByInvoiceId(_invoice.getId());
        _adapter = new InvoiceLineListViewAdapter(getContext(),_elements);
        _listView.setAdapter(_adapter);

        return view;
    }
}