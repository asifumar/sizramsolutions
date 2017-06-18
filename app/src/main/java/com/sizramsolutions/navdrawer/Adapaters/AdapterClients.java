package com.sizramsolutions.navdrawer.Adapaters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sizramsolutions.navdrawer.Fragment.SchoolManagementFragment;
import com.sizramsolutions.navdrawer.Fragment.WebDesignFragment;
import com.sizramsolutions.navdrawer.Fragment.WebSolutionFragment;

import static com.sizramsolutions.navdrawer.Tab.TabService.int_items;


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
                return new WebSolutionFragment();
            case 1:
                return new SchoolManagementFragment();
            case 2:
                return new WebDesignFragment();



        }
        return null;
    }

    @Override
    public int getCount() {


        return int_items;
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "Customized Web Solution";
            case 1:
                return "School Management";
            case 2:
                return "Web Design";

        }

        return null;
    }

}
