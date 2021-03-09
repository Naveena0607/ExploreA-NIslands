package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class rossisalnd extends AppCompatActivity {

    Toolbar toolbar;

    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rossisalnd);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tex=findViewById(R.id.abouthave);
        tex.setText(" Connected by a white sand bar are Ross and Smith Islands belonging to North Island and both of them together known as the Twin Islands. The beautiful villages, turquoise water, the virgin beaches and the extremely gorgeous tropical rainforest and what not; these islands are indescribably fascinating. \n" +
                "\n" +
                "As the island is close to Diglipur, one can take the Aerial Bay as the destination via road and get entry permits and travel to the island by a ferry. Around 20 minutes of boat ride will take you to the island. From Smith Island, you are invited to indulge in the nature trails extended till Ross Island through the green tropical forests swaying their heads always.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.perfectsea);
        tex.setText(" A Marine Sanctuary on the island is the biggest highlight and it is considered to be the ideal place for watching the rare collection of invigorating coral reefs and colourful fish species. As both the islands are home to Olive Ridley turtles, tourists come at the right time to watch turtle nesting and it is a rare scene to be watched. At times, the wild elephants inhabited in the forests may come to the outer world.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.seamain);
        tex.setText(" The Attractions include Munda pahad,chidiya tapu,corbyns beach ,kala pani museum,science centre aquarium and cellular jail according to your interest.");
        tex.setTextColor(Color.BLACK);
        tex= findViewById(R.id.things);
        tex.setText(" Snorkeling and swimming are the most suitable and well acknowledged activities on both the islands. Adventure lovers find the space marvelous to do scuba diving tours as well.");
        tex.setTextColor(Color.BLACK);


    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(rossisalnd.this,IsalndActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
