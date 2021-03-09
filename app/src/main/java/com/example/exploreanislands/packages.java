package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class packages extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_packages);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        CardView cardA = findViewById(R.id.carda);

        cardA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(packages.this,weekendgetaway.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardB = findViewById(R.id.cardb);

        cardB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(packages.this,exoticndaman.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardC = findViewById(R.id.cardc);

        cardC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(packages.this,holidaypackage.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardD = findViewById(R.id.cardd);

        cardD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(packages.this,amazingandamanpackage.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardE = findViewById(R.id.carde);

        cardE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(packages.this,activitydelight.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardF = findViewById(R.id.cardf);

        cardF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(packages.this,blissfulpackage.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardG = findViewById(R.id.cardg);

        cardG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(packages.this,familypackage.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardH = findViewById(R.id.cardh);

        cardH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(packages.this,andamanrunaway.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardI = findViewById(R.id.cardi);

        cardI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(packages.this,exploreandaman.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardJ = findViewById(R.id.cardj);

        cardJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(packages.this,honeymoondelight.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardK = findViewById(R.id.cardk);

        cardK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(packages.this,romanticgetaway.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardL = findViewById(R.id.cardl);

        cardL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(packages.this,honeymoonescapades.class);
                startActivity(i);
                finish();
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(packages.this,MainHomeActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}