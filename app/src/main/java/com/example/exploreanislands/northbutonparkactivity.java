package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class northbutonparkactivity extends AppCompatActivity {

    Toolbar toolbar;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_northbutonparkactivity);


        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textview = findViewById(R.id.text1);
        textview.setText(" location: Andaman and Nicobar Islands\n" +
                " Timings: 6:00 am – 6:00 pm \n"+
                " Ticket :  No Entry Fee");
        textview.setTextColor(Color.BLACK);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(northbutonparkactivity.this,parksofan.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}