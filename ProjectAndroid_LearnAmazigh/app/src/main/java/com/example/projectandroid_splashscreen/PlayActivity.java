package com.example.projectandroid_splashscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayActivity extends AppCompatActivity {
    private Button categorydieren1;
    private Button categoryfruit;
    private Button categoryinsecten;
    private Button categorygroente;
    private Button categorydieren2;
    private Button categoryeten;
    private Button categorykleding;
    private Button categoryweer;
    private Button categorykleuren;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        getSupportActionBar().setTitle("Kies een categorie");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        categorydieren1 = (Button) findViewById(R.id.ctgbuttondieren1);
        categorydieren1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategoryDieren1();
            }
        });

        categoryfruit = (Button) findViewById(R.id.ctgbuttonfruit);
        categoryfruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategoryFruit();
            }
        });

        categoryinsecten = (Button) findViewById(R.id.ctgbuttoninsecten);
        categoryinsecten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategoryInsecten();
            }
        });

        categorygroente = (Button) findViewById(R.id.ctgbuttongroente);
        categorygroente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategoryGroente();
            }
        });

        categorydieren2 = (Button) findViewById(R.id.ctgbuttondieren2);
        categorydieren2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategoryDieren2();
            }
        });

        categoryeten = (Button) findViewById(R.id.ctgbuttoneten);
        categoryeten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategoryEten();
            }
        });

        categorykleding = (Button) findViewById(R.id.ctgbuttonkleding);
        categorykleding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategoryKleding();
            }
        });

        categoryweer = (Button) findViewById(R.id.ctgbuttonweer);
        categoryweer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategoryWeer();
            }
        });

        categorykleuren = (Button) findViewById(R.id.ctgbuttonkleuren);
        categorykleuren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategoryKleuren();
            }
        });
    }
    public void openCategoryDieren1() {
        Intent intent = new Intent(this, PlayCtg.class);
        startActivity(intent);
    }

    public void openCategoryFruit() {
        Intent intent = new Intent(this, PlayCtg.class);
        startActivity(intent);
    }

    public void openCategoryInsecten() {
        Intent intent = new Intent(this, PlayCtg.class);
        startActivity(intent);
    }

    public void openCategoryGroente() {
        Intent intent = new Intent(this, PlayCtg.class);
        startActivity(intent);
    }

    public void openCategoryDieren2() {
        Intent intent = new Intent(this, PlayCtg.class);
        startActivity(intent);
    }

    public void openCategoryEten() {
        Intent intent = new Intent(this, PlayCtg.class);
        startActivity(intent);
    }

    public void openCategoryKleding() {
        Intent intent = new Intent(this, PlayCtg.class);
        startActivity(intent);
    }

    public void openCategoryWeer() {
        Intent intent = new Intent(this, PlayCtg.class);
        startActivity(intent);
    }

    public void openCategoryKleuren() {
        Intent intent = new Intent(this, PlayCtg.class);
        startActivity(intent);
    }
}
