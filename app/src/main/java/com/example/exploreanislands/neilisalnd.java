package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class neilisalnd extends AppCompatActivity {
    Toolbar toolbar;

    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neilisalnd);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tex=findViewById(R.id.abouthave);
        tex.setText("   Neil Island (new official name: Shaheed Dweep), is Known for its magnificent biodiversity, unexplored coral reefs, white sandy beaches, and tropical woodlands, Neil Island is perfect for a peaceful time off. This Island has an area of 13.7 square kilometers only. Given the flat landscape and the small area, Neil can be bicycled around with minimal effort. With its laid-back vibe, and lucid charm the island is soothingly different from its neighboring Havelock.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.perfectsea);
        tex.setText(" ->Neil is a tiny but beautiful island located 37 km south of Port Blair.\n" +
                " ->Neil Island is also known as the vegetable bowl of Andaman Islands; thanks to its climatic conditions the land is ideal for the cultivation of fruits and vegetables.\n" +
                " ->Neil is connected to both Port Blair (1.5 hours) and Havelock (45 minutes) by private ferries and to Port Blair, Havelock, and Rangat by Government ferries.\n" +
                " ->The Internet is mostly unavailable in Neil. If lucky, one can find patchy BSNL data network on phone.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.seamain);
        tex.setText("  1. Laxmanpur Beach\n" +
                "  2. Natural Rock Formation\n" +
                "  3. Sitapur Beach\n" +
                "  4. Bharatpur Beach\n" +
                "  5. Ramnagar Beach\n" );
        tex.setTextColor(Color.BLACK);
        tex= findViewById(R.id.things);
        tex.setText("  1. Scuba Diving\n" +
                "  2. Snorkeling\n" +
                "  3. Jungle Treks and Sports Fishing\n" +
                "  4. Cycling\n" +
                "  5. Game Fishing\n");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.priship);
        tex.setText("Neil is connected to Port Blair (1.5 hours) and Havelock (1 hour) by a private ferry.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.govship);
        tex.setText("Neil is connected to Rangat, Havelock, and Port Blair by government ferries.Three times a week, a ferryboat also leaves from Long Island to Port Blair, stopping in Havelock and in Neil. However, for government ferries, only 4 days advance booking is possible. (If you are a foreign tourist, don’t forget the photocopies of your permit, visa, and passport before queuing up to buy the ticket.)");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.flight);
        tex.setText("Helicopters fly to Neil a couple of times during the week. Their schedules are generally undecided and getting a ticket is often difficult.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.lang);
        tex.setText("Though Hindi is the most commonly spoken language here, it is also Bengali that is spoken at large in Neil Island. English is understood but with difficulty.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.cur);
        tex.setText("Like the rest of the island in Andaman, the Indian Rupee is the currency used. Neil has only two ATMs, (As on 20/4/2017) both at the bazaar – Syndicate Bank and Cooperative Bank. Both also have a branch each; however, no money exchange takes place here. Some small resort owners do accept foreign currency especially in emergency situations and later exchange this in Port Blair.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.intconn);
        tex.setText("No broadband connection is available in Neil Island. Data network is available on phone sometimes but is patchy. BSNL is the network with the best connectivity.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.continfo);
        tex.setText("The Andaman and Nicobar Police is the law enforcement agency for the union territory of Andaman and they take care of the discipline department is an efficient one and in the case of emergencies you can get in touch with them on the following numbers:\n" +
                "Police Station: 03192-282602\n" +
                "Police Radio: 03192-282676");
        tex.setTextColor(Color.BLACK);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(neilisalnd.this,IsalndActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}