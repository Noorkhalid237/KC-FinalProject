package com.example.mediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle D = getIntent().getExtras();

        ImageView itmImg = findViewById(R.id.imageD);
        TextView itmName = findViewById(R.id.NameD);

        Items dlv = (Items) D.getSerializable("clk");

        itmName.setText(dlv.getItemName());
        itmImg.setImageResource(dlv.getItemImage());

    }
}