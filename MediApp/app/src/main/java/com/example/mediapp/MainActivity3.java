package com.example.mediapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.widget.TextView;

import com.example.mediapp.databinding.ActivityMain3Binding;
import com.example.mediapp.databinding.ActivityMainBinding;

public class MainActivity3 extends AppCompatActivity {

    ActivityMain3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        changeFrag(new home_frag());

        binding.bottomnav.setOnItemSelectedListener(item -> {

            switch (item.getItemId()){

                case R.id.home:
                    changeFrag(new home_frag());
                    break;

                case R.id.shopping:
                    changeFrag(new shop_frag());
                    break;

                case R.id.music:
                    changeFrag(new Music_frag());
                    break;

                case R.id.info:
                    changeFrag(new info_frag());
                    break;

                case R.id.logout:
                    changeFrag(new logout_frag());
                    break;
            }

            return true;

        });
    }

    private void changeFrag(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();
    }
}