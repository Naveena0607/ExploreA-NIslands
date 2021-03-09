package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class interviewsanct extends AppCompatActivity {

    Toolbar toolbar;

    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interviewsanct);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tex=findViewById(R.id.abouthave);
        tex.setText(" The Interview Island Wildlife Sanctuary is an island of the Andaman Islands that lies 125 km north from Port Blair. Right at the west of Austen Strait, it divides North Andaman Island and Middle Andaman Island with a stretch of approximately 101 sq km. The N end of the island is relatively low, but keeps on rising gradually to a height of 113 m, reaching to the highest part of the island which is a wooden plateau. There is a single village located at the eastern region of the island with a population of 1 household only");
        tex.setTextColor(Color.BLACK);


        tex= findViewById(R.id.perfectsea);
        tex.setText("The Interview Island enjoys tropical climate with perpetually humid weather conditions. The summers are typically hot and humid, while the monsoons are stretched with no winter in the scenario. Though the summers are hot, the evenings are relatively cooler and pleasant, especially by the sunset hours. The sanctuary has a soothing climate, and pretty relaxing as compared to the daily hustle bustle of the city.");
        tex.setTextColor(Color.BLACK);


        tex= findViewById(R.id.seamain);
        tex.setText("The mild and soothing weather conditions make the island an ideal place to visit throughout the year. Since the weather is comfortable, one can visit around the sanctuary anytime of the year, though November to April might suit the best keeping in mind the long monsoons with interrupted rain.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.things);
        tex.setText("The island is a paradise for wildlife lovers and a dream come true for the photography freaks. Nature has bestowed with its best scenic beauty and life making it the lavish green and woody landscape inhabited by some of the rarest of the animal species. The flora is semi-evergreen forests, mangroves, littoral forests and marshlands that contribute for the plush greenery and some of the rarest of plants found only here.with elephants as the main inhabitants for whom the Interview Island Wildlife Sanctuary was established, although animals like common palm civet, spotted deer, Andaman wild pig, Andaman palm civet, three-striped palm squirrel and many others proudly inherit the island sanctuary to add to its beauty.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.priship);
        tex.setText("1.Spot the spotted deer and others\n" +
                "\n" +
                "  The uniqueness of the island sanctuary comes with the uniqueness of the creatures living here. Few of the animals include spotted dear, wild pig,palm civet, and three-stripped palm squirrel. Watch these delightful animals living peacefully in their own world without any disturbance from outside world.\n" +
                "\n" +
                "2.Embrace the grace ? elephants, the main inhabitants\n" +
                "\n" +
                "  The island is the house of around 100 elephants that were brought in for forestry works, and even after the operations seized, they stayed back making the island a must visit to watch their serene world. Get lucky to catch them walk, eat, and bathe right in front of your eyes.\n" +
                "\n" +
                "3.Avifauna is a bird watchers paradise\n" +
                "\n" +
                "  Ornithologists are attracted every year to visit the island to explore and study the birds found distinctly in the island. Birdwatchers and photographers too aren?t left behind in the race, who flock at the island sanctuary every year to treat their eyes with. Keep your eyes and camera ready to capture images of some of the prettiest birds living here.\n");
        tex.setTextColor(Color.BLACK);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(interviewsanct.this,sanctuaries.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}