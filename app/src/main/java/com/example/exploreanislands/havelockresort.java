package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class havelockresort extends AppCompatActivity {

    TextView textview1;
    TextView textview2;
    TextView textView3;
    TextView textView4;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_havelockresort);

        textview1 = findViewById(R.id.text);
        textview2 = findViewById(R.id.text1);
        textView3 = findViewById(R.id.text2);
        textView4 = findViewById(R.id.text3);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textview1.setText("Lavish stay experience"+
                "\n"+
                "Water sports and adventure activities arranged by the hotel staff");

        textview2.setText("Air conditioning"+
                "\n"+
                "Private beach"+
                "\n"+
                "Allergy-free room"+
                "\n"+
                "Blackout curtains"+
                "\n"+
                "Desk"+
                "\n"+
                "Coffee / tea maker"+
                "\n"+
                "Cable / satellite TV"+
                "\n"+
                "Extra long beds");

        textView3.setText("Non-smoking rooms\n"+
                "\n"+
                "Family rooms"+
                "\n"+
                "Ocean view"+
                "\n"+
                "Pool view"+
                "\n"+
                "Suites");

        textView4.setText("Free parking"+"\n"+"Free breakfast"+"\n"+"Beach"+"\n"+"Pool"+
                "\n"+"Free internet"+"\n"+"Badminton"+"\n"+"Children's playground"+"\n"+"Children's television network");

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(havelockresort.this,hotels.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}