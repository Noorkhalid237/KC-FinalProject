package com.example.mediapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class home_frag extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home_frag, container, false);

        ImageView img1 = view.findViewById(R.id.photo1);
        ImageView img2 = view.findViewById(R.id.photo2);
        ImageView img3 = view.findViewById(R.id.photo3);
        ImageView img4 = view.findViewById(R.id.photo4);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View view) {
                Intent move1 = new Intent(getActivity(), Anxiety_Med.class);
                startActivity(move1);
                ((Activity) getActivity()).overridePendingTransition(0, 0);

            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View view) {
                Intent move1 = new Intent(getActivity(), InnerP_med.class);
                startActivity(move1);
                ((Activity) getActivity()).overridePendingTransition(0, 0);

            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View view) {
                Intent move1 = new Intent(getActivity(), MentalB_med.class);
                startActivity(move1);
                ((Activity) getActivity()).overridePendingTransition(0, 0);

            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View view) {
                Intent move1 = new Intent(getActivity(), SelfL_Med.class);
                startActivity(move1);
                ((Activity) getActivity()).overridePendingTransition(0, 0);

            }
        });

        return view;

    }

}