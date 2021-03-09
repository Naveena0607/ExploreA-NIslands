package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class rangatisalnd extends AppCompatActivity {

    Toolbar toolbar;

    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangatisalnd);


        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tex=findViewById(R.id.abouthave);
        tex.setText(" Situated in Middle Andaman Islands, Rangat is a picturesque island that is surrounded by dense forests and has splendidly beautiful beaches. You can sit at the lavish beaches and watch the waves hit your toes.\n" +
                "\n" +
                "The islands is home to a number of natural waterfalls that will take your breath away. There are several beaches in the island which are ideal for sunbathing and water sports.The journey to the place itself is aw-inspiring, as it is surrounded by dense forests, open shorelines and great scenery.\u200B\n" +
                "\n" +
                "You can reach the Island either by road or the ferry services that are available from Port Blair if you are going Independently, we will arrange private transportation otherwise.\n" +
                "\n" +
                "During your visit to the Rangat, feel free to take pit stops and get some memorable pictures,Drivers will cooperate.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.perfectsea);
        tex.setText(" From December to March is the best time to visit Rangat. The temperature remains between 23 - 30 Degree Celsius, which is quite pleasant.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.seamain);
        tex.setText("  1. Amkunj Beach\n" +
                "  2. Curtbert Bay Beach\n" +
                "  3. Dhani Nallah Mangrove Walkway (Nature Walkway)\n" +
                "  4. Long Island\n" +
                "  5. Morrice Dera Beach\n" +
                "  6. Panchavati Hills and Waterfalls\n" +
                "  7. Yerrata Creek\n");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.things);
        tex.setText(" Rangat is ideal for picnics and basking in the sun. Places like Yerrata offer the chance to witness a variety of mangroves. An eco-friendly beach holiday is what one can expect here.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.priship);
        tex.setText(" You can reach Rangat by booking a cab from Port Blair. You will reach there in under 8 under hours, and is a long journey.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.govship);
        tex.setText(" You can reach Rangat by helicopter in under an hour. The ticket is priced Rs. 3000/-, which changes according to demand and season. The tickets can be booked by contacting any local tour operator including Eternal Andamans.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.flight);
        tex.setText(" To reach Rangat via ferry you'll have to get tickets in Port Blair itself. The ferry leaves from the Marine Jetty in Port Blair and will take you Rangat in under 4 hours. The charges per ticket would be Rs. 300/-");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.bus);
        tex.setText(" You can catch various buses from the Bus Terminus in Aberdeen Bazaar, Port Blair. This will take you to Rangat in under 10 hours.");
        tex.setTextColor(Color.BLACK);


    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(rangatisalnd.this,IsalndActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
