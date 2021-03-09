package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class longisland extends AppCompatActivity {

    Toolbar toolbar;

    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longisland);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tex = findViewById(R.id.abouthave);
        tex.setText(" Long Island is said to be a modern village that has its own power-house, a boat building yard, senior secondary school, a bank, wireless facilities, hospital, Range Forest Office and even police outpost. In other words it is an ideal island settlement one can wish for. Long Island boasts beautiful beaches, cosy caves, green rolling hills and stunning mangroves. It also flaunts its lush green tropical forests including Tidal Swamp forests and Evergreen Forests, and a unique marine ecosystem. The top place to visit in Long Island is the silvery beach of Lalaji Bay. It is a gorgeous sandy beach on the west coast of Long Island and a boat cruise through the Mangrove creek here offers one of its kind experience.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.perfectsea);
        tex.setText(" The ideal time to visit Long Island is between October and March, when the weather remains pleasant and free of humidity.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.seamain);
        tex.setText("  1. Lalaji Bay Beach\n" +
                "  2. Merk Bay  Beach\n" +
                "  3. Guitar Island\n"  );
        tex.setTextColor(Color.BLACK);
        tex= findViewById(R.id.things);
        tex.setText("  1. Scuba Diving\n" +
                "  2. Snorkeling\n" +
                "  3. camping\n" +
                "  4. Bird Watching\n" +
                "  5. Swimming\n" +
                "  6. Lodging\n" +
                "  7. Forest Trekking\n" +
                "  8. Sighting Dolphins\n");
        tex.setTextColor(Color.BLACK);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(longisland.this,IsalndActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}