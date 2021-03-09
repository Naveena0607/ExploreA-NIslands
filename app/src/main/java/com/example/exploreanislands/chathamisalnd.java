package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class chathamisalnd extends AppCompatActivity {
    Toolbar toolbar;

    TextView tex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chathamisalnd);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tex=findViewById(R.id.abouthave);
        tex.setText(" Formerly known as the Mark Island, Chatham Island is a known for the fact that Lt. Archibald Blair initially formed a colony here in 1783. However later, it was shifted to North Andaman. It was 1857 when British decided to decide to establish a settlement here. Slowly, and gradually, the settlement expanded, and a saw mill was the commission, which at that time was the biggest in Asia. During World War 2, the Japanese got their hands on the island. However, later the Aircraft of RAF bombed the establishment of the Island. Then the British tried to re-occupy the island and reconstructed it all over again. Post independence, Dr. Rajendra Prasad, the first president of Free India visited here. Also on the 150th anniversary of the settlement, a memorial column was installed to commemorate the arrival of the 1st batch of Freedom Fighters. The museum established by Forest Department is worth all the attention too on a heritage tour to Andaman.");
        tex.setTextColor(Color.BLACK);


        tex= findViewById(R.id.seamain);
        tex.setText(" Do visit the museum featuring the forest wealth of  Andaman, and the Nicobar Islands. Make a point to  visit the Chatham Saw Mill to see the bomb crater, left  by Japanese ordnance in WWII." );
        tex.setTextColor(Color.BLACK);
        tex= findViewById(R.id.things);
        tex.setText(" Best time to visit Chatham Island will be winters - October to February as this is when the weather is just the perfect to go for sightseeing");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.reach);
        tex.setText(" From Port Blair, one can visit Chatham via road. Ferry facility is available to Viper and North Passage Islands from Rajiv Gandhi Water Sports Complex");
        tex.setTextColor(Color.BLACK);


    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(chathamisalnd.this,IsalndActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
