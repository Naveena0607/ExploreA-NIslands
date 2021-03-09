package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class batarangisland extends AppCompatActivity {

    Toolbar toolbar;

    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batarangisland);


        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tex=findViewById(R.id.abouthave);
        tex.setText("Baratang Island is an island of the Andaman Islands. It belongs to the North and Middle Andaman administrative district, part of the Indian union territory of Andaman and Nicobar Islands.[5] The island lies 150 km (93 mi) north of Port Blair.Those who do decide to stay for a night or two will be rewarded with virgin beaches, some interesting bird watching opportunities, a rural way of life, adventure mangrove boat rides and plenty of cheap authentic Indian dishes. If you are a nature explorer or a wildlife fan, (or both) you should definitely pay a visit to this diverse island.");
        tex.setTextColor(Color.BLACK);


        tex= findViewById(R.id.seamain);
        tex.setText("  1. Limestone Caves\n" +
                "  2. Parrot Island\n" +
                "  3. Mud volcano\n" +
                "  4. Baludera Beah\n" );
        tex.setTextColor(Color.BLACK);



        tex= findViewById(R.id.continfo);
        tex.setText("Baratang Hospital :  03192-279533\n" +
                "Baratang police station: 03192-279503");
        tex.setTextColor(Color.BLACK);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(batarangisland.this,IsalndActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}