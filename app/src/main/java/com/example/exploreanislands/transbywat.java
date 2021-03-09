package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class transbywat extends AppCompatActivity {


    Toolbar toolbar;

    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transbywat);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        tex=findViewById(R.id.abouthave);
        tex.setText("Passenger ship to Port Blair is another popular mode of transport ply from the nearby port cities namely Chennai, Kolkata, and Visakhapatnam. If you want to travel to Andaman by ship, then Kolkata, Vizag, and Chennai are the places to go. The ship tours take place 3-4 times every month, which can change as well. Besides, the journey takes around 60-70 hours to touch down Andaman and Nicobar Islands tour.\n"+
                "Schedule: The sailing schedules are announced on the government website a month in advance. Passenger ships from Kolkata and Chennai have 3 to 4 sailing schedules every month. From Visakhapatnam, only one sailing is scheduled in a month. The voyage takes almost 50 to 60 hours during good weather conditions. These passenger ships have all the basic facilities for a comfortable journey.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.avai);
        tex.setText("International tourists need to get a Restricted Area Permit (RAP) to visit Andaman Nicobar Islands. It is easily available on arrival at Port Blair by flight or ship. A permit can be obtained from the Immigration authorities, Port Blair. The initial permit lasts for 30 days and it can be extended for another 15 days.\n" +
                "\n" +
                "A permit can also be obtained from Indian Mission Overseas and Foreigner’s Registration Offices at New Delhi, Mumbai, Chennai, and Kolkata. Restricted Area Permit (RAP) is also easily available from the Immigration Authorities at the Airport of New Delhi, Kolkata, Chennai, and Mumbai.\n" +
                "\n" +
                "The regular permit covers the following places: South Andaman Island, Middle Andaman Island, Little Andaman Island (except tribal reserve), Neil Island, Havelock Island, Long Island, Diglipur, Baratang, North Passage, and islands in the Mahatma Gandhi Marine National Park (excluding islands – Boat Hobday, Twin, Tarmugli, Malay and Pluto). In addition, the permit covers day halts at South Cinque Island, Ross Island, Narcondam Island, Interview Island, Brother Island, Sister Island and Barren Island.");
        tex.setTextColor(Color.BLACK);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(transbywat.this,TransActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}