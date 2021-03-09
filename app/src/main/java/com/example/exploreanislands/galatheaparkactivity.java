package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class galatheaparkactivity extends AppCompatActivity {
    TextView textview;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranijhansiparkactivity);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textview = findViewById(R.id.text1);
        textview.setText(" location: Union Territory of Andaman and Nicobar Islands \n" +
                " Timings: 12:00 AM to 12:00 PM \n"+
                " Ticket :  Will Be Updated Soon\n");
        textview.setTextColor(Color.BLACK);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(galatheaparkactivity.this,parksofan.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}