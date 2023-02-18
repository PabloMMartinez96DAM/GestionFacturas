package com.example.gestionfacturas.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.gestionfacturas.R;
import com.example.gestionfacturas.adapters.LanguageListViewAdapter;
import com.example.gestionfacturas.models.LanguageModel;

import java.util.Arrays;
import java.util.List;


public class LanguageFragment extends Fragment {

    private View _view;
    private FragmentActivity _context;
    private ListView _listView;
    private LanguageListViewAdapter _adapter;

    //private IDAOIdioma _idaoIdioma = IDAOIdioma.GetInstance();

    public LanguageFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        _view = inflater.inflate(R.layout.fragment_language, container, false);
        return _view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        _context = getActivity();
        _listView = (ListView) _view.findViewById(R.id.listView);
        //ArrayList<ModelIdioma> idiomas = _idaoIdioma.getAll();

        List<LanguageModel> idiomas = Arrays.asList(
                new LanguageModel(1,"es", getString(R.string.espanol)),
                new LanguageModel(2,"en", getString(R.string.ingles)));

        _adapter = new LanguageListViewAdapter(_context, idiomas);
        _listView.setAdapter(_adapter);

    }
}