package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class InsightActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insight);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       CardView cardA = findViewById(R.id.carda);

        cardA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InsightActivity.this,Activities.class);
                startActivity(i);
                finish();
            }
        });

        CardView cardB = findViewById(R.id.cardi);

        cardB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InsightActivity.this,IsalndActivity.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardC = findViewById(R.id.cardb);

        cardC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InsightActivity.this,BeachActivity.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardF = findViewById(R.id.cardf);

        cardF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InsightActivity.this,food.class);
                startActivity(i);
                finish();
            }
        });

        CardView cardP = findViewById(R.id.cardp);

        cardP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InsightActivity.this,parksofan.class);
                startActivity(i);
                finish();
            }
        });

        CardView cardM = findViewById(R.id.cardm);

        cardM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InsightActivity.this,museum.class);
                startActivity(i);
                finish();
            }
        });

        CardView cardQ = findViewById(R.id.cardq);

        cardQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InsightActivity.this,shopping.class);
                startActivity(i);
                finish();
            }
        });

        CardView cardX = findViewById(R.id.cardx);

        cardX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InsightActivity.this,sanctuaries.class);
                startActivity(i);
                finish();
            }
        });

        CardView cardY = findViewById(R.id.cardy);

        cardY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InsightActivity.this,placesaroundportblair.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardH = findViewById(R.id.cardh);

        cardH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InsightActivity.this,hotels.class);
                startActivity(i);
                finish();
            }
        });

        CardView cardp = findViewById(R.id.cardc);

        cardp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InsightActivity.this,cafe.class);
                startActivity(i);
                finish();
            }
        });

        CardView cardV = findViewById(R.id.cardv);

        cardV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InsightActivity.this,fairsnfaesti.class);
                startActivity(i);
                finish();
            }
        });



        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            Intent i = new Intent(InsightActivity.this,MainHomeActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}