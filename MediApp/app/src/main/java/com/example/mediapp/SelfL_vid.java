package com.example.mediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class SelfL_vid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_lvid);

        VideoView vid4 = findViewById(R.id.self_vid);
        String videoPath4 = "android.resource://" + getPackageName() + "/" + R.raw.selflvid;
        Uri uri4 = Uri.parse(videoPath4);
        vid4.setVideoURI(uri4);

        MediaController mediaController4 = new MediaController(this);
        vid4.setMediaController(mediaController4);
        mediaController4.setAnchorView(vid4);
    }
}