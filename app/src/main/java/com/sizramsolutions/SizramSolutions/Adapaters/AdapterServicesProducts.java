package com.sizramsolutions.SizramSolutions.Adapaters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sizramsolutions.SizramSolutions.Fragment.ProductsFragment;
import com.sizramsolutions.SizramSolutions.Fragment.ServicesFragment;

import static com.sizramsolutions.SizramSolutions.Tab.TabServicesProducts.items_service_products;

/**
 * A simple {@link Fragment} subclass.
 */
public class AdapterServicesProducts extends FragmentPagerAdapter {


    public AdapterServicesProducts(FragmentManager fm)
    {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ServicesFragment();
            case 1:
                return new ProductsFragment();



        }
        return null;
    }

    @Override
    public int getCount() {


        return items_service_products;
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "Services";
            case 1:
                return "Products";

        }

        return null;
    }

}
