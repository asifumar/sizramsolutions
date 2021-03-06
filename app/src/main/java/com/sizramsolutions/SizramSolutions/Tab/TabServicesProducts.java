package com.sizramsolutions.SizramSolutions.Tab;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sizramsolutions.SizramSolutions.Adapaters.AdapterServicesProducts;
import com.sizramsolutions.SizramSolutions.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabServicesProducts extends Fragment {

    public  static TabLayout tabLayout;
    public  static ViewPager viewPager;
    public static int items_service_products= 2;



    public TabServicesProducts() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_services_products,null);
        tabLayout=(TabLayout)v.findViewById(R.id.tabs);
        viewPager=(ViewPager)v.findViewById(R.id.viewpager);
        //set an adpater

        viewPager.setAdapter(new AdapterServicesProducts( getChildFragmentManager()));

        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
            }
        });
        return v;
    }

}
