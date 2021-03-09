package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class snorkeling extends AppCompatActivity {

    TextView textview,tex,text;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snorkeling);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        textview = findViewById(R.id.perfect);
        textview.setText("  -> Clarity of water near the shoreline.\n" +
                "  -> Power and frequency of waves.\n" +
                "  -> Underwater ecosystem.\n" +
                "  -> Safety and presence of life guards.\n" +
                "  -> Easy to reach.\n" +
                "  -> Rabid fish and sea-creatures.");
        textview.setTextColor(Color.BLACK);

        tex= findViewById(R.id.main);
        tex.setText("  1. Havelock Island\n" +
                "  2. North Bay Island\n" +
                "  3 .Jolly Buoy\n" +
                "  4. Neil Island\n"+
                "  5. Red Skin Island");
        tex.setTextColor(Color.BLACK);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            Intent i = new Intent(snorkeling.this,Activities.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}