package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class mangrooveactivity extends AppCompatActivity {
    TextView textview;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mangrooveactivity);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textview = findViewById(R.id.text1);
        textview.setText(" location: Democratic Republic of the \n" +
                "                     Congo\n" +
                " Timings: 10:00am–12:00pm \n"+
                " Ticket :  No Entry Fee\n");
        textview.setTextColor(Color.BLACK);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(mangrooveactivity.this,parksofan.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}