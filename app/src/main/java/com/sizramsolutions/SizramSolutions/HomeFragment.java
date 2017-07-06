package com.sizramsolutions.SizramSolutions;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.sizramsolutions.SizramSolutions.Fragment.ProductsFragment;
import com.sizramsolutions.SizramSolutions.Tab.TabAboutus;
import com.sizramsolutions.SizramSolutions.Tab.TabServicesProducts;

/**
 * Created by Asif on 17-May-17.
 */

public class HomeFragment extends Fragment {

    FragmentManager fm;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("HomeFragment");
    }
    @Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.home, container, false);

        ImageButton clients = (ImageButton)v.findViewById(R.id.imageButtonClients);
        ImageButton career = (ImageButton)v.findViewById(R.id.imageButtonCareer);
        ImageButton services = (ImageButton)v.findViewById(R.id.imageButtonServices);
        ImageButton about = (ImageButton)v.findViewById(R.id.imageButtonAbout);
        ImageButton contact = (ImageButton)v.findViewById(R.id.imageButtonContact);
        fm = getActivity().getSupportFragmentManager();




        clients.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction= fm.beginTransaction();
                fragmentTransaction.replace(R.id.containerView, new ProductsFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        about.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction= fm.beginTransaction();
                fragmentTransaction.replace(R.id.containerView, new TabAboutus());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction= fm.beginTransaction();
                fragmentTransaction.replace(R.id.containerView, new ContactusFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

       career.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction= fm.beginTransaction();
                fragmentTransaction.replace(R.id.containerView, new CareerFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        services.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction= fm.beginTransaction();
                fragmentTransaction.replace(R.id.containerView, new TabServicesProducts());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });


        return v;
    }

}
