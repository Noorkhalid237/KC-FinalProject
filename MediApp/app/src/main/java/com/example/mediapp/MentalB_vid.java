package com.example.mediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MentalB_vid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mental_bvid);

        VideoView vid3 = findViewById(R.id.mental_vid);
        String videoPath3 = "android.resource://" + getPackageName() + "/" + R.raw.mentalbvid;
        Uri uri3 = Uri.parse(videoPath3);
        vid3.setVideoURI(uri3);

        MediaController mediaController3 = new MediaController(this);
        vid3.setMediaController(mediaController3);
        mediaController3.setAnchorView(vid3);
    }
}