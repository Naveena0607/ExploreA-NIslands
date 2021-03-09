package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class barefoot extends AppCompatActivity {

    TextView textview1;
    TextView textview2;
    TextView textView3;
    TextView textView4;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barefoot);


        textview1 = findViewById(R.id.text);
        textview2 = findViewById(R.id.text1);
        textView3 = findViewById(R.id.text2);
        textView4 = findViewById(R.id.text3);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        textview1.setText("One of a kind Ayurvedic treatment at the Barefoot Ayurvedic Wellness Centre"+
                "\n"+
                "Explore the coral reefs under the clear sea water while scuba diving in Andaman"+
                "\n"+
                "You can go Line fishing from a traditional boat or Rod fishing from custom made speedboat");

        textview2.setText("Air conditioning"+
                "\n"+
                "Private balcony"+
                "\n"+
                "Minibar"+
                "\n"+
                "Housekeeping"+
                "\n"+
                "Safe"+
                "\n"+
                "Refrigerator");

        textView3.setText("Non-smoking rooms\n"+
                "\n"+
                "Family rooms");

        textView4.setText("Free parking"+"\n"+"Free breakfast"+"\n"+"Beach"+"\n"+"Diving"+
                "\n"+"Spa"+"\n"+"Concierge"+"\n"+"Dry cleaning"+"\n"+"Laundry service");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(barefoot.this,hotels.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}