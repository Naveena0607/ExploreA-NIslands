package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class pearlparkbeachresort extends AppCompatActivity {

    TextView textview1;
    TextView textview2;
    TextView textView3;
    TextView textView4;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pearlparkbeachresort);


        textview1 = findViewById(R.id.text);
        textview2 = findViewById(R.id.text1);
        textView3 = findViewById(R.id.text2);
        textView4 = findViewById(R.id.text3);


        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textview1.setText("With its unique Triangular Sea-View, this property offers some of the best views from its porch."+
                "\n"+
                "The restaurants offer a variety of cuisines from around the world.");

        textview2.setText("Private beach"+
                "\n"+
                "Private balcony"+
                "\n"+
                "Room service"+
                "\n"+
                "Housekeeping"+
                "\n"+
                "Coffee / tea maker"+
                "\n"+
                "Flatscreen TV"+
                "\n"+
                "Bath / shower"+
                "\n"+
                "Complimentary toiletries");

        textView3.setText("Ocean view"+"\n"+
                "\n"+
                "Suites");

        textView4.setText("Free parking"+"\n"+"Coffee shop"+"\n"+"Beach"+"\n"+"Car hire"+
                "\n"+"24-hour security"+"\n"+"24-hour check-in"+"\n"+"24-hour front desk"+"\n"+"Dry cleaning");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(pearlparkbeachresort.this,hotels.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}