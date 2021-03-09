package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class symphonyre extends AppCompatActivity {

    TextView textview1;
    TextView textview2;
    TextView textView3;
    TextView textView4;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symphonyre);

        textview1 = findViewById(R.id.text);
        textview2 = findViewById(R.id.text1);
        textView3 = findViewById(R.id.text2);
        textView4 = findViewById(R.id.text3);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textview1.setText("Go for a blissful stroll by the beach."+
                "\n"+
                "Indulge and pamper yourself with a relaxing spa therapy.");

        textview2.setText("Air conditioning"+
                "\n"+
                "Private beach"+
                "\n"+
                "Housekeeping"+
                "\n"+
                "Private balcony"+
                "\n"+
                "Coffee / tea maker"+
                "\n"+
                "Cable / satellite TV"+
                "\n"+
                "Flatscreen TV"+
                "\n"+
                "Bath / shower");

        textView3.setText("Non-smoking rooms\n"+
                "\n"+
                "Smoking rooms available"+
                "\n"+
                "Mountain view"+
                "\n" +
                "Suites");

        textView4.setText("Free parking"+"\n"+"Free breakfast"+"\n"+"Free wifi in the business centre"+"\n"+"Diving"+
                "\n"+"Spa"+"\n"+"Beach"+"\n"+"Car hire"+"\n"+"24-hour security");

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(symphonyre.this,hotels.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}