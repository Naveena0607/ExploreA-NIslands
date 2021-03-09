package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class hotels extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CardView cardA = findViewById(R.id.carda);

        cardA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(hotels.this,barefoot.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardB = findViewById(R.id.cardb);

        cardB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(hotels.this,silversand.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardC = findViewById(R.id.cardc);

        cardC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(hotels.this,fortuneresort.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardD = findViewById(R.id.cardd);

        cardD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(hotels.this,seashell.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardE = findViewById(R.id.carde);

        cardE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(hotels.this,symphonyre.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardF = findViewById(R.id.cardf);

        cardF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(hotels.this,wildorchid.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardG = findViewById(R.id.cardg);

        cardG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(hotels.this,bluebird.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardH = findViewById(R.id.cardh);

        cardH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(hotels.this,sinclaris.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardI = findViewById(R.id.cardi);

        cardI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(hotels.this,dolphin.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardJ = findViewById(R.id.cardj);

        cardJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(hotels.this,havelockresort.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardK = findViewById(R.id.cardk);

        cardK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(hotels.this,pearlparkbeachresort.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardL = findViewById(R.id.cardl);

        cardL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(hotels.this,tangoresort.class);
                startActivity(i);
                finish();
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(hotels.this,InsightActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}