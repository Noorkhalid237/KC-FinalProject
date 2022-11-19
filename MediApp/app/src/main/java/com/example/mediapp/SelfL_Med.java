package com.example.mediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SelfL_Med extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_lmed);

        ImageView ply4 = findViewById(R.id.play4);

        ply4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent plly4 = new Intent(SelfL_Med.this,SelfL_vid.class);
                startActivity(plly4);
            }
        });
    }
}