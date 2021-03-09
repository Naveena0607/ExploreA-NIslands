package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class barrensanc extends AppCompatActivity {

    Toolbar toolbar;

    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barrensanc);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tex=findViewById(R.id.abouthave);
        tex.setText(" \n" +
                "Barren Island Wildlife Sanctuary (BIWS) is located in Andaman and Nicobar Islands of India. It is approximately 135 km (83.3 miles) away from Port Blair city in Andaman and Nicobar Islands, 1,190 km (739.4 miles) away from Chennai and 1200 km (745.6 miles) away from Visakhapatnam cities in India. The Island comprises barren area uninhabited by humans. Barren Island wildlife sanctuary comprises interesting basalt formations. Visitors can watch the topography of past lava flows and fast growing coral gardens. The BIWS spans an area of 8.1 sq km (3.12 sq miles) in the Barren Island.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.seamain);
        tex.setText("Barren Island Wildlife Sanctuary is open throughout the year. But the best time to visit Barren Island Wildlife Sanctuary is during the months of January to March. Visitors can reach the Barren Island Wildlife Sanctuary through boat facility from Port Blair. Visitors are advised to get in touch with officials of the Island for complete information on live aboard ship packages, scuba diving facilities, entry timings and fee etc. ");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.things);
        tex.setText("Visitors are advised to get in touch with the authorities of the Barren Island Wildlife Sanctuary about accommodation and other facilities along with charges.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.priship);
        tex.setText("Andaman and Nicobar Administration\n" +
                "\n" +
                "O/o Secretary (GA)\n" +
                "\n" +
                "Secretariat, Port Blair, \n" +
                "\n" +
                "Phone No: 03192-236 572\n" +
                "\n" +
                "Email id: asga123.and@nic.in");
        tex.setTextColor(Color.BLACK);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(barrensanc.this,sanctuaries.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
