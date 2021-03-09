package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class museum extends AppCompatActivity {

    Toolbar toolbar;
    ImageView zonal,samudrika,forest,kalapani,cellular,fisheries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        zonal = findViewById(R.id.imageViewA);
        samudrika = findViewById(R.id.imageViewB);
        forest = findViewById(R.id.imageViewC);
        kalapani = findViewById(R.id.imageViewD);
        cellular = findViewById(R.id.imageViewE);
        fisheries = findViewById(R.id.imageViewF);

        zonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(museum.this, zonalmuseum.class);
                startActivity(i);
                finish();
            }
        });

        samudrika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(museum.this,samudrikamuseum.class);
                startActivity(i);
                finish();
            }
        });


        forest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(museum.this, forestmuseum.class);
                startActivity(i);
                finish();
            }
        });


        kalapani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(museum.this, kalapanimuseum.class);
                startActivity(i);
                finish();
            }
        });

        cellular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(museum.this, cellularmuseum.class);
                startActivity(i);
                finish();
            }
        });

        fisheries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(museum.this, fishersmuseum.class);
                startActivity(i);
                finish();
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            Intent i = new Intent(museum.this,InsightActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}