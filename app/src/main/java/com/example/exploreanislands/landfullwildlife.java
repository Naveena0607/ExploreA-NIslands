package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class landfullwildlife extends AppCompatActivity {

    Toolbar toolbar;

    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landfullwildlife);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tex=findViewById(R.id.abouthave);
        tex.setText(" Landfall Island Wildlife Sanctuary was established in 1987 by the Andaman and Nicobar Administration, with the wildlife sanctuary located at the northernmost island of the Andaman archipelago. Beautifully located between blue lagoons and golden sandy beaches, the Landfall Island Wildlife"+
                "Landfall Island Wildlife Sanctuary is located at the northernmost island of the Indian Union Territory of Andaman and Nicobar Islands. It lies 220 km north of Port Blair and Burma is 300 km away from the Landfall Island. The island is specifically situated right between the North Andaman Island and Myanmar?s Coco Islands. The Cleugh Passage separates the island from North Andaman. Spread over an area of 29.28 sq km, the sanctuary houses some of the most distinct wildlife found exclusively in the island.");
        tex.setTextColor(Color.BLACK);


        tex= findViewById(R.id.perfectsea);
        tex.setText(" The island experiences a tropical climate due to its proximity to the sea. Hence the temperature is hot and humid, with long monsoons and no winter. During summers, the evenings are relatively cool and pleasant than the hotter afternoons. It is really enjoyable to take a walk along the beaches by the evenings with the mild breeze blowing on your face.");
        tex.setTextColor(Color.BLACK);


        tex= findViewById(R.id.seamain);
        tex.setText(" Experience any winter, though summers are relatively hotter and humid and the monsoons are stretched and heavy. One can travel the Landfall Island any time of the year, as the climate is gentle enough to travel. However, the best time for visiting the Landfall Island Wildlife Sanctuary is in the month of November and April.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.things);
        tex.setText(" The Landfall Island Wildlife Sanctuary provides a wonderful opportunity for the travelers to watch the animals in their natural habitat, without being interfered by humansThe climate of the region contributes to the vegetation particularly found in this region, which is tropical rain forest including some distinct species of trees. The island exhibits multiple ecosystems namely wetlands, creeks, mangroves, and beaches. These all give rise to a rich ecology and wonderful flora perfectly balancing the biological diversity.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.priship);
        tex.setText("1.Explore the marine ecosystem\n" +
                "\n" +
                "  The aqua life here is one of the most well-preserved ecosystems with a number of fish and corals savoring the ambience. You too can join in to discover the life below water.\n" +
                "\n" +
                "2.Water adventure\n" +
                "\n" +
                "  Snorkeling and swimming are the perfect escapes for the wanderlust who are looking for some adventures amid the peaceful nature.\n" +
                "\n" +
                "3.Photographer?s delight\n" +
                "\n" +
                "  It is an absolute bliss to capture the moments and beauty of the surroundings with your eyes as well as to preserve it forever in your cameras. Pure ecstasy for the birdwatchers.\n" +
                "\n" +
                "4.A stroll by the beach\n" +
                "\n" +
                "  It is heavenly to take a stroll by the beach as the mild breeze sweep off your face. Enjoy the experience while taking a break from the daily life.\n" +
                "\n" +
                "5.Multiple ecosystems\n" +
                "\n" +
                "  Wetlands, creeks, mangroves and beaches ? how many more variations can you spot? Landfall Island Wildlife Sanctuary has so much to offer when it comes to ecosystems.");
        tex.setTextColor(Color.BLACK);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(landfullwildlife.this,sanctuaries.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}