package com.example.projectandroid_splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PracticeCtgAnimals extends AppCompatActivity {
    private ImageButton egelbutton;
    private ImageButton ezelbutton;
    private ImageButton geitbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_ctg_animals);
        getSupportActionBar().setTitle("Dieren");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        egelbutton = (ImageButton) findViewById(R.id.egelimg);
        final MediaPlayer egelaudio = MediaPlayer.create(this, R.raw.dieren01_egel);
        egelbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                egelaudio.start();
            }
        });

        ezelbutton = (ImageButton) findViewById(R.id.ezelimg);
        final MediaPlayer ezelaudio = MediaPlayer.create(this, R.raw.dieren01_ezel);
        ezelbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ezelaudio.start();
            }
        });

        geitbutton = (ImageButton) findViewById(R.id.geitimg);
        final MediaPlayer geitaudio = MediaPlayer.create(this, R.raw.dieren01_geit);
        geitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                geitaudio.start();
            }
        });
    }
}
