package com.example.mediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class InnerP_vid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inner_pvid);

        VideoView vid2 = findViewById(R.id.inner_vid);
        String videoPath2 = "android.resource://" + getPackageName() + "/" + R.raw.innerpvid;
        Uri uri2 = Uri.parse(videoPath2);
        vid2.setVideoURI(uri2);

        MediaController mediaController2 = new MediaController(this);
        vid2.setMediaController(mediaController2);
        mediaController2.setAnchorView(vid2);
    }
}