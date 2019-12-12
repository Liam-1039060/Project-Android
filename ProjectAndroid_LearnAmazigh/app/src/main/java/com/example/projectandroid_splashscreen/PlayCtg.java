package com.example.projectandroid_splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PlayCtg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_ctg);
        getSupportActionBar().setTitle("[category name]");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
