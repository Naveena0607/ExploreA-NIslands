package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class seashell extends AppCompatActivity {

    TextView textview1;
    TextView textview2;
    TextView textView3;
    TextView textView4;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seashell);

        textview1 = findViewById(R.id.text);
        textview2 = findViewById(R.id.text1);
        textView3 = findViewById(R.id.text2);
        textView4 = findViewById(R.id.text3);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textview1.setText("The resort offers soothing views of the ocean."+
                "\n"+
                "The resort can arrange a get-together or a celebration for you on request.");

        textview2.setText("Air conditioning"+
                "\n"+
                "Desk"+
                "\n"+
                "Minibar"+
                "\n"+
                "Housekeeping"+
                "\n"+
                "Room service"+
                "\n"+
                "Electric kettle"+
                "\n"+
                "Cable / satellite TV"+
                "\n"+
                "Bath / shower");

        textView3.setText("Non-smoking rooms\n"+
                "\n"+
                "Family rooms"+
                "\n"+
                "Ocean view"+
                "\n"+
                "City view");

        textView4.setText("Free parking"+"\n"+"Free breakfast"+"\n"+"Highchairs available"+"\n"+"Car hire"+
                "\n"+"Banquet room"+"\n"+"Conference facilities"+"\n"+"Rooftop terrace");
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(seashell.this,hotels.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}