package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class bypriferry extends AppCompatActivity {

    Toolbar toolbar;

    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bypriferry);

        tex=findViewById(R.id.abouthave);
        tex.setText("   The Makruz Gold was built in 1996 by MAK Logistics Pvt Ltd. It is in operation in Andaman Island since then. It is one of the fastest passenger ferries sailing in Andaman. It can accommodate nearly 330 travellers at a time. As the name suggests, it is one of the luxurious ferries in Andaman. Therefore the price of the ticket is a bit expensive. Passengers above 2 years are requested to pay Rs. 2000/- and below that, they are supposed to pay Rs. 105/-. The fully Air-conditioned Makruzz Gold Catamaran covers the distance between Port Blair to Havelock in about 1.5 hours. Recently, in 2017 February, the cruise was completely dedicated to tourists as part of promoting tourism. Tourists can avail the ferry service through online booking.");
        tex.setTextColor(Color.BLACK);

        tex=findViewById(R.id.about);
        tex.setText("   Makruz, a catamaran passenger ferry, was built by Damen Shipyard in Singapore in 2016. It is the 1st private service that started operating in Andaman. The ferry takes only 90 minutes to reach Havelock Island from Port Blair. Subjected to sea conditions, Makruz does not sail in the months from June to September. It also has a coffee shop on the board. It is one of the highest speed catamaran ferries. The materials used for the interiors of the ferry are ‘fire retardant’. The onboard crew of the ferry give personalised services to each of the travellers. Inside the ferry one could see the ‘smoke and heat’ detectors.");
        tex.setTextColor(Color.BLACK);


        tex= findViewById(R.id.avai);
        tex.setText("   Coastal cruise is a venture of MAK logistics Pvt.ltd. It can accommodate 218 passengers at a single go. The cruise is adorned with the latest kinds of automation and safety measures of international standards. Ferry tickets for travellers above 2 years range from Rs. 600/- to Rs.1000/- and kids below 2 years are requested to pay Rs. 105/-. Compared to other cruises, it is one of the most affordable and reliable ferries on the Island. It is mostly liked by both the locals and tourists.");
        tex.setTextColor(Color.BLACK);


        tex= findViewById(R.id.state);
        tex.setText("   To reduce the rush in government ferries, Green Oceans was launched in mid of 2015. It is smaller in size compared to other cruises like Makruz Gold, Coastal Cruise and Makruz ferry. The ticket rate ranges from Rs. 900 to Rs. 1250 for adults above 2 years and below that it costs Rs. 105/- only. For nature lovers and photography enthusiast, Green Ocean is the first choice as it is more spacious and allows travellers to enjoy the beauty of nature by standing on the deck.\n" +
                "These are popular ferries seen in Andaman and Nicobar Islands. People who are planning to visit the Island must book any one of the above mentioned ferries. It is advisable that before booking the hotel, one must book the ferry, to avoid last moment rush.");
        tex.setTextColor(Color.BLACK);


        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(bypriferry.this,TransActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}