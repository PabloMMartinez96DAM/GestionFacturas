package com.example.gestionfacturas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import com.example.gestionfacturas.fragments.DashboardFragment;
import com.example.gestionfacturas.fragments.LanguageFragment;
import com.example.gestionfacturas.fragments.MasterClientFragment;
import com.example.gestionfacturas.fragments.MasterInvoiceFragment;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private View _headerLayout;
    private TextView _lblUser;
    private DrawerLayout _drawerLayout;
    private NavigationView _navView;
    private Toolbar _toolbar;
    private FragmentManager _fragmentManager;
    private List<Fragment> fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Toolbar
        _toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(_toolbar);

        //Fragments
        _fragmentManager = getSupportFragmentManager();

        // Add fragments to list
        fragments.add(new DashboardFragment());
        fragments.add(new MasterClientFragment());
        fragments.add(new MasterInvoiceFragment());
        fragments.add(new LanguageFragment());

        //Display first fragment
        displayFragment(0);
        getSupportActionBar().setTitle(R.string.main_dashboard);
    }

    private void displayFragment(int pos) {

        Fragment fragment = fragments.get(pos);

        FragmentTransaction transaction = _fragmentManager.beginTransaction();
        transaction.replace(R.id.contentFrame,fragment);
        transaction.commit();

    }
}