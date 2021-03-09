package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class mayabunderisalnd extends AppCompatActivity {
    TextView tex;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mayabunderisalnd);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tex=findViewById(R.id.abouthave);
        tex.setText("Some 242 km away from Port Blair and around three hours far from Rangat, the beautiful Mayabunder Island is an incredible place for a beach holiday. The island is located in the northern part of the Middle Andaman Island and boasts gorgeous mangrove creeks and spellbinding beaches and isles. It is also famed as a home to former Burmese Karen Tribes, who served as the logging labourers during British Colonial period.");
        tex.setTextColor(Color.BLACK);

        tex=findViewById(R.id.perfectsea);
        tex.setText("The best time to visit between October and March, when the temperature is comparatively cool.");
        tex.setTextColor(Color.BLACK);

        tex=findViewById(R.id.seamain);
        tex.setText("  1. Karatang Beach\n"+
                "   2. Austin X Isalnd\n"+
                "  3. Avis Isalnd\n" +
                "  4. Ray Hill\n" +
                "  5. Forest Museum");
        tex.setTextColor(Color.BLACK);

        tex=findViewById(R.id.things);
        tex.setText("  1. Picnic\n"+
                "   2. Trekking\n"+
                "  3. Elephant Rides\n" +
                "  4. Observe turtlr Nesting(Seasonal)\n" +
                "  5. Jungle Safari");
        tex.setTextColor(Color.BLACK);
        tex=findViewById(R.id.transport);
        tex.setText("By Speed Boats: There are speed boats available once a week, the Port Blair ferry also takes one here en route to Diglipur.\n" +
                "\n" +
                "By Bus: There is a bus from Port Blair to Mayabunder.");
        tex.setTextColor(Color.BLACK);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(mayabunderisalnd.this,IsalndActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}