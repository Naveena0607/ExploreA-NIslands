package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class transtoanbyair extends AppCompatActivity {


    Toolbar toolbar;

    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transtoanbyair);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tex=findViewById(R.id.abouthave);
        tex.setText(" Andaman and Nicobar Islands are roughly 300 islands that attract travellers from across the globe to delight in the serenity all around.These are popularly known for white-sand beaches often shadowed by the palms and dark surroundings of the tropical rainforests. The colorful marine life is perfect for diving and snorkelling here that adds charisma to this union territory. If you are thinking of how to reach Andaman and get started with your fun-filled holiday, we have the right information for you. When you are planning Andaman Nicobar Island trip, here are the best options available to travel to Andaman by air (Flight). However, travelling by ship is another great option. Take a look at the best ways to reach Andaman and Nicobar Islands:");
        tex.setTextColor(Color.BLACK);


        tex= findViewById(R.id.avai);
        tex.setText("One of the easiest ways to travel to Andaman is by flight. This tourist destination has its own airport at Port Blair, namely Veer Savarkar Airport, which has good connectivity with Delhi, Mumbai, Chennai, Kolkata, and Bangalore. While the flights from Delhi and Mumbai take 5 hours, travellers from Chennai and Kolkata can reach in just 2 hours.");
        tex.setTextColor(Color.BLACK);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(transtoanbyair.this,TransActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}