package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class zonalmuseum extends AppCompatActivity {
    Toolbar toolbar;
    TextView textview;
    TextView textview1;
    TextView textview2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zonalmuseum);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textview = findViewById(R.id.textviewa2c);
        textview1 = findViewById(R.id.textview13);
        textview2 = findViewById(R.id.textview1g);
        textView3 = findViewById(R.id.textview1gg);
        textView4 = findViewById(R.id.textview1ig);
        textView5 = findViewById(R.id.textview1jg);
        textView6 = findViewById(R.id.textview1kg);
        textview.setText("Adults: INR 10"+
                "\n" +
                "Student (with ID): INR 3"+
                "\n"+
                "Camera: INR 20");
        textview1.setText("* Know about the life of Paleolithic Islanders."+
                "\n" +
                "* Watch the various exhibits which include shamanic sculptures, Jarawa chest guard and more."+
                "\n"+
                "* Other Interesting items to see which are on display here are handicrafts, arts and crafts, tools, photographs, weapons, and clothing that dates back to the older times."+
                "\n"+
                "* Get familiar with the living style of the tribals through the models made out of hay and clay which gives one a picture of the kind of equipment and utensils they used, ornaments they wore, and the houses they lived in."+
                "\n"+
                "* Visit the souvenir shop that is adjoining the museum and find informative and interesting journals, books, and more such items here."+
                "\n"+
                "* Watch documentaries and short films on the lives of the tribes, their social customs, and culture of the Union territory.");
        textview2.setText("* Make sure you carry your ID cards with you."+
                "\n" +
                "* You need to pack accordingly to the season."+
                "\n"+
                "* You must take handy medicines and a first-aid kit with you."+
                "\n"+
                "* Make sure you carry some handy snacks with you and plenty of water.Too much history can make you thirsty!");
        textView3.setText("* It is under the auspices of the Anthropological Survey of India."+
                "\n" +
                "* It is Focuses mainly on the ethnic people of the Onges,Jarawas,Sentinelese as well as Great Andamanese."+
                "\n"+
                "* An attraction destination of the Museum is an ethnic section on the Monogoloid tribes,Nicobarese and Shompens."+
                "\n"+
                "* Our of these the Jawaras are still a very primitive tribe living in high seclusion."+
                "\n"+
                "* These tribes have been subject to study by numerous anthropolagists from all over the world"+
                "\n"+
                "* An intriguing fact is that they remain one of the most primitive tribal communities in the world today,particularly the Jawaras");
        textView4.setText("here are private ferry sailing from Port Blair – Havelock – Neil – Port Blair which is having 2-3 sailing in a day. So one can issues ferry tickets online as per there preference"+
                "\n" +
                "Private Ferry – Makruzz/ Green"+
                "\n"+
                "Ocean Seasonal Ferry – Coastal Cruise/ Sea link Cruise"+
                "\n"+
                "Government Ferry is also available.");
        textView5.setText("Samudrika Marine Museu"+
                "\n" +
                "Kalapani Museum"+
                "\n"+
                "Corbyn’s Cove"+
                "\n"+
                "Chidiya Tapu"+
                "\n"+
                "Red Skin Island"+
                "\n"+
                "Cellular Jail"+
                "\n"+
                "Forest Museum"+
                "\n"+
                "Rajiv Gandhi Water Sports Complex"+
                "\n"+
                "Chidiya Tapu Biological Park"+
                "\n"+
                "Marina Park");
        textView6.setText("Mandalay Restaurant"+
                "\n" +
                "Adi Bengali"+
                "\n"+
                "The Love Garden"+
                "\n"+
                "Amaya"+
                "\n"+
                "aradise Café"+
                "\n"+
                "Feel Good Restaurant and Karaoke Bar"+
                "\n"+
                "Lighthouse Residency"+
                "\n"+
                "Milkyway"+
                "\n"+
                "CFC Chilly’s Family Restaurant"+
                "\n"+
                "Corbyns’s Delight");
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            Intent i = new Intent(zonalmuseum.this,museum.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}