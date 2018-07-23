package com.example.a16022774.knowyourfacts;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.crazyhitty.chdev.ks.rssmanager.RssReader;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag2 extends Fragment {

    LinearLayout ll;
    Button btnChangeColor;


    public Frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag2, container, false);

        ll = (LinearLayout) view.findViewById(R.id.ll);
        btnChangeColor = (Button) view.findViewById(R.id.btnChangeColor);

        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rdm = new Random();
                ll.setBackgroundColor(Color.rgb(rdm.nextInt(256), rdm.nextInt(256), rdm.nextInt(256)));
            }
        });

        return view;
    }


}
