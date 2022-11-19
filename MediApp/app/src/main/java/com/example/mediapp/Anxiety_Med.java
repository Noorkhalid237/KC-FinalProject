package com.example.mediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Anxiety_Med extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anxiety_med);

        ImageView ply1 = findViewById(R.id.play1);

        ply1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent plly1 = new Intent(Anxiety_Med.this,Anxiety_vid.class);
                startActivity(plly1);
            }
        });
    }
}