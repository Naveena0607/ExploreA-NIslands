package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class digilpurisalnd extends AppCompatActivity {

    Toolbar toolbar;

    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digilpurisalnd);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tex=findViewById(R.id.abouthave);
        tex.setText("The fascinating town of Diglipur is the largest town in North Andaman Islands and yet often goes unnoticed because of its distance from other popular tourist attractions (Havelock and Port Blair). But, perhaps it is this same distance that makes Diglipur such a different and adventurous place!\n" +
                "\n" +
                "With its rich flora and fauna, natural parks, and lively marine life; There are so many options of how to actively spend your holidays here. From climbing the highest peak in the Bay of Bengal to exploring the breathtaking twin islands of Ross Island(Renamed as Netaji Subhash Chandra Bose Island) and Smith Isalnd, observing an active mud volcano or witnessing turtles (nesting and hatching) in pristine beaches, Diglipur is a wonder for all.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.perfectsea);
        tex.setText(" -> Diglipur is an offbeat destination and few tourists go here\n" +
                " -> It can be reached by road (12 hours) and ferry (8 to 12 hours) from Port Blair.\n" +
                " -> Diglipur is for adventure lovers. A visit to Ross and Smith island, climbing Saddle peak and watching turtle nesting are the key reasons for visiting.\n" +
                " -> The Diglipur town has only a few places of interest. The area nearby called kalipur is where most people stay and that’s where most of the adventure is.\n" +
                " -> There are only a few resorts and accommodations. The most popular being Pristine Resort and Turtle Nest Resort.\n" +
                " -> One must ideally spend at least 2 days in Diglipur to enjoy its many attractions");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.things);
        tex.setText("  1. Climb Saddle Peak\n" +
                "  2. Swim at Ross and Smith\n" +
                "  3. Watch Turtle Nesting/hatching at Kalipur Beach\n" +
                "  4. Trek to see active mud volcanoes\n" +
                "  5. Relax at Lamia Bay Beach\n" +
                "There are 3 more places that are often mentioned when one talks of activities in Diglipur. They are the Kalpong Hydroelectric Power Plant, Craggy island and Alfred Caves. These require a special permit for entry and are not generally open for tourism (As of March 2020). Do not venture out here without proper permission.");
        tex.setTextColor(Color.BLACK);
        tex= findViewById(R.id.seamain);
        tex.setText("  1. Ram Nagar Village\n" +
                "  2. Lamiya Bay Beach\n" +
                "  3. Alfred caves\n" +
                "  4. Pathi Level Beach\n" +
                "  5. Jal Triky\n" +
                "  6. Ross and Smith Isalnds\n" +
                "  7. Kalipur Beach\n" +
                "  8. Saddle Peak National park\n" );
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.priship);
        tex.setText("If you only want to visit Diglipur in the North, the best option would be to take a ship. There are direct government ship services available 3-4 times per week (please check the schedule in advance) from Port Blair.  The whole journey takes around 10 hours and longer but more convenient overnight sails are also available. Tickets can be booked at the Phoenix Bay office or at the administration block by ‘the Dolphin roundabout’ in Diglipur. ");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.govship);
        tex.setText("One can also travel up north by Andaman Trunk Road, crossing three creeks on the way and the Jarawa tribe area. The journey however is exhausting and it can take up to 12 long hours. There are a number of early morning buses plying daily from Port Blair to Diglipur. The tickets need to be bought in advance at least a day prior to the travel date. There are also private AC buses available offering more comfort but are pricier. Buses are available for the Port Blair Central Bus Stop in Aberdeen Bazaar, every day at 4am in the morning. However, seats are limited and require advance booking to travel ");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.flight);
        tex.setText("The Andaman Tourism Website mentions the services of seaplanes and helicopter facilities that flies between Diglipur and Port Blair. However this is not true. Seaplanes no longer function. Helicopters do but are only meant for medical emergencies. If extra seats are available,Tourists can book them. These seats are limited and cost about 5000INR (starting) per person. ");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.lang);
        tex.setText("Most spoken languages are English,hindi,Tamil.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.cur);
        tex.setText("Diglipur is a town area with a good number of population here so ATMs serving Indian currencies are readily available. Indian currency is the only currency accepted here as in other Andaman islands. However, it’s better to carry enough cash and that too in accepted denominations while traveling. 2000 rupee and 500 rupee notes might be a problem here so get those sorted at Port Blair. ");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.intconn);
        tex.setText("BSNL connections work the best.  Although Vodafone and airtel connections may work their connectivity will be weak. Internet connection in resorts might not be that well. ");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.continfo);
        tex.setText("In terms of safety, diglipur might not be as safe as Neil or Havelock or Port Blair. But it the overall friendly and helpful nature of the Andaman people makes it a good place to visit. However, please listen to the authorities and take adequate safety measures while traveling. Don’t visit restricted areas without a permit and be careful while snorkeling or scuba diving. Interact with the locals as much as you want but don’t try to exploit them with incentives to visit restricted and inaccessible places. Please abide by rules and regulations and don’t take corals and sea creatures home.\n" +
                "\n" +
                "Also while traveling, make sure you have a day’s time in hand for your return flight to the mainland. Don’t plan the flight the same day you return from Diglipur. ");
        tex.setTextColor(Color.BLACK);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(digilpurisalnd.this,IsalndActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}