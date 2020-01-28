package com.example.projectandroid_splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PracticeCtgDieren1 extends AppCompatActivity {
    private ImageButton egelbutton;
    private ImageButton ezelbutton;
    private ImageButton geitbutton;
    private ImageButton hondbutton;
    private ImageButton jakhalsbutton;
    private ImageButton katbutton;
    private ImageButton kikkerbutton;
    private ImageButton kipbutton;
    private ImageButton koebutton;
    private ImageButton konijnbutton;
    private ImageButton muisbutton;
    private ImageButton paardbutton;
    private ImageButton schaapbutton;
    private ImageButton visbutton;
    private ImageButton vogelbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_ctg_dieren1);
        getSupportActionBar().hide();

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

        hondbutton = (ImageButton) findViewById(R.id.hondimg);
        final MediaPlayer hondaudio = MediaPlayer.create(this, R.raw.dieren01_hond);
        hondbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hondaudio.start();
            }
        });

        jakhalsbutton = (ImageButton) findViewById(R.id.jakhalsimg);
        final MediaPlayer jakhalsaudio = MediaPlayer.create(this, R.raw.dieren01_jakhals);
        jakhalsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jakhalsaudio.start();
            }
        });

        katbutton = (ImageButton) findViewById(R.id.katimg);
        final MediaPlayer kataudio = MediaPlayer.create(this, R.raw.dieren01_kat);
        katbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kataudio.start();
            }
        });

        kikkerbutton = (ImageButton) findViewById(R.id.kikkerimg);
        final MediaPlayer kikkeraudio = MediaPlayer.create(this, R.raw.dieren01_kikker);
        kikkerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kikkeraudio.start();
            }
        });

        kipbutton = (ImageButton) findViewById(R.id.kipimg);
        final MediaPlayer kipaudio = MediaPlayer.create(this, R.raw.dieren01_kip);
        kipbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kipaudio.start();
            }
        });

        koebutton = (ImageButton) findViewById(R.id.koeimg);
        final MediaPlayer koeaudio = MediaPlayer.create(this, R.raw.dieren01_koe);
        koebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                koeaudio.start();
            }
        });

        konijnbutton = (ImageButton) findViewById(R.id.konijnimg);
        final MediaPlayer konijnaudio = MediaPlayer.create(this, R.raw.dieren01_konijn);
        konijnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                konijnaudio.start();
            }
        });

        muisbutton = (ImageButton) findViewById(R.id.muisimg);
        final MediaPlayer muisaudio = MediaPlayer.create(this, R.raw.dieren01_muis);
        muisbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                muisaudio.start();
            }
        });

        paardbutton = (ImageButton) findViewById(R.id.paardimg);
        final MediaPlayer paardaudio = MediaPlayer.create(this, R.raw.dieren01_paard);
        paardbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paardaudio.start();
            }
        });

        schaapbutton = (ImageButton) findViewById(R.id.schaapimg);
        final MediaPlayer schaapaudio = MediaPlayer.create(this, R.raw.dieren01_schaap);
        schaapbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                schaapaudio.start();
            }
        });

        visbutton = (ImageButton) findViewById(R.id.visimg);
        final MediaPlayer visaudio = MediaPlayer.create(this, R.raw.dieren01_vis);
        visbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visaudio.start();
            }
        });

        vogelbutton = (ImageButton) findViewById(R.id.vogelimg);
        final MediaPlayer vogelaudio = MediaPlayer.create(this, R.raw.dieren01_vogel);
        vogelbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vogelaudio.start();
            }
        });
    }
}
