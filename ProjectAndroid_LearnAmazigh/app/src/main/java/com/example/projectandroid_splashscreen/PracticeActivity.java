package com.example.projectandroid_splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PracticeActivity extends AppCompatActivity {
    private Button category1;
    private Button category2;
    private Button category3;
    private Button category4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);
        getSupportActionBar().setTitle("Kies een categorie");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        category1 = (Button) findViewById(R.id.ctgbutton1);
        category1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategory1();
            }
        });

        category2 = (Button) findViewById(R.id.ctgbutton2);
        category2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategory2();
            }
        });

        category3 = (Button) findViewById(R.id.ctgbutton3);
        category3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategory3();
            }
        });

        category4 = (Button) findViewById(R.id.ctgbutton4);
        category4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategory4();
            }
        });
    }

    public void openCategory1() {
        Intent intent = new Intent(this, PracticeCtgAnimals.class);
        startActivity(intent);
    }

    public void openCategory2() {
        Intent intent = new Intent(this, PracticeCtg.class);
        startActivity(intent);
    }

    public void openCategory3() {
        Intent intent = new Intent(this, PracticeCtg.class);
        startActivity(intent);
    }

    public void openCategory4() {
        Intent intent = new Intent(this, PracticeCtg.class);
        startActivity(intent);
    }
}
