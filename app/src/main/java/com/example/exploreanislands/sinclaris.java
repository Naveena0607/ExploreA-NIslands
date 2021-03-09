package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class sinclaris extends AppCompatActivity {

    TextView textview1;
    TextView textview2;
    TextView textView3;
    TextView textView4;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinclaris);

        textview1 = findViewById(R.id.text);
        textview2 = findViewById(R.id.text1);
        textView3 = findViewById(R.id.text2);
        textView4 = findViewById(R.id.text3);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textview1.setText("Couples can spend romantic evenings at the terrace of the hotel with great food and drinks while enjoying the feel of open sea"+
                "\n"+
                "Feel the cool sea breeze and hear the sound of waves from the covered deck of the hotel"+
                "\n"+
                "A Bunker dating back to the World War II is located inside the hotel, with its canon still in place!");

        textview2.setText("Air conditioning"+
                "\n"+
                "Room service"+
                "\n"+
                "Flatscreen TV");

        textView3.setText("Non-smoking rooms\n"+
                "\n"+
                "Family rooms"+
                "\n"+
                "Ocean view"+
                "\n"+
                "Suites");

        textView4.setText("Free parking"+"\n"+"Free breakfast"+"\n"+"Free internet"+"\n"+"Pool"+
                "\n"+"Spa"+"\n"+"Airport transportation"+"\n"+"Conference facilities"+"\n"+"Banquet room");
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(sinclaris.this,hotels.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}