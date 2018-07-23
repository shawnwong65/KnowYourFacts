package com.example.a16022774.knowyourfacts;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag3 extends Fragment {

    LinearLayout ll;
    Button btnChangeColor;
    ImageView iv;


    public Frag3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag3, container, false);

        ll = (LinearLayout) view.findViewById(R.id.ll);
        btnChangeColor = (Button) view.findViewById(R.id.btnChangeColor);
        iv = (ImageView) view.findViewById(R.id.iv);

        String imageUrl = "https://78.media.tumblr.com/5aa1f31143d456304c228547ebb04060/tumblr_pa88s1hpc81roqv59o1_500.png";
        Picasso.with(getActivity().getBaseContext()).load(imageUrl).into(iv);

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
