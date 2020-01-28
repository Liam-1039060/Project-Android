package com.example.projectandroid_splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PracticeCtgDieren2 extends AppCompatActivity {
    private ImageButton patrijsbutton;
    private ImageButton uilbutton;
    private ImageButton gekkobutton;
    private ImageButton schorpioenbutton;
    private ImageButton stekelvarkenbutton;
    private ImageButton haasbutton;
    private ImageButton vosbutton;
    private ImageButton windhondbutton;
    private ImageButton hyenabutton;
    private ImageButton wildzwijnbutton;
    private ImageButton slangbutton;
    private ImageButton schildpadbutton;
    private ImageButton kameleonbutton;
    private ImageButton zwaluwbutton;
    private ImageButton duifbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_ctg_dieren2);
        getSupportActionBar().hide();

        patrijsbutton = (ImageButton) findViewById(R.id.patrijsimg);
        final MediaPlayer patrijsaudio = MediaPlayer.create(this, R.raw.dieren02_patrijs);
        patrijsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                patrijsaudio.start();
            }
        });

        uilbutton = (ImageButton) findViewById(R.id.uilimg);
        final MediaPlayer uilaudio = MediaPlayer.create(this, R.raw.dieren02_uil);
        uilbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uilaudio.start();
            }
        });

        gekkobutton = (ImageButton) findViewById(R.id.gekkoimg);
        final MediaPlayer gekkoaudio = MediaPlayer.create(this, R.raw.dieren02_gekko);
        gekkobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gekkoaudio.start();
            }
        });

        schorpioenbutton = (ImageButton) findViewById(R.id.schorpioenimg);
        final MediaPlayer schorpioenaudio = MediaPlayer.create(this, R.raw.dieren02_schorpioen);
        schorpioenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                schorpioenaudio.start();
            }
        });

        stekelvarkenbutton = (ImageButton) findViewById(R.id.stekelvarkenimg);
        final MediaPlayer stekelvarkenaudio = MediaPlayer.create(this, R.raw.dieren02_stekelvarken);
        stekelvarkenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stekelvarkenaudio.start();
            }
        });

        haasbutton = (ImageButton) findViewById(R.id.haasimg);
        final MediaPlayer haasaudio = MediaPlayer.create(this, R.raw.dieren02_haas);
        haasbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                haasaudio.start();
            }
        });

        vosbutton = (ImageButton) findViewById(R.id.vosimg);
        final MediaPlayer vosaudio = MediaPlayer.create(this, R.raw.dieren02_vos);
        vosbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vosaudio.start();
            }
        });

        windhondbutton = (ImageButton) findViewById(R.id.windhondimg);
        final MediaPlayer windhondaudio = MediaPlayer.create(this, R.raw.dieren02_windhond);
        windhondbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                windhondaudio.start();
            }
        });

        hyenabutton = (ImageButton) findViewById(R.id.hyenaimg);
        final MediaPlayer hyenaaudio = MediaPlayer.create(this, R.raw.dieren02_hyena);
        hyenabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hyenaaudio.start();
            }
        });

        wildzwijnbutton = (ImageButton) findViewById(R.id.wildzwijnimg);
        final MediaPlayer wildzwijnaudio = MediaPlayer.create(this, R.raw.dieren02_wildzwijn);
        wildzwijnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wildzwijnaudio.start();
            }
        });

        slangbutton = (ImageButton) findViewById(R.id.slangimg);
        final MediaPlayer slangaudio = MediaPlayer.create(this, R.raw.dieren02_slang);
        slangbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                slangaudio.start();
            }
        });

        schildpadbutton = (ImageButton) findViewById(R.id.schildpadimg);
        final MediaPlayer schildpadaudio = MediaPlayer.create(this, R.raw.dieren02_schildpad);
        schildpadbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                schildpadaudio.start();
            }
        });

        kameleonbutton = (ImageButton) findViewById(R.id.kameleonimg);
        final MediaPlayer kameleonaudio = MediaPlayer.create(this, R.raw.dieren02_kameleon);
        kameleonbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kameleonaudio.start();
            }
        });

        zwaluwbutton = (ImageButton) findViewById(R.id.zwaluwimg);
        final MediaPlayer zwaluwaudio = MediaPlayer.create(this, R.raw.dieren02_zwaluw);
        zwaluwbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zwaluwaudio.start();
            }
        });

        duifbutton = (ImageButton) findViewById(R.id.duifimg);
        final MediaPlayer duifaudio = MediaPlayer.create(this, R.raw.dieren02_duif);
        duifbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                duifaudio.start();
            }
        });
    }
}
