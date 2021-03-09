package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class viperisalnd extends AppCompatActivity {

    Toolbar toolbar;

    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viperisalnd);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        
        tex=findViewById(R.id.abouthave);
        tex.setText(" Positioned near the Port Blair, Viper Island was the location of old jail used by the British to keep political prisoners and harbour convicts. This island is exceptionally exquisite and tranquil. The name of this island is kept after the name of the vessel in which Lt. Archibald Blair came to Andaman and Nicobar in the year 1789. This beautiful island is swarmed by visitors as it serves a wonderful amalgamation of historically significant elements and arresting grandeur of nature. Thus, Viper Island is no less than an empyrean for both the bugs of history and nature admirers.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.perfectsea);
        tex.setText(" Viper Island is open for tourism throughout the year. The temperature soars during the summer months of May and June making the Island and beach hot and humid. On the other hand, monsoons are also difficult months to explore the Island and the ruins. The best time to visit Viper Island is from November to May for the wanderer to scout, delve and relax in the different locals within the Island.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.seamain);
        tex.setText(" Viper Island has a Jail built by the Britishers a few hundred years ago to punish hardcore criminals and Indian freedom fighters. Partial remains of the Jail, gallows and cells still remain to remind the present generation of the bitter lives that the Indian freedom fighters went through for an independent India. Be privy to a light and sound show conducted every evening on the shores of Viper Island showcasing many incidents from the pre-independent era to the struggle of the freedom fighters. The show is organised every day except for Wednesdays.\n" +
                "\n" +
                "On the way to the Island, one may witness the beauty of the 7 point harbour with boats and ships wayfaring in the mighty ocean creating ripples of joy. A hint of the cellular jail too can be seen during the journey towards Viper Island." );
        tex.setTextColor(Color.BLACK);
        tex= findViewById(R.id.things);
        tex.setText(" A walk till the ruins of the jail built by the Britishers which is of historical relevance might enthuse visitors keen to know more about Indian history. A walk in and around the Island may help you explore views and landscapes of neighbouring Islands, the harbour and the vast ocean adding a mystic beauty about the place.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.priship);
        tex.setText(" Viper Island can be approached from city Port Blair both by road and sea. It will take approximately 45 minutes to reach Viper Island by road which also includes crossing the stretch of sea. One can start from the Phoenix Bay jetty which takes around 20 minutes to reach. The Harbor Cruise which plies to and fro from the jetty can help explore the different points of the harbor along with a trip to Viper Island.");
        tex.setTextColor(Color.BLACK);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(viperisalnd.this,IsalndActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}