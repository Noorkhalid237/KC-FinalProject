package com.example.mediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class InnerP_med extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inner_pmed);

        ImageView ply2 = findViewById(R.id.play2);

        ply2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent plly2 = new Intent(InnerP_med.this,InnerP_vid.class);
                startActivity(plly2);
            }
        });
    }
}