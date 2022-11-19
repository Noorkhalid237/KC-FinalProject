package com.example.mediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class Anxiety_vid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anxiety_vid);

        VideoView vid1 = findViewById(R.id.anxiety_vid);
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.anxietyvid;
        Uri uri1 = Uri.parse(videoPath1);
        vid1.setVideoURI(uri1);

        MediaController mediaController1 = new MediaController(this);
        vid1.setMediaController(mediaController1);
        mediaController1.setAnchorView(vid1);
    }
}