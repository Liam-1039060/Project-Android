package com.example.projectandroid_splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button playbutton;
    private Button practicebutton;
    private Button resultsbutton;
    private Button aboutbutton;

    DBHelper amazighDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        amazighDB = new DBHelper(this);

        playbutton = (Button) findViewById(R.id.button);
        playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayActivity();
            }
        });

        practicebutton = (Button) findViewById(R.id.button2);
        practicebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPracticeActivity();
            }
        });

        resultsbutton = (Button) findViewById(R.id.button3);
        resultsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openResultsActivity();
            }
        });

        aboutbutton = (Button) findViewById(R.id.button4);
        aboutbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutUsActivity();
            }
        });
    }

    public void openPlayActivity() {
        Intent intent = new Intent(this, PlayActivity.class);
        startActivity(intent);
    }
    public void openPracticeActivity() {
        Intent intent = new Intent(this, PracticeActivity.class);
        startActivity(intent);
    }
    public void openResultsActivity() {
        Intent intent = new Intent(this, ResultsActivity.class);
        startActivity(intent);
    }
    public void openAboutUsActivity() {
        Intent intent = new Intent(this, AboutUsActivity.class);
        startActivity(intent);
    }
}
