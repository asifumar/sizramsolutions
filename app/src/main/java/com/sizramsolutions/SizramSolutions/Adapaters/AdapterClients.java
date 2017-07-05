package com.sizramsolutions.SizramSolutions.Adapaters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sizramsolutions.SizramSolutions.Fragment.SchoolManagementFragment;
import com.sizramsolutions.SizramSolutions.Fragment.WebDesignFragment;

import static com.sizramsolutions.SizramSolutions.Tab.TabClients.items_clients;


/**
 * A simple {@link Fragment} subclass.
 */
public class AdapterClients extends FragmentPagerAdapter {


    public AdapterClients(FragmentManager fm)
    {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new SchoolManagementFragment();
            case 1:
                return new WebDesignFragment();



        }
        return null;
    }

    @Override
    public int getCount() {


        return items_clients;
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "School Management";
            case 1:
                return "Web Design";

        }

        return null;
    }

}
