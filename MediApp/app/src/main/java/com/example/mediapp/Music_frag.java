package com.example.mediapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Music_frag extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_music_frag, container, false);

        ImageView srt1 = view.findViewById(R.id.start1);
        ImageView srt2 = view.findViewById(R.id.start2);
        ImageView srt3 = view.findViewById(R.id.start3);
        ImageView srt4 = view.findViewById(R.id.start4);
        ImageView srt5 = view.findViewById(R.id.start5);

        srt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go1 = new Intent(getActivity(), Music_P1.class);
                startActivity(go1);
                ((Activity) getActivity()).overridePendingTransition(0, 0);
            }
        });

        srt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go2 = new Intent(getActivity(), Music_P2.class);
                startActivity(go2);
                ((Activity) getActivity()).overridePendingTransition(0, 0);
            }
        });

        srt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go3 = new Intent(getActivity(), Music_P3.class);
                startActivity(go3);
                ((Activity) getActivity()).overridePendingTransition(0, 0);
            }
        });

        srt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go4 = new Intent(getActivity(), Music_P4.class);
                startActivity(go4);
                ((Activity) getActivity()).overridePendingTransition(0, 0);
            }
        });

        srt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go5 = new Intent(getActivity(), Music_P5.class);
                startActivity(go5);
                ((Activity) getActivity()).overridePendingTransition(0, 0);
            }
        });

        return view;
    }
}