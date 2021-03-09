package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import java.util.Objects;

public class IsalndActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isalnd);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CardView cardA = findViewById(R.id.carda);

        cardA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IsalndActivity.this,portbllair.class);
                startActivity(i);
                finish();
            }
        });

        CardView cardB = findViewById(R.id.cardb);
        cardB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IsalndActivity.this,havelockisland.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardC = findViewById(R.id.cardc);

        cardC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IsalndActivity.this,neilisalnd.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardD = findViewById(R.id.cardd);

        cardD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IsalndActivity.this,batarangisland.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardE = findViewById(R.id.carde);

        cardE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IsalndActivity.this,mayabunderisalnd.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardF = findViewById(R.id.cardf);

        cardF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IsalndActivity.this,digilpurisalnd.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardG = findViewById(R.id.cardg);

        cardG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IsalndActivity.this,littleandamanlsland.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardH = findViewById(R.id.cardh);

        cardH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IsalndActivity.this,longisland.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardI = findViewById(R.id.cardi);

        cardI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IsalndActivity.this,middleisland.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardJ = findViewById(R.id.cardj);

        cardJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IsalndActivity.this,barrenisalnd.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardK = findViewById(R.id.cardk);

        cardK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IsalndActivity.this,rangatisalnd.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardL = findViewById(R.id.cardl);

        cardL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IsalndActivity.this,rossisalnd.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardM = findViewById(R.id.cardm);

        cardM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IsalndActivity.this,viperisalnd.class);
                startActivity(i);
                finish();
            }
        });
        CardView cardN = findViewById(R.id.cardn);

        cardN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IsalndActivity.this,chathamisalnd.class);
                startActivity(i);
                finish();
            }
        });



    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(IsalndActivity.this,InsightActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}