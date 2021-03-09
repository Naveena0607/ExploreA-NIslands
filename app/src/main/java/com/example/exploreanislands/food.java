package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class food extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);


        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        CardView cardA = findViewById(R.id.carda);

        cardA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(food.this,fishcurry.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardB = findViewById(R.id.cardb);

        cardB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(food.this,kulcha.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardC = findViewById(R.id.cardc);

        cardC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(food.this,chillicurry.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardD = findViewById(R.id.cardd);

        cardD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(food.this,macherjhol.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardE = findViewById(R.id.carde);

        cardE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(food.this,coconutprown.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardF = findViewById(R.id.cardf);

        cardF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(food.this,tandoorifish.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardG = findViewById(R.id.cardg);

        cardG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(food.this,grilledlobsters.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardH = findViewById(R.id.cardh);

        cardH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(food.this,barbeques.class);
                startActivity(i);
                finish();
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            Intent i = new Intent(food.this,InsightActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}