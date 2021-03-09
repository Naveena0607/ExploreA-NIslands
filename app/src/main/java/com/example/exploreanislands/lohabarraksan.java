package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class lohabarraksan extends AppCompatActivity {

    Toolbar toolbar;

    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lohabarraksan);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tex=findViewById(R.id.abouthave);
        tex.setText("Lohabarrack Salt Water Crocodile Sanctuary (LSWCS) is located in the Andaman and Nicobar Islands of India. It is approximately 20 km (12.4 miles) away from Port Blair city in Andaman and Nicobar Islands, 1,350 km (838.8 miles) away from Chennai and 1,216 km (755.5 miles) away from Visakhapatnam cities in India.Lohabarrack Salt Water Crocodile Sanctuary (LSWCS) is situated north of Mahatma Gandhi Marine National Park in Andaman and Nicobar Islands of India. The LSWCS area is covered with luxuriant mangroves, tropical evergreen forests, sandy beaches, creeks, freshwater marsh lands and flat wetlands etc. The LSWCS spans an area of approximately 22.21 sq km (8.57 sq miles) in the Andaman and Nicobar Islands.\n" +
                "Flora and Fauna at LSWCS");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.seamain);
        tex.setText("Lohabarrack Salt Water Crocodile Sanctuary is open throughout the year. Visitors can reach the Lohabarrack Salt Water Crocodile Sanctuary through boat facility from Port Blair. Visitors are advised to get in touch with officials of the Island for complete information on live aboard ship packages, scuba diving facilities, entry timings and fee etc.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.things);
        tex.setText("Visitors are advised to get in touch with the authorities of the Lohabarrack Salt Water Crocodile Sanctuary about accommodation and other facilities along with charges.");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.priship);
        tex.setText("Directorate of Tourism\n" +
                "Incharge (Tourism Information)\n" +
                "Andaman & Nicobar Administration\n" +
                "Kamaraj Road, Port Blair – 744101\n" +
                "\n" +
                "Phone & Fax: 03192-232 694, 232 642 & Fax: 03192-232 747, 230 933\n" +
                "E-Mail id: accomodation6@gmail.com");
        tex.setTextColor(Color.BLACK);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(lohabarraksan.this,sanctuaries.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}