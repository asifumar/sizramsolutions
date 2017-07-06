package com.sizramsolutions.SizramSolutions;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Asif on 17-May-17.
 */

public class ContactusFragment extends Fragment {
    EditText et_query;


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Contact Us");
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.contactus, container, false);

        final EditText et_name = (EditText) v.findViewById(R.id.editText_name);
        final EditText et_subject = (EditText) v.findViewById(R.id.editText_subject);
        final EditText et_phone = (EditText) v.findViewById(R.id.editText_phone);
        et_query = (EditText) v.findViewById(R.id.editText_query);
        Button send = (Button)v.findViewById(R.id.button_mail);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et_name.getText().toString();
                String subject = et_subject.getText().toString();
                String phone = et_phone.getText().toString();
                String query = et_query.getText().toString();
                String[] mailid= {"info@sizrambd.com"};

                Intent intent  = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, mailid);
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                intent.putExtra(Intent.EXTRA_TEXT, "Hi," + "I'm "+ name +". My contact number is "+phone+". "+query);

                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent, "Select Mail APP"));

            }
        });

        return v;
    }

}
