package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class parasailing extends AppCompatActivity {

    TextView tex,textview;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parasailing);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        tex= findViewById(R.id.perfectsea);
        tex.setText("  1. Havelock Island\n" +
                "  2. North Bay Island\n" +
                "  3 .Port Blair");
        tex.setTextColor(Color.BLACK);

        textview = findViewById(R.id.seamain);
        textview.setText("  -> You will be given a 10 minute oral training about the best practices to follow during your adventure.\n" +
                "  -> The paragliding chute will be secured around your waist and chest, and will be connected and locked to the pulling apparatus on the boat.\n" +
                "  -> Next, we will take you to the open sea, pretty close to the Carbyn's Cove Beach, where your awesome venture will begin.");
        textview.setTextColor(Color.BLACK);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            Intent i = new Intent(parasailing.this,Activities.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}