package com.example.projectandroid_splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PracticeCtgGroente extends AppCompatActivity {
    private ImageButton kikkererwtenbutton;
    private ImageButton linzenbutton;
    private ImageButton bonenbutton;
    private ImageButton tomaatbutton;
    private ImageButton olijvenbutton;
    private ImageButton aardappelbutton;
    private ImageButton uibutton;
    private ImageButton knoflookbutton;
    private ImageButton maisbutton;
    private ImageButton paprikabutton;
    private ImageButton pompoenbutton;
    private ImageButton wortelbutton;
    private ImageButton doperwtenbutton;
    private ImageButton tuinbonenbutton;
    private ImageButton spinaziebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_ctg_groente);
        getSupportActionBar().hide();

        kikkererwtenbutton = (ImageButton) findViewById(R.id.kikkererwtenimg);
        final MediaPlayer kikkererwtenaudio = MediaPlayer.create(this, R.raw.groente_kikkererwten);
        kikkererwtenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kikkererwtenaudio.start();
            }
        });

        linzenbutton = (ImageButton) findViewById(R.id.linzenimg);
        final MediaPlayer linzenaudio = MediaPlayer.create(this, R.raw.groente_linzen);
        linzenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linzenaudio.start();
            }
        });

        bonenbutton = (ImageButton) findViewById(R.id.bonenimg);
        final MediaPlayer bonenaudio = MediaPlayer.create(this, R.raw.groente_bonen);
        bonenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bonenaudio.start();
            }
        });

        tomaatbutton = (ImageButton) findViewById(R.id.tomaatimg);
        final MediaPlayer tomaataudio = MediaPlayer.create(this, R.raw.groente_tomaat);
        tomaatbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tomaataudio.start();
            }
        });

        olijvenbutton = (ImageButton) findViewById(R.id.olijvenimg);
        final MediaPlayer olijvenaudio = MediaPlayer.create(this, R.raw.groente_olijven);
        olijvenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                olijvenaudio.start();
            }
        });

        aardappelbutton = (ImageButton) findViewById(R.id.aardappelimg);
        final MediaPlayer aardappelaudio = MediaPlayer.create(this, R.raw.groente_aardappel);
        aardappelbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aardappelaudio.start();
            }
        });

        uibutton = (ImageButton) findViewById(R.id.uiimg);
        final MediaPlayer uiaudio = MediaPlayer.create(this, R.raw.groente_ui);
        uibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uiaudio.start();
            }
        });

        knoflookbutton = (ImageButton) findViewById(R.id.knoflookimg);
        final MediaPlayer knoflookaudio = MediaPlayer.create(this, R.raw.groente_knoflook);
        knoflookbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                knoflookaudio.start();
            }
        });

        maisbutton = (ImageButton) findViewById(R.id.maisimg);
        final MediaPlayer maisaudio = MediaPlayer.create(this, R.raw.groente_mais);
        maisbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                maisaudio.start();
            }
        });

        paprikabutton = (ImageButton) findViewById(R.id.paprikaimg);
        final MediaPlayer paprikaaudio = MediaPlayer.create(this, R.raw.groente_paprika);
        paprikabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paprikaaudio.start();
            }
        });

        pompoenbutton = (ImageButton) findViewById(R.id.pompoenimg);
        final MediaPlayer pompoenaudio = MediaPlayer.create(this, R.raw.groente_pompoen);
        pompoenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pompoenaudio.start();
            }
        });

        wortelbutton = (ImageButton) findViewById(R.id.wortelimg);
        final MediaPlayer wortelaudio = MediaPlayer.create(this, R.raw.groente_wortel);
        wortelbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wortelaudio.start();
            }
        });

        doperwtenbutton = (ImageButton) findViewById(R.id.doperwtenimg);
        final MediaPlayer doperwtenaudio = MediaPlayer.create(this, R.raw.groente_doperwten);
        doperwtenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doperwtenaudio.start();
            }
        });

        tuinbonenbutton = (ImageButton) findViewById(R.id.tuinbonenimg);
        final MediaPlayer tuinbonenaudio = MediaPlayer.create(this, R.raw.groente_tuinbonen);
        tuinbonenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tuinbonenaudio.start();
            }
        });

        spinaziebutton = (ImageButton) findViewById(R.id.spinazieimg);
        final MediaPlayer spinazieaudio = MediaPlayer.create(this, R.raw.groente_spinazie);
        spinaziebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spinazieaudio.start();
            }
        });
    }
}
