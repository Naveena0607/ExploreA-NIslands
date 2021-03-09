package com.example.exploreanislands;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class marineparkactivity extends AppCompatActivity {
    TextView textview;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marineparkactivity);
        textview = findViewById(R.id.text1);
        textview.setText(" location: Andaman and Nicobar Islands\n" +
                " Timings: 8:00am–6:00pm \n"+
                " Ticket :  No Entry Fee");
        textview.setTextColor(Color.BLACK);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(marineparkactivity.this,parksofan.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}