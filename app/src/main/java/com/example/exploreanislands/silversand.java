package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class silversand extends AppCompatActivity {
    Toolbar toolbar;

    TextView textview1;
    TextView textview2;
    TextView textView3;
    TextView textView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silversand);


        textview1 = findViewById(R.id.text);
        textview2 = findViewById(R.id.text1);
        textView3 = findViewById(R.id.text2);
        textView4 = findViewById(R.id.text3);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        textview1.setText("You can enjoy various activities at the private beach including scuba diving and snorkelling"+
                "\n"+
                "Sit at the beach and test your skills at angling"+
                "\n"+
                "Boat rides are also arranged from the resort"+
                "\n"+
                "One of the best luxury hotels in Andaman, they offer exceptional sea food at their multi cuisine restaurant, ZOLA");

        textview2.setText("Air conditioning"+
                "\n"+
                "Private beach"+
                "\n"+
                "Housekeeping"+
                "\n"+
                "Room service"+
                "\n"+
                "Refrigerator"+
                "\n"+
                "Flatscreen TV");

        textView3.setText("Ocean view"+
                "\n"+
                "Non-smoking rooms"+
                "\n"+
                "Suites");

        textView4.setText("Free parking"+"\n"+"Free breakfast"+"\n"+"Beach"+"\n"+"Diving"+
                "\n"+"Spa"+"\n"+"Outdoor pool"+"\n"+"24-hour security"+"\n"+"Internet");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(silversand.this,hotels.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}