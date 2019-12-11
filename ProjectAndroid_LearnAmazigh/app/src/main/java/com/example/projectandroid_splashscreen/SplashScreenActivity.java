package com.example.projectandroid_splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        EasySplashScreen config = new EasySplashScreen(SplashScreenActivity.this)
                .withFullScreen()
                .withBackgroundResource(R.drawable.amazighlogo2)
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(4000);

        View easySplashScreen = config.create();
        setContentView(easySplashScreen);
    }
}
