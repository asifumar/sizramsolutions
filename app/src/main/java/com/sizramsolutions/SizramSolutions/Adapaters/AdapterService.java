package com.sizramsolutions.SizramSolutions.Adapaters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sizramsolutions.SizramSolutions.Fragment.SecurityFragment;
import com.sizramsolutions.SizramSolutions.Fragment.SoftwareFragment;
import com.sizramsolutions.SizramSolutions.Fragment.TechnologyFragment;

import static com.sizramsolutions.SizramSolutions.Tab.TabService.int_items;

/**
 * A simple {@link Fragment} subclass.
 */
public class AdapterService extends FragmentPagerAdapter {


    public AdapterService(FragmentManager fm)
    {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new SoftwareFragment();
            case 1:
                return new SecurityFragment();
            case 2:
                return new TechnologyFragment();



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
                return "Software Services";
            case 1:
                return "Security Services";
            case 2:
                return "Technology Services";

        }

        return null;
    }

}
