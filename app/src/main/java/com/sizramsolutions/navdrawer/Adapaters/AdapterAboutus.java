package com.sizramsolutions.navdrawer.Adapaters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sizramsolutions.navdrawer.Fragment.CompanyProfileFragment;
import com.sizramsolutions.navdrawer.Fragment.MissionFragment;
import com.sizramsolutions.navdrawer.Fragment.OrganogramFragment;

import static com.sizramsolutions.navdrawer.Tab.TabService.int_items;

/**
 * A simple {@link Fragment} subclass.
 */
public class AdapterAboutus extends FragmentPagerAdapter {


    public AdapterAboutus(FragmentManager fm)
    {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new CompanyProfileFragment();
            case 1:
                return new OrganogramFragment();
            case 2:
                return new MissionFragment();



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
                return "Company Profile";
            case 1:
                return "Organogram";
            case 2:
                return "Our Mission and Vision";

        }

        return null;
    }
}
