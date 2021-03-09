package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class havelockisland extends AppCompatActivity {
    Toolbar toolbar;

    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_havelockisland);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tex=findViewById(R.id.abouthave);
        tex.setText("   Havelock Island (new official name: Swaraj Dweep), the most popular island among tourists, is located about 70 km north of the capital city, Port Blair. Swaraj Dweep (Havelock Island) has white sandy beaches, blue waters, and some of the best diving in the continent. Havelock(Swaraj) has well-justified fame for being a wonderland for travellers. Laze around on its secluded beaches, or explore its dense and serene mangroves; swim among exotic corals while you indulge in scuba diving or go out there and explore the wilderness on long jungle treks – Havelock has it all!");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.perfectsea);
        tex.setText("   The tourist season falls between November and mid-May and the peak season is between December- March. Monsoon season is between June and September. One should always expect light rains even during other seasons since its a tropical island.\n" +
                "Feb and March are considered the best for water sports due to low tides and better visibility.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.seamain);
        tex.setText("  **Radhanagar Beach or Beach No. 7: Voted as the best beach in the continent, Radhanagar Beach is without a doubt the most famous beach on the Andaman Islands. \n" +
                "  2. Elephant Beach\n" +
                "  3. Govindnagar Beach or Beach No. 1 and Beach no 2\n" +
                "  4. Beach No. 3\n" +
                "  5. Vijaynagar Beach or Beach No. 5\n" +
                "  6. Kalapathar Beach\n" );
        tex.setTextColor(Color.BLACK);
        tex= findViewById(R.id.things);
        tex.setText("  1. Scuba Diving\n" +
                "  2. Snorkeling\n" +
                "  3. Kayaking\n" +
                "  4. Jungle Trekking\n" +
                "  5. Trek to Elephant Beach\n" +
                "  6. Kalapathar Forest Trek\n" +
                "  7. Chaar Naarial Trek\n" +
                "  8. Bird Watching Tour\n" +
                "  9. Sunset Cruise\n" +
                "  10. Game Fishing\n");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.priship);
        tex.setText(" Havelock is connected to Port Blair (1.5 Hours) and Neil (1 hr) by private ferries.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.govship);
        tex.setText("   Havelock is connected to Rangat, Neil, Long Island, and Port Blair by government ferries.\n" +
                "   Three times a week, a ferryboat also leaves from Long Island to port Blair, stopping by  Havelock and Neil. However, for government ferries, only 4 days advance booking is possible. (If you are a foreign tourist, don’t forget the photocopies of your passport, visa, and permit before queuing up to buy the ticket.)");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.flight);
        tex.setText("   Helicopters ply to Havelock almost every day unless bad weather and strong winds make it impossible to fly. The tickets are often difficult to get as they are sold one day in advance and mainly meant for locals and/or emergency purposes.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.lang);
        tex.setText("Like elsewhere in India, knowing Hindi and English will get you by in Havelock. Some of the other languages spoken here are Bengali, Telugu, and Tamil.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.cur);
        tex.setText("Like the rest of the island in Andaman, the Indian Rupee is the currency used. Havelock has two ATM’s:\n" +
                "\n" +
                "We recommend you carry cash to the islands");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.intconn);
        tex.setText("Phones on the BSNL network work best, but Airtel and Vodafone also have towers here. Many cafes offer WiFi facility, but it can be slow and expensive.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.continfo);
        tex.setText("Havelock is arguably one of the safest places in the whole of India. The Andaman and Nicobar Police(ANP) force is an efficient one maintaining a favourable law and order. Bribing an officer on duty is out of the question. \n" +
                "\n" +
                "Please avoid swimming where the beaches are rocky\n" +
                "\n" +
                "Please don’t take a flight the same day you dive.\n" +
                "\n" +
                "Go2andaman strongly discourages the use of narcotics and drugs.\n" +
                "\n" +
                "ANP Havelock number: 03192-282405\n" +
                "Fire Station Havelock: 03192-282400\n" +
                "Coastal Security helpline: 1093");
        tex.setTextColor(Color.BLACK);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(havelockisland.this,IsalndActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}