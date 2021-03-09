package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class fortuneresort extends AppCompatActivity {

    TextView textview1;
    TextView textview2;
    TextView textView3;
    TextView textView4;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fortuneresort);

        textview1 = findViewById(R.id.text);
        textview2 = findViewById(R.id.text1);
        textView3 = findViewById(R.id.text2);
        textView4 = findViewById(R.id.text3);


        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textview1.setText("Indulge in the wide range of delicacies including fresh seafood at Mandalay- an open deck restaurant with stunning sea view"+
                "\n"+
                "Enjoy a relaxing swim at the sea view swimming pool of Fortune Resort bay"+
                "\n"+
                "Kids can have fun at the games room");

        textview2.setText("Blackout curtains"+
                "\n"+
                "Soundproof rooms"+
                "\n"+
                "Air conditioning"+
                "\n"+
                "Desk"+
                "\n"+
                "Interconnected rooms available"+
                "\n"+
                "Private balcony"+
                "\n"+
                "Cable / satellite TV"+
                "\n"+
                "Bath / shower");

        textView3.setText("Non-smoking rooms\n"+
                "\n"+
                "Mountain view"+
                "\n"+
                "Pool view"+
                "\n"+
                "Ocean view"+
                "\n"+
                "Suites");

        textView4.setText("Free parking"+"\n"+"Free breakfast"+"\n"+"Snorkelling"+"\n"+"Diving"+
                "\n"+"Airport transportation"+"\n"+"Business Centre with Internet Access"+"\n"+"Children's television networks");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(fortuneresort.this,hotels.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}