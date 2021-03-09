package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class mountparkactivity extends AppCompatActivity {
    TextView textview;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountparkactivity);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textview = findViewById(R.id.text1);
        textview.setText(" location:Ferrargunj tehsil \n" +
                " Timings: 6:00 am – 6:00 pm \n" +
                " Ticket :   Adult: Rs25/- \n" +
                "                 Children: 10/-\n" +
                "                 Foreigners: 250/- \n" +
                "                 Camera: 25/- \n" +
                "                 Vehicles: 10/-\n");
        textview.setTextColor(Color.BLACK);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(mountparkactivity.this,parksofan.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}