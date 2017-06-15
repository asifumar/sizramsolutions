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
public class WebDesignFragment extends Fragment {



    public WebDesignFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_web_design, container, false);

        ImageButton tmss = (ImageButton)v.findViewById(R.id.imageButtonTMSS);
        tmss.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Activity parentActivity = getActivity();
                Intent in = new Intent(parentActivity, TmssActivity.class);
                startActivity(in);
            }
        });

        ImageButton pundra = (ImageButton)v.findViewById(R.id.imageButtonPundra);
        pundra.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Activity parentActivity = getActivity();
                Intent in = new Intent(parentActivity, PundraActivity.class);
                startActivity(in);

            }
        });

        ImageButton mya = (ImageButton)v.findViewById(R.id.imageButtonMYA);
        pundra.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Activity parentActivity = getActivity();
                Intent in = new Intent(parentActivity, MyaActivity.class);
                startActivity(in);

            }
        });

        ImageButton embassy = (ImageButton)v.findViewById(R.id.imageButtonEmbassy);
        pundra.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Activity parentActivity = getActivity();
                Intent in = new Intent(parentActivity, EmbassyActivity.class);
                startActivity(in);

            }
        });
        return v;

    }

}
