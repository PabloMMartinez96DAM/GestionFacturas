package com.example.gestionfacturas.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.annotation.NonNull;

import com.example.gestionfacturas.R;
import com.example.gestionfacturas.models.InvoiceLineModel;

import java.util.ArrayList;

public class InvoiceLineListViewAdapter extends BaseAdapter {

    private final ArrayList<InvoiceLineModel> _items;
    private final Context _context;

    public InvoiceLineListViewAdapter(Context context, @NonNull ArrayList<InvoiceLineModel> items) {
        _context = context;
        _items = items;
    }


    @Override
    public int getCount() {
        return _items.size();
    }

    @Override
    public Object getItem(int position) {
        return _items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null ){
            LayoutInflater inflater = LayoutInflater.from(_context);
            convertView = inflater.inflate(R.layout.adapter_listview_invoices,parent,false);
        }

        InvoiceLineModel invoiceLineModel = _items.get(position);

        //TextView lblCantidad = convertView.findViewById(R.id.lblCantidad);
        //TextView lblProducto = convertView.findViewById(R.id.lblProducto);
        //TextView lblPrecio = convertView.findViewById(R.id.lblPrecio);

        //lblCantidad.steText(String.valueOf(invoiceLine.getTotal()));
        //lblProducto.steText(String.valueOf(invoiceLine.getProduct()));
        //lblPrecio.steText(String.valueOf(invoiceLine.getPrecio()));

        return convertView;
    }
}
