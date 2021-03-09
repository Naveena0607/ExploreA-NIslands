package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class tangoresort extends AppCompatActivity {

    TextView textview1;
    TextView textview2;
    TextView textView3;
    TextView textView4;

    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tangoresort);

        textview1 = findViewById(R.id.text);
        textview2 = findViewById(R.id.text1);
        textView3 = findViewById(R.id.text2);
        textView4 = findViewById(R.id.text3);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textview1.setText("Indulge in a romantic dinner with your better half at the charming restaurant of the resort"+
                "\n"+
                "The proximity to the beach makes it a splendid place for swimming, snorkelling, fishing and scuba diving"+"\n" +
                "There are guided jungle trekking that you can take");

        textview2.setText("Private beach"+
                "\n"+
                "Private balcony"+
                "\n"+
                "Room service"+
                "\n"+
                "Air conditioning"+
                "\n"+
                "Flatscreen TV");

        textView3.setText("Ocean view");

        textView4.setText("Free parking"+"\n"+"Restaurant"+"\n"+"Beach"+"\n"+"Breakfast buffet"+
                "\n"+"Children Activities (Kid / Family Friendly)");
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(tangoresort.this,hotels.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}