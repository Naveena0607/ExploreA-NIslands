package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class littleandamanlsland extends AppCompatActivity {

    Toolbar toolbar;

    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_littleandamanlsland);


        toolbar = findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tex = findViewById(R.id.abouthave);
        tex.setText("   Little Andaman Island (Onge: Gaubolambe) is the fourth largest of the Andaman Islands of India with an area of 707 km², lying at the southern end of the archipelago. It belongs to the South Andaman administrative district, part of the Indian union territory of Andaman and Nicobar Islands.It lies 88 km (55 mi) south of Port Blair, the capital of Andaman and Nicobar Islands.While most of the Andaman Islands escaped major damage from the 2004 tsunami, Little Andaman wasn't quite so lucky. Almost the entire island was ravaged, though it has since bounced back, and a few rudimentary hotels have been built.");
        tex.setTextColor(Color.BLACK);

        tex = findViewById(R.id.perfectsea);
        tex.setText("  The best time to visit Little Andaman Island is between the months of November and May. At this time, one will face minimal rain and storms, therefore, creating perfect weather to chill by the beachside. It is during winters that this island is at its best and ideal to visit. It is also the best time to partake in the many water sports activities.");
        tex.setTextColor(Color.BLACK);

        tex = findViewById(R.id.seamain);
        tex.setText("  1. Butler Bay Beach\n" +
                "  2. Kalapathar Limestone Caves\n" +
                "  3. White Surf Waterfall\n" +
                "  4. Whisper Wave Waterfall\n" +
                "  5. Red Palm Oil Plantation\n");
        tex.setTextColor(Color.BLACK);
        tex = findViewById(R.id.things);
        tex.setText("  1. Swimming\n" +
                "  2. Sunbathing\n" +
                "  3. Meditate\n" +
                "  4. Photography\n" +
                "  5. Birdwatching\n" );
        tex.setTextColor(Color.BLACK);

        tex = findViewById(R.id.priship);
        tex.setText("  The most common medium of transportation to Little Andaman is by government-issued ferries. The route of these ferries usually connects Port Blair to Hutbay. Port Blair to Little Andaman ship schedule usually takes anywhere between 6 to 8 hours (travel duration is subject to change based on weather conditions). One can avail tickets from the ticket counter in the morning, however, it is suggested that book tickets a day prior to your visit.");
        tex.setTextColor(Color.BLACK);

        tex = findViewById(R.id.govship);
        tex.setText("  Another option to reach this island is through a private helicopter ride. There is no doubt that it will cost more but the expenses come with perks of its own. Most prominently is the breathtakingly beautiful bird’s eye view of the island and other being shorter transportation time. However, there are only limited seats and one can only board limited luggage. Opting to travel through a helicopter will make Port Blair to Little Andaman distance of 101 km just an hour away.");
        tex.setTextColor(Color.BLACK);

        tex = findViewById(R.id.lang);
        tex.setText(" -> Anyone who wishes to visit the island is required to have a permit that will be issued from Port Blair.\n" +
                " -> It is recommended to go trekking along with a guide and geared up since no matter how beautiful the vistas may be their true nature is wild.\n" +
                " -> It is advisable not to go surfing during monsoons months, i.e., between May and August.\n" +
                " -> One cannot camp at this island since it is prohibited.\n" +
                " -> It is recommended to keep with you the Little Andaman island map during your excursion.\n" +
                " -> Always apply mosquito repelant cream to avoid beach flies.\n" +
                " -> Recently, many cases of crocodiles spotting have occured, therefore, it is recommended to stay away from places marked with warning signs.\n" +
                " -> Food courts at Hut Bay offer some basic options. Therefore, if you are planning to cook your own food, make sure to bring your raw material and cookware.");
        tex.setTextColor(Color.BLACK);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(littleandamanlsland.this, IsalndActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
