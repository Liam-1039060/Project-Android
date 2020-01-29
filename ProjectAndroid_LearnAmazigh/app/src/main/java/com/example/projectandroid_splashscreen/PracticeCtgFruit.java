package com.example.projectandroid_splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PracticeCtgFruit extends AppCompatActivity {
    private ImageButton appelbutton;
    private ImageButton peerbutton;
    private ImageButton abrikoosbutton;
    private ImageButton perzikbutton;
    private ImageButton druivenbutton;
    private ImageButton watermeloenbutton;
    private ImageButton honingmeloenbutton;
    private ImageButton granaatappelbutton;
    private ImageButton vijgbutton;
    private ImageButton cactusvijgbutton;
    private ImageButton pruimbutton;
    private ImageButton sinaasappelbutton;
    private ImageButton dadelbutton;
    private ImageButton citroenbutton;
    private ImageButton bananenbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_ctg_fruit);
        getSupportActionBar().hide();

        appelbutton = (ImageButton) findViewById(R.id.appelimg);
        final MediaPlayer appelaudio = MediaPlayer.create(this, R.raw.fruit_appel);
        appelbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appelaudio.start();
            }
        });

        peerbutton = (ImageButton) findViewById(R.id.peerimg);
        final MediaPlayer peeraudio = MediaPlayer.create(this, R.raw.fruit_peer);
        peerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                peeraudio.start();
            }
        });

        abrikoosbutton = (ImageButton) findViewById(R.id.abrikoosimg);
        final MediaPlayer abrikoosaudio = MediaPlayer.create(this, R.raw.fruit_abrikoos);
        abrikoosbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrikoosaudio.start();
            }
        });

        perzikbutton = (ImageButton) findViewById(R.id.perzikimg);
        final MediaPlayer perzikaudio = MediaPlayer.create(this, R.raw.fruit_perzik);
        perzikbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                perzikaudio.start();
            }
        });

        druivenbutton = (ImageButton) findViewById(R.id.druivenimg);
        final MediaPlayer druivenaudio = MediaPlayer.create(this, R.raw.fruit_druiven);
        druivenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                druivenaudio.start();
            }
        });

        watermeloenbutton = (ImageButton) findViewById(R.id.watermeloenimg);
        final MediaPlayer watermeloenaudio = MediaPlayer.create(this, R.raw.fruit_watermeloen);
        watermeloenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                watermeloenaudio.start();
            }
        });

        honingmeloenbutton = (ImageButton) findViewById(R.id.honingmeloenimg);
        final MediaPlayer honingmeloenaudio = MediaPlayer.create(this, R.raw.fruit_honingmeloen);
        honingmeloenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                honingmeloenaudio.start();
            }
        });

        granaatappelbutton = (ImageButton) findViewById(R.id.granaatappelimg);
        final MediaPlayer granaatappelaudio = MediaPlayer.create(this, R.raw.fruit_granaatappel);
        granaatappelbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                granaatappelaudio.start();
            }
        });

        vijgbutton = (ImageButton) findViewById(R.id.vijgimg);
        final MediaPlayer vijgaudio = MediaPlayer.create(this, R.raw.fruit_vijg);
        vijgbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vijgaudio.start();
            }
        });

        cactusvijgbutton = (ImageButton) findViewById(R.id.cactusvijgimg);
        final MediaPlayer cactusvijgaudio = MediaPlayer.create(this, R.raw.fruit_cactusvijg);
        cactusvijgbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cactusvijgaudio.start();
            }
        });

        pruimbutton = (ImageButton) findViewById(R.id.pruimimg);
        final MediaPlayer pruimaudio = MediaPlayer.create(this, R.raw.fruit_pruim);
        pruimbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pruimaudio.start();
            }
        });

        sinaasappelbutton = (ImageButton) findViewById(R.id.sinaasappelimg);
        final MediaPlayer sinaasappelaudio = MediaPlayer.create(this, R.raw.fruit_sinaasappel);
        sinaasappelbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sinaasappelaudio.start();
            }
        });

        dadelbutton = (ImageButton) findViewById(R.id.dadelimg);
        final MediaPlayer dadelaudio = MediaPlayer.create(this, R.raw.fruit_dadel);
        dadelbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dadelaudio.start();
            }
        });

        citroenbutton = (ImageButton) findViewById(R.id.citroenimg);
        final MediaPlayer citroenaudio = MediaPlayer.create(this, R.raw.fruit_citroen);
        citroenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                citroenaudio.start();
            }
        });

        bananenbutton = (ImageButton) findViewById(R.id.bananenimg);
        final MediaPlayer bananenaudio = MediaPlayer.create(this, R.raw.fruit_bananen);
        bananenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bananenaudio.start();
            }
        });
    }
}
