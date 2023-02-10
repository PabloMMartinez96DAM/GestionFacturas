package com.example.gestionfacturas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


import com.example.gestionfacturas.fragments.DashboardFragment;
import com.example.gestionfacturas.fragments.LanguageFragment;
import com.example.gestionfacturas.fragments.MasterClientFragment;
import com.example.gestionfacturas.fragments.MasterInvoiceFragment;
import com.example.gestionfacturas.models.UserModel;
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

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Toolbar
        _toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(_toolbar);

        //Fragments
        _fragmentManager = getSupportFragmentManager();

        //Add fragments to list
        fragments.add(new DashboardFragment());
        fragments.add(new MasterClientFragment());
        fragments.add(new MasterInvoiceFragment());
        fragments.add(new LanguageFragment());

        //Display first fragment
        displayFragment(0);
        getSupportActionBar().setTitle(R.string.main_dashboard);

        UserModel user = (UserModel) getIntent().getSerializableExtra("user");

        //Get layouts

        _navView = (NavigationView) findViewById(R.id.menu_naview);
        _navView.setNavigationItemSelectedListener(new NavView_OnNavigationItemSelectedListener());
        _headerLayout = _navView.getHeaderView(0);


        //Toogle DrawerLayout
        _drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,_drawerLayout,_toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        _drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


    }

    private void displayFragment(int pos) {

        Fragment fragment = fragments.get(pos);

        FragmentTransaction transaction = _fragmentManager.beginTransaction();
        transaction.replace(R.id.contentFrame,fragment);
        transaction.commit();

    }


    private class NavView_OnNavigationItemSelectedListener implements NavigationView.OnNavigationItemSelectedListener{
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){

                case R.id.menu_dashBoard:
                    getSupportActionBar().setTitle("DASHBOARD");
                    displayFragment(0);
                    break;

                case R.id.menu_client:
                    getSupportActionBar().setTitle("CLIENTES");
                    displayFragment(0);
                    break;

                case R.id.menu_invoices:
                    getSupportActionBar().setTitle("FACTURAS");
                    displayFragment(0);
                    break;

                case R.id.menu_language:
                    getSupportActionBar().setTitle("IDIOMA");
                    displayFragment(0);
                    break;

                default:
                    android.os.Process.killProcess(android.os.Process.myPid());
                    System.exit(1);
                    break;

            }
            _drawerLayout.closeDrawers();
            return true;
        }
    }

}