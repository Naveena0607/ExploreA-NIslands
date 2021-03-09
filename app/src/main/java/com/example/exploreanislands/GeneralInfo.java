package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class GeneralInfo extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_info);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CardView cardA = findViewById(R.id.carda);

        cardA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GeneralInfo.this,andamanoverview.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardB = findViewById(R.id.cardb);

        cardB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GeneralInfo.this,peopleofandaman.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardC = findViewById(R.id.cardc);

        cardC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GeneralInfo.this,history.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardD = findViewById(R.id.cardd);

        cardD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GeneralInfo.this,culture.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardE= findViewById(R.id.carde);

        cardE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GeneralInfo.this,weather.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardT= findViewById(R.id.cardt);

        cardT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GeneralInfo.this,besttime.class);
                startActivity(i);
                finish();
            }
        });



    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(GeneralInfo.this,MainHomeActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}