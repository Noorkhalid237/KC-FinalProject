package com.example.mediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MentalB_med extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mental_bmed);

        ImageView ply3 = findViewById(R.id.play3);

        ply3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent plly3 = new Intent(MentalB_med.this,MentalB_vid.class);
                startActivity(plly3);
            }
        });
    }
}