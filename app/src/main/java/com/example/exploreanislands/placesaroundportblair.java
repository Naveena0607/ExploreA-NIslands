package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class placesaroundportblair extends AppCompatActivity {

    TextView textview,tex;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placesaroundportblair);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textview = findViewById(R.id.aboutport);
        textview.setText("      Port Blair is the capital city of Andaman and Nicobar Islands, housing the only commercial airport here, it is well connected by both sea & air and is known as the gateway to the islands.\n" +
                "\n" +
                "It resembles the tale of any other city in India. Hotels, restaurants, resorts, and shops adorn its streets. Apart from that, it also has a lot of history associated with it, but not just any, it’s the history of our fight for freedom.\u200B\n" +
                "\n" +
                "Named Kaalapani it was largely used by the British for deporting political prisoners from India. And now it happens to be the most prominent tourist destination in the Islands, and the hub of all tourist activities happening around the Isles.\n" +
                "\n" +
                "Due to the number of visitors traveling via Port Blair, the island has the best choices in hotels and staycations offering rooms for every budget.\n" +
                "\n" +
                "Water Sports choices on the island are abundant and range from everything from Scuba Diving and Parasailing to simpler ones like Snorkeling and Jet Skis.\n"+
                "Being the hub, Port Blair connects to all the other islands in Andaman which are open to tourists via road and ferries. North Andaman, consisting of Baratang, Rangat, Mayabunder, and Diglipur is connected directly via road, although some routes are faster traveled via ferry. Other tourist destinations in the islands like Havelock Island and Neil are connected via ferries mostly operating from the Phoenix Bay Jetty, while the Aberdeen Jetty connects Port Blair to nearby islands like North Bay Island, Ross Island and Viper Island.\n" +
                "\n" +
                "Port Blair itself has a wide variety of tourist attractions that fits every kind of traveler, whether you are looking for a relaxed beach-side kind of vibe, a historical getaway, or searching for a bit of fun and adventure on the sea. Thus providing a fulfilling holiday to anyone, be it, family, honeymooners, couples, or adventure lovers.");
        textview.setTextColor(Color.BLACK);

        tex= findViewById(R.id.perfectsea);
        tex.setText("  -> Port Blair has the only commercial airport in the islands, which also doubles as a defense airport, hence photography is strictly prohibited.\n" +
                "  -> Port Blair is a well-connected island. It is connected to most of the North Andaman via road.\n" +
                "  -> The only beach where swimming is allowed in Port Blair is the Corbyn's Cove Beach.\n" +
                "  -> You can easily reach Diglipur, Baratang, Rangat, Mayabunder, and HutBay via road.\n" +
                "  -> The island is also connected by ferry to all other tourist destinations in Andaman.\n" +
                "  -> The Internet is slow here, like the rest of the islands, but there are a lot of internet cafes and wi-fi spots where you can find decent connectivity.\n" +
                "  -> Port Blair has 3 beaches in total, which are: Carbyn’s Cove Beach, Wandoor Beach, and Mundapahar Beach- near Chidiyatapu.");
        tex.setTextColor(Color.BLACK);


        tex= findViewById(R.id.seamain);
        tex.setText("  1. Cellular Jail\n" +
                "  2. Corbyn's Cove Beach\n" +
                "  3. Wandoor Beach\n" +
                "  4. Chidiya Tapu & Mundapahar Beach\n" +
                "  5. Mount Harriet\n" +
                "  6. Rajiv Gandhi Water Sports Complex\n" +
                "  7. Anthropological Museum\n" +
                "  8. Samudrika Marine Museum\n" +
                "  9. Chatham Saw Mill\n" +
                "  10. Fisheries Museum\n");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.nearby);
        tex.setText("  1. Ross Island:\n" +
                "  2. North Bay Island:\n" +
                "  3. Jolly Buoy Island:\n" +
                "  4. Viper Island:\n");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.flight);
        tex.setText("Flights are the best way to reach Port Blair and it takes around 2-2.5 hours, in general, to reach here. Almost all the tourists visiting the Islands prefer flight as it is more convenient and hassle-free.\n" +
                "\n" +
                "Direct flights are available from Chennai, Mumbai, Bangalore, Kolkata, and Delhi so you don’t have to go through the hassle of a layover.\n" +
                "\n" +
                "Try contacting your local ticket supplier for booking,\n" +
                "\n" +
                "If you are booking a package from us, you will also have the option to let us book the tickets at an affordable price.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.ship);
        tex.setText("Coming here in a ship can be affordable but it takes more than 3-4 days (50-60 Hours) to reach Andaman from Vishakapatnam and Kolkata.\n" +
                "\n" +
                "People coming from Kolkata travel a distance of 1255 KMs to reach Port Blair while people coming from Chennai cover 1190 KMs for the same duration of time.\n" +
                "\n" +
                "The fare generally ranges from INR 2900-3000 for the Bunk Class, INR 7455-9365 for Cabin 2nd Class and INR\u200C 10,000-11,295 for Deluxe 1st Class.\n" +
                "\n" +
                "Before booking, one must also consider several factors including, Sea Sickness, Weather, Food, and Clean Cabins.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.lang);
        tex.setText("Within the mix of many cultures and languages, Hindi, Tamil, and Bengali is the most common language in Port Blair. Most, if not all people, speak Hindi so you can easily travel around here. Most people understand or speak English too.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.cur);
        tex.setText("Just like the rest of the islands, Port Blair uses the Indian Rupee (INR) as the currency. There are a lot of ATM’s and branches of all major banks are available here. For currency exchange, you can visit any branch of SBI with your passport and fill up the exchange form.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.intconn);
        tex.setText("The Internet is slow in Port Blair, similar to other islands. There are a lot of internet cafes and shops on the island that provide a slow yet usable connection to its customers.\u200C Make sure to visit one of them, if you are looking for some connectivity urgently. As for the cellular connection, BSNL, Airtel, and Vodafone networks are available, BSNL being the most reliable among the three.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.continfo);
        tex.setText("  Police: 100 (24x7, Toll-Free)\n" +
                "  Fire: 101 (24x7, Toll-Free)\n" +
                "  Tourist Information: 03192-232694");
        tex.setTextColor(Color.BLACK);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(placesaroundportblair.this,InsightActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}