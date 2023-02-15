package com.example.gestionfacturas.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.gestionfacturas.R;
import com.example.gestionfacturas.db.IDAOClient;
import com.example.gestionfacturas.db.IDAOInvoiceLine;
import com.example.gestionfacturas.models.ClientModel;
import com.example.gestionfacturas.models.InvoiceModel;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;

public class FacturasListViewAdapter extends BaseAdapter {

    private final ArrayList<InvoiceModel> _items;
    private final Context _context;

    private IDAOClient idaoClient = IDAOClient.getInstance();
    private IDAOInvoiceLine idaoInvoiceLine = IDAOInvoiceLine.getInstance();

    public FacturasListViewAdapter(Context context, @NonNull ArrayList<InvoiceModel> items) {
        _items = items;
        _context = context;
    }


    @Override
    public int getCount() {
        return _items.size();
    }

    @Override
    public Object getItem(int position) {
        return  _items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        //Infar el layout del listView
        if(view == null){
            LayoutInflater inflater = LayoutInflater.from(_context);
            view = inflater.inflate(R.layout.adapter_listview_invoices,parent,false);
        }

        InvoiceModel invoice = _items.get(i);
        TextView lblInvoiceCode = view.findViewById(R.id.lblCodigoFactura);
        TextView lblDateYear = view.findViewById(R.id.lblDateYear);
        TextView lblDateDay = view.findViewById(R.id.lblDateDay);
        TextView lblDateMonth = view.findViewById(R.id.lblDateMonth);
        TextView lblClient = view.findViewById(R.id.lblCliente);
        TextView lblTotal = view.findViewById(R.id.lblTotal);



        Calendar calendar = Calendar.getInstance();
        calendar.setTime(invoice.getDate());

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        String dayFormatter = String.format("%02d",day);
        String monthFormatter = new DateFormatSymbols().getShortMonths()[month];







        return view;
    }
}
