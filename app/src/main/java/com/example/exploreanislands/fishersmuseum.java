package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class fishersmuseum extends AppCompatActivity {

    TextView textview;
    TextView textview1;
    TextView textview2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fishersmuseum);

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

        textview.setText("Adults: INR 5"+
                "\n" +
                "Children: INR 3");
        textview1.setText("* Visit the many other museums on likewise interesting topics nearby."+
                "\n" +
                "* Learn the British colonial history of the place through the various monuments built at the time, most notably the cellular jail"+
                "\n"+
                "* There are also a lot of beautiful beaches and islands nearby you should visit."+
                "\n"+
                "* There is ample scope for adventure sports here."+
                "\n"+
                "* You can photograph as much as you like"+
                "\n"+
                "* There are also very interesting and exciting special underwater voyages.");
        textview2.setText("* Carry suitable gear with you like cameras and sunscreen."+
                "\n" +
                "* Video cameras are allowed inside only with an added fee and specific light settings."+
                "\n"+
                "* You should not touch or disturb any of the specimens, as it can hurt both them and you."+
                "\n"+
                "* Make it a point to learn about the unique lifestyles and histories of the animals.");
        textView3.setText("* There are views of the magnificent Andaman Sea from the museum."+
                "\n" +
                "* There are exhibits of turtles and also remains of the Great Sperm Whale."+
                "\n"+
                "* There are special markets nearby you can go to shop at"+
                "\n"+
                "* The views of nature provided from here are almost unparalleled."+
                "\n"+
                "* There are exhibits of exotic creatures like dolphins and saw fishes as well."+
                "\n"+
                "* There are table corals as well.");
        textView4.setText("There are private ferry sailing from Port Blair – Havelock – Neil – Port Blair which is having 2-3 sailing in a day. So one can issues ferry tickets online as per there preference"+
                "\n" +
                "Private Ferry – Makruzz/ Green"+
                "\n"+
                "Ocean Seasonal Ferry – Coastal Cruise/ Sea link Cruise"+
                "\n"+
                "Government Ferry is also available.");
        textView5.setText("The Anthropological Museum chronicling the life and times of the native Negrito tribes of the islands."+
                "\n" +
                "The Samudrika (Naval Marine Museum) under the administration of the Indian Navy, informing about history etc"+
                "\n"+
                "The Zoological Survey of India Museum."+
                "\n"+
                "The Science Centre, Port Blair.");
        textView6.setText("The Icy Spicy, whipping up food from across the globe a la Indian, Italian, Asian."+
                "\n" +
                "The New Lighthouse Restaurant."+
                "\n"+
                "The Annapurna Cafeteria, a casual eatery with pretty interiors.");
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            Intent i = new Intent(fishersmuseum.this,museum.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}