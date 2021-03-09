package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class dolphin extends AppCompatActivity {

    TextView textview1;
    TextView textview2;
    TextView textView3;
    TextView textView4;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dolphin);

        textview1 = findViewById(R.id.text);
        textview2 = findViewById(R.id.text1);
        textView3 = findViewById(R.id.text2);
        textView4 = findViewById(R.id.text3);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textview1.setText("The pristine Vijay Nagar Beach is a stone’s throw away");

        textview2.setText("Air conditioning"+
                "\n"+
                "Private balcony"+
                "\n"+
                "Flatscreen TV");

        textView3.setText("Ocean view"+
                "\n"+
                "Suites");

        textView4.setText("Free parking"+"\n"+"Free breakfast"+"\n"+"Beach"+"\n"+"Diving"+
                "\n"+"Bar / lounge"+"\n"+"Restaurant"+"\n"+"Meeting rooms"+"\n"+"24-hour security");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(dolphin.this,hotels.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}