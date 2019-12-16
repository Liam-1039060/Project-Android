package com.example.projectandroid_splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayCtg extends AppCompatActivity {

    private Button Terug;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_ctg);
        getSupportActionBar().setTitle("[category name]");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Giving

        Terug = findViewById(R.id.catogorieBtn);


        Terug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Category = new Intent(getApplicationContext(), PlayActivity.class);
                startActivity(Category);
            }
        });
    }

    //Buttons




}
