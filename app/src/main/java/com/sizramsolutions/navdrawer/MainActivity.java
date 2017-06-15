package com.sizramsolutions.navdrawer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity{

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    FragmentManager FM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        navigationView= (NavigationView) findViewById(R.id.nav_view);

        FM= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=FM.beginTransaction();
        fragmentTransaction.replace(R.id.containerView,new Home()).commit();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                drawerLayout.closeDrawers();
                if (item.getItemId()==R.id.nav_home)
                {
                    FragmentTransaction fragmentTransaction=FM.beginTransaction();
                    fragmentTransaction.replace(R.id.containerView,new Home()).commit();

                }

                if (item.getItemId()== R.id.nav_aboutus) {
                    FragmentTransaction fragmentTransaction= FM.beginTransaction();
                    fragmentTransaction.replace(R.id.containerView, new TabAboutus()).commit();
                }

                if (item.getItemId()== R.id.nav_ourservices) {
                    FragmentTransaction fragmentTransaction= FM.beginTransaction();
                    fragmentTransaction.replace(R.id.containerView, new TabService()).commit();
                }

                if (item.getItemId()== R.id.nav_career) {
                    FragmentTransaction fragmentTransaction= FM.beginTransaction();
                    fragmentTransaction.replace(R.id.containerView, new Career()).commit();
                }

                if (item.getItemId()== R.id.nav_clients) {
                    FragmentTransaction fragmentTransaction= FM.beginTransaction();
                    fragmentTransaction.replace(R.id.containerView, new TabClients()).commit();
                }

                if (item.getItemId()== R.id.nav_contactus) {
                    FragmentTransaction fragmentTransaction= FM.beginTransaction();
                    fragmentTransaction.replace(R.id.containerView, new Contactus()).commit();
                }


                return false;
            }
        });


        android.support.v7.widget.Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.app_name,R.string.app_name);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


    }


}
