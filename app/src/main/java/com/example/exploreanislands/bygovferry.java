package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class bygovferry extends AppCompatActivity {


    Toolbar toolbar;
    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bygovferry);


        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tex=findViewById(R.id.abouthave);
        tex.setText(" As the Island lacks good road transportation facilities, Islanders mainly depend on ferry services for their daily needs. There have been several cases where travellers share their sorrowful experiences when they didn’t get the cruises in Andaman and they were forced to spend their whole trip in Port Blair. To make the trip trouble-free one should book the ferries to visit the main places on the Island. Tour operators like Andaman Tour Travel always give special care on providing ferry service. There is also a benefit depending on travel agencies. Even if a booked ferry (due to technical issues) is not available on that particular day, they will arrange an alternate one. Such cases arise mainly on seasonal days. ");
        tex.setTextColor(Color.BLACK);


        tex= findViewById(R.id.avai);
        tex.setText(" Government ferry of Andaman Island is one of the oldest and convenient modes of transportation for Islanders and tourists. Through government ferry, travellers can easily visit places like little Andaman, Havelock, Campbell, Mayabunder, Strait Island, Long Island and Neil islands. The cost of transportation is very cheap. People above age 2 are supposed to pay Rs.200/- and below it is liable to pay Rs.100/-. It is operated by Directorate of Shipping services of Andaman. The one major drawback of government ferry is it does not provide any online booking facility. So travellers have to queue up in the counters. During the peak season (October-January), it would be very difficult for tourists to grab the tickets. Most tourists rely on their travel agencies or queue up in the counters for booking ferry tickets. Passengers are allowed to walk inside the ferry while sailing in the water. Also, they host a small snacks bar for travellers. The seats inside the cruise are well-conditioned. The authorities clean the ferry twice in a week. Being very economical, it is been loved by all.");
        tex.setTextColor(Color.BLACK);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(bygovferry.this,TransActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}