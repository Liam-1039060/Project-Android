package com.example.projectandroid_splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import javax.xml.transform.Result;

public class PlayCtg extends AppCompatActivity {

    private int Ran;
    private String catogoryName;
    private boolean correct;

    //Rounds
    private int Round;
    private int Lifes;

    private Button Terug;
    private Button Sound;
    private ImageView Answer1;
    private ImageView Answer2;
    private ImageView Answer3;
    private ImageView Answer4;
    private ImageView Answer5;
    private ImageView Answer6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_ctg);


        // Get bundle
        Bundle catogory = getIntent().getExtras();
        catogoryName = catogory.getString("Selected");

        getSupportActionBar().setTitle(catogoryName + "Quiz");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Give values
        Lifes = 3;
        correct= false;
        Round= 0;


        //Connecting views
        Terug = findViewById(R.id.catogorieBtn);
        Sound = findViewById(R.id.soundBtn);

        Answer1 = findViewById(R.id.Answer1);
        Answer2 = findViewById(R.id.Answer2);
        Answer3 = findViewById(R.id.Answer3);
        Answer4 = findViewById(R.id.Answer4);
        Answer5 = findViewById(R.id.Answer5);
        Answer6 = findViewById(R.id.Answer6);


        //Start Functions

        setAnswers();
        collectAnswer();

        // Buttons
        final MediaPlayer egelaudio = MediaPlayer.create(this, R.raw.dieren01_egel);
        Sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                egelaudio.start();
            }
        });

        Terug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Category = new Intent(getApplicationContext(), PlayActivity.class);
                startActivity(Category);
            }
        });
    }



    public void setAnswers(){

        // Checkking lives and round
         if(Round == 6){
             Intent Done = new Intent(getApplicationContext(), ResultsActivity.class);
             Done.putExtra("Result", Lifes);
             startActivity(Done);
         }
         if(Lifes == 0){
             Toast.makeText("GAME OVER :OO").getDuration(2000);
             Intent Done = new Intent(getApplicationContext(), ResultsActivity.class);
             Done.putExtra("Result", Lifes);
             startActivity(Done);
         }

        //Randomnise R

        Ran = new Random().nextInt(7);



        // Getting Answers

        for (int i = 0; i <= 6; i++) {
            switch (i) {
                case 1:
                    Answer1 = R.drawable.image+i;
                    if (i == Ran) {
                        correct = true;
                    }
                    break;
                case 2:
                    Answer2 = R.drawable. "image" + i;
                    if (i == Ran) {
                        correct = true;
                    }
                    break;
                case 3:
                    Answer3 = R.drawable. "image" + i;
                    if (i == Ran) {
                        correct = true;
                    }
                    break;
                case 4:
                    Answer4 = R.drawable. "image" + i;
                    if (i == Ran) {
                        correct = true;
                    }
                    break;
                case 5:
                    Answer5 = R.drawable. "image" + i;
                    if (i == Ran) {
                        correct = true;
                    }
                    break;
                case 6:
                    Answer6 = R.drawable. "image" + i;
                    if (i == Ran) {
                        correct = true;
                    }
                    break;
                    default:
                        System.out.println("Something went wrong");
            }
        }
    }


    public void collectAnswer(){

        Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(correct){
                     Round++;
                     setAnswers();
                }
                else{
                    Lifes--;
                }
            }
        });

        Answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(correct){
                    Round++;
                    setAnswers();
                }
                else{
                    Lifes--;
                }
            }
        });

        Answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(correct){
                    Round++;
                    setAnswers();
                }
                else{
                    Lifes--;
                }
            }
        });

        Answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(correct){
                    Round++;
                    setAnswers();
                }
                else{
                    Lifes--;
                }
            }
        });

        Answer5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(correct){
                    Round++;
                    setAnswers();
                }
                else{
                    Lifes--;
                }
            }
        });
        Answer6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(correct){
                    Round++;
                    setAnswers();
                }
                else{
                    Lifes--;
                }
            }
        });
    }
}
