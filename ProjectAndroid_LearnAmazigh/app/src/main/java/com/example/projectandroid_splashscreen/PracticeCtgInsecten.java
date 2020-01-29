package com.example.projectandroid_splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PracticeCtgInsecten extends AppCompatActivity {
    private ImageButton slakbutton;
    private ImageButton regenwormbutton;
    private ImageButton larvebutton;
    private ImageButton vliegbutton;
    private ImageButton bijbutton;
    private ImageButton mugbutton;
    private ImageButton mierbutton;
    private ImageButton vlinderbutton;
    private ImageButton spinbutton;
    private ImageButton sprinkhaanbutton;
    private ImageButton rupsbutton;
    private ImageButton wespbutton;
    private ImageButton naaktslakbutton;
    private ImageButton bloedzuigerbutton;
    private ImageButton bidsprinkhaanbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_ctg_insecten);
        getSupportActionBar().hide();

        slakbutton = (ImageButton) findViewById(R.id.slakimg);
        final MediaPlayer slakaudio = MediaPlayer.create(this, R.raw.insecten_slak);
        slakbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                slakaudio.start();
            }
        });

        regenwormbutton = (ImageButton) findViewById(R.id.regenwormimg);
        final MediaPlayer regenwormaudio = MediaPlayer.create(this, R.raw.insecten_regenworm);
        regenwormbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                regenwormaudio.start();
            }
        });

        larvebutton = (ImageButton) findViewById(R.id.larveimg);
        final MediaPlayer larveaudio = MediaPlayer.create(this, R.raw.insecten_larve);
        larvebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                larveaudio.start();
            }
        });

        vliegbutton = (ImageButton) findViewById(R.id.vliegimg);
        final MediaPlayer vliegaudio = MediaPlayer.create(this, R.raw.insecten_vlieg);
        vliegbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vliegaudio.start();
            }
        });

        bijbutton = (ImageButton) findViewById(R.id.bijimg);
        final MediaPlayer bijaudio = MediaPlayer.create(this, R.raw.insecten_bij);
        bijbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bijaudio.start();
            }
        });

        mugbutton = (ImageButton) findViewById(R.id.mugimg);
        final MediaPlayer mugaudio = MediaPlayer.create(this, R.raw.insecten_mug);
        mugbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mugaudio.start();
            }
        });

        mierbutton = (ImageButton) findViewById(R.id.mierimg);
        final MediaPlayer mieraudio = MediaPlayer.create(this, R.raw.insecten_mier);
        mierbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mieraudio.start();
            }
        });

        vlinderbutton = (ImageButton) findViewById(R.id.vlinderimg);
        final MediaPlayer vlinderaudio = MediaPlayer.create(this, R.raw.insecten_vlinder);
        vlinderbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vlinderaudio.start();
            }
        });

        spinbutton = (ImageButton) findViewById(R.id.spinimg);
        final MediaPlayer spinaudio = MediaPlayer.create(this, R.raw.insecten_spin);
        spinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spinaudio.start();
            }
        });

        sprinkhaanbutton = (ImageButton) findViewById(R.id.sprinkhaanimg);
        final MediaPlayer sprinkhaanaudio = MediaPlayer.create(this, R.raw.insecten_sprinkhaan);
        sprinkhaanbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sprinkhaanaudio.start();
            }
        });

        rupsbutton = (ImageButton) findViewById(R.id.rupsimg);
        final MediaPlayer rupsaudio = MediaPlayer.create(this, R.raw.insecten_rups);
        rupsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rupsaudio.start();
            }
        });

        wespbutton = (ImageButton) findViewById(R.id.wespimg);
        final MediaPlayer wespaudio = MediaPlayer.create(this, R.raw.insecten_wesp);
        wespbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wespaudio.start();
            }
        });

        naaktslakbutton = (ImageButton) findViewById(R.id.naaktslakimg);
        final MediaPlayer naaktslakaudio = MediaPlayer.create(this, R.raw.insecten_naaktslak);
        naaktslakbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naaktslakaudio.start();
            }
        });

        bloedzuigerbutton = (ImageButton) findViewById(R.id.bloedzuigerimg);
        final MediaPlayer bloedzuigeraudio = MediaPlayer.create(this, R.raw.insecten_bloedzuiger);
        bloedzuigerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bloedzuigeraudio.start();
            }
        });

        bidsprinkhaanbutton = (ImageButton) findViewById(R.id.bidsprinkhaanimg);
        final MediaPlayer bidsprinkhaanaudio = MediaPlayer.create(this, R.raw.insecten_bidsprinkhaan);
        bidsprinkhaanbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bidsprinkhaanaudio.start();
            }
        });
    }
}
