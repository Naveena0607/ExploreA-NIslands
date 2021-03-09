package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class middleisland extends AppCompatActivity {

    Toolbar toolbar;

    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_middleisland);
        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tex=findViewById(R.id.abouthave);
        tex.setText(" The central part of the Great Andaman archipelago, Middle Andaman Island is spread over an area of 1,536 km². 73 kilometers from the Port Blair, it is mainly known for featuring the towns like Rangat, Mayabunder, Bakultala, Nimbutala, and Kadamtala. That's perhaps the reason why it often remains on the radar of the travelers.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.perfectsea);
        tex.setText(" The best time to go for Middle Andaman tour will be winter, preferably between November, and February. During the winter, the weather remains pleasant and fit to take part in watersports activities, trekking, and sightseeing.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.seamain);
        tex.setText(" The most popular attraction to visit in Middle Andaman is Rangat for the Amkunj Beach, Dhaninallah Mangrove Nature Walk, Yerrata Mangrove Park and Yerrata Creek. At Mayabunder, one can see mangrove lined tidal creeks, visit the beach at Avis Island, and see the turtle nesting ground at Karamatang Beach (13 km).");
        tex.setTextColor(Color.BLACK);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(middleisland.this,IsalndActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}