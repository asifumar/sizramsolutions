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
public class WebSolutionFragment extends Fragment {


    public WebSolutionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_web_solution, container, false);

        ImageButton callcenter = (ImageButton)v.findViewById(R.id.imageButtonCallCenter);
        ImageButton tender = (ImageButton)v.findViewById(R.id.imageButtonETender);
        ImageButton hospital = (ImageButton)v.findViewById(R.id.imageButtonHospital);
        ImageButton css = (ImageButton)v.findViewById(R.id.imageButtonCss);

        callcenter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Activity parentActivity = getActivity();
                Intent in = new Intent(parentActivity, CallCenterActivity.class);
                startActivity(in);
            }
        });


        tender.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Activity parentActivity = getActivity();
                Intent in = new Intent(parentActivity, TenderActivity.class);
                startActivity(in);

            }
        });


        hospital.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Activity parentActivity = getActivity();
                Intent in = new Intent(parentActivity, HospitalActivity.class);
                startActivity(in);

            }
        });


        css.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Activity parentActivity = getActivity();
                Intent in = new Intent(parentActivity, CssActivity.class);
                startActivity(in);

            }
        });
        return v;
    }

}
