package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class cuthbert extends AppCompatActivity {

    Toolbar toolbar;

    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuthbert);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tex=findViewById(R.id.seamain);
        tex.setText("The weather is quite pleasant around here throughout the year with minimum fluctuations. If you want the goldilocks’ phase, then the months of November to Mid-May provide the right weather to visit these picturesque islands. Although it is advisable to avoid the monsoon months. Average Summer Temperature is 30.2 degree Celsius and average winter temperature is 23 degrees Celsius.\n" +
                "\n");
        tex.setTextColor(Color.BLACK);


        tex= findViewById(R.id.priship);
        tex.setText(" -> The islands are and peaceful and somewhat detached from the bedlam & confusion of main landmass. One of the best places if you are in a search for some tranquillity.\n" +
                " -> Get up early in the morning, put on some sportswear, go for a rejuvenating jog on the beach and breath in some fresh air coming from the ocean breeze.\n" +
                " -> The beach is a perfect picnic spot where you can spend some quality time with your friends and family.\n" +
                " -> Visit the wildlife sanctuary and observe how the sea turtles use the beach as a nesting ground.\n" +
                " -> Visit the ever famous Saint Francis Xavier Catholic Church.");
        tex.setTextColor(Color.BLACK);


        tex= findViewById(R.id.abouthave);
        tex.setText(" Andaman and Nicobar Islands is one of the seven Union Territories of India, they are actually a group of islands at the juncture of the Bay of Bengal and Andaman Sea. Andaman and Nicobar Islands call for some never had experiences such as snorkelling, scuba diving, deep sea diving and coral reef tour. There are many activities which you can do with your family in a place which is several thousand kilometres away from the Main Landmass of India. The following article is a comprehensive guide to visit the famous Cutbert Bay Beach in Andaman.\n" +
                "\n");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.things);
        tex.setText("1.Spotted Deer\n" +
                "The spotted deer was introduced by the British Government and has become one of the important wild fauna of these islands.The spotted Deers can be sited easily in the vegetation near the coast , in the mangroves and some times on the beach too.\n" +
                "\n" +
                "2.Bird and Butterflies\n" +
                "The number of different species of Birds can easily be located on the way to beach. Varieties of Kingfishers including the Stork billed Kingfisher,Pond Herons, Lesser Whistling Ducks and Curlews can be seen while entering the sanctuary by boat in the creek and also near the beach.Some of the endemic butterflies like Andaman Mormon are very commonly seen in the area.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.perfectsea);
        tex.setText("The beaches provide a nesting ground for sea turtles.\n" +
                "Cuthbert Bay is famous for itd sandy beaches.\n"+
                "The Bay is also home to a wildlife sanctuary.\n"+
                "Each year many species of turtles come to the beaches of Cutbert Bay to lay their eggs. Most notable varieties are Olive Ridley Turtle and Leatherback Turtle.\n");
        tex.setTextColor(Color.BLACK);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(cuthbert.this,sanctuaries.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}