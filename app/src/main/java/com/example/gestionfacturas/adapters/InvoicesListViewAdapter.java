package com.example.gestionfacturas.adapters;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;


import com.example.gestionfacturas.R;
import com.example.gestionfacturas.persistence.IDAOClient;
import com.example.gestionfacturas.persistence.IDAOInvoiceLine;
import com.example.gestionfacturas.fragments.DetailInvoiceFragment;
import com.example.gestionfacturas.models.ClientModel;
import com.example.gestionfacturas.models.InvoiceModel;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class InvoicesListViewAdapter extends BaseAdapter implements Filterable {

    private final ArrayList<InvoiceModel> _items;
    private final Context _context;

    private IDAOClient idaoClient = IDAOClient.getInstance();
    private IDAOInvoiceLine idaoInvoiceLine = IDAOInvoiceLine.getInstance();

    private List<InvoiceModel> _itemsFiltered;
    //private CustomFilter customFilter;

    public InvoicesListViewAdapter(Context context, @NonNull ArrayList<InvoiceModel> items) {
        _items = items;
        _context = context;
        //customFilter = new CustomFilter();
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
    public View getView(int i, View convertView, ViewGroup parent) {

        //Infar el layout del listView
        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(_context);
            convertView = inflater.inflate(R.layout.adapter_listview_invoices,parent,false);
        }

        InvoiceModel invoice = _items.get(i);
        TextView lblInvoiceCode = convertView.findViewById(R.id.lblCodigoFactura);
        TextView lblDateYear = convertView.findViewById(R.id.lblDateYear);
        TextView lblDateDay = convertView.findViewById(R.id.lblDateDay);
        TextView lblDateMonth = convertView.findViewById(R.id.lblDateMonth);
        TextView lblClient = convertView.findViewById(R.id.lblCliente);
        TextView lblTotal = convertView.findViewById(R.id.lblTotal);



        Calendar calendar = Calendar.getInstance();
        calendar.setTime(invoice.getDate());

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        String dayFormatter = String.format("%02d",day);
        String monthFormatter = new DateFormatSymbols().getShortMonths()[month];
        ClientModel client = idaoClient.getById(invoice.getId());
        double total = idaoInvoiceLine.getTotal(invoice.getId());

        lblInvoiceCode.setText(String.valueOf(invoice.getId()));
        lblDateYear.setText(String.valueOf(year));
        lblDateMonth.setText(String.valueOf(month));
        lblDateDay.setText(String.valueOf(day));
        lblClient.setText(client.getName());
        lblTotal.setText(String.valueOf(total));



        convertView.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {
            Fragment newFragment = new DetailInvoiceFragment();

            Bundle args = new Bundle();
            args.putInt("invoiceId", invoice.getId());
            newFragment.setArguments(args);


            FragmentManager fragmentManager = ((FragmentActivity)_context).getSupportFragmentManager();
            fragmentManager.beginTransaction();

            }
        });

        return convertView;
    }

    @Override
    public Filter getFilter() {
        return null;
    }
}
