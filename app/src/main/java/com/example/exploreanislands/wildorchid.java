package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class wildorchid extends AppCompatActivity {

    TextView textview1;
    TextView textview2;
    TextView textView3;
    TextView textView4;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wildorchid);

        textview1 = findViewById(R.id.text);
        textview2 = findViewById(R.id.text1);
        textView3 = findViewById(R.id.text2);
        textView4 = findViewById(R.id.text3);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textview1.setText("The Red Snapper restaurant is a favourite among the tourists and people come here to dine regardless of their being guest of the resort."+
                "\n"+
                "The Emerald Gecko Bar and the Clownfish Café are also amazing places to hang out"+
                "\n"+
                "There’s also a Fat Martin’s South Indian Corner for those who prefers veggie food"+
                "\n"+
                "Scuba instructors are also available to take you on an underwater trip");

        textview2.setText("Air conditioning"+
                "\n"+
                "Private balcony"+
                "\n"+
                "Private Beach"+
                "\n"+
                "Housekeeping"+
                "\n"+
                "Coffee / tea maker"+
                "\n"+
                "Refrigerator"+
                "\n"+
                "Flatscreen TV"+
                "\n"+
                "Complimentary toiletries");

        textView3.setText("Non-smoking rooms");

        textView4.setText("Free parking"+"\n"+"Free breakfast"+"\n"+"Snorkelling"+"\n"+"Diving"+
                "\n"+"Car hire"+"\n"+"24-hour security"+"\n"+"Baggage storage");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(wildorchid.this,hotels.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
