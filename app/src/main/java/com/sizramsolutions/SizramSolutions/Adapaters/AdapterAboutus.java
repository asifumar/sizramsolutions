package com.sizramsolutions.SizramSolutions.Adapaters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sizramsolutions.SizramSolutions.Fragment.CompanyProfileFragment;
import com.sizramsolutions.SizramSolutions.Fragment.MissionFragment;
import com.sizramsolutions.SizramSolutions.Fragment.OrganogramFragment;

import static com.sizramsolutions.SizramSolutions.Tab.TabAboutus.items_aboutus;

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


        return items_aboutus;
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
