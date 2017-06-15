package com.sizramsolutions.navdrawer;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class SchoolManagementFragment extends Fragment {


    public SchoolManagementFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=  inflater.inflate(R.layout.fragment_school_management, container, false);

        ImageButton Central = (ImageButton)v.findViewById(R.id.imageButtonCentral);
        ImageButton Holy = (ImageButton)v.findViewById(R.id.imageButtonHoly);
        ImageButton Yakubia = (ImageButton)v.findViewById(R.id.imageButtonYakubia);
        ImageButton Summit = (ImageButton)v.findViewById(R.id.imageButtonSummit);

        Central.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Activity parentActivity = getActivity();
                Intent in = new Intent(parentActivity, CentralActivity.class);
                startActivity(in);
            }
        });


        Holy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Activity parentActivity = getActivity();
                Intent in = new Intent(parentActivity, HolyActivity.class);
                startActivity(in);

            }
        });


        Yakubia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Activity parentActivity = getActivity();
                Intent in = new Intent(parentActivity, YakubiaActivity.class);
                startActivity(in);

            }
        });


        Summit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Activity parentActivity = getActivity();
                Intent in = new Intent(parentActivity, SummitActivity.class);
                startActivity(in);

            }
        });
        return v;
    }

}
