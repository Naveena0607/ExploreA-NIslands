package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class glassbottom extends AppCompatActivity {

    TextView tex,textview;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glassbottom);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tex= findViewById(R.id.perfectsea);
        tex.setText("Glass Bottom Boat Ride is only available at North Bay Island in Andaman.\n"+
                "Facilities of glass bottom boat rides is available from Port Blair to Jolly Buoy Island and Red Skin Island, and also from water sports complex to North Bay Coral island. The charges for the boat ride depends on the duration of the ride.");
        tex.setTextColor(Color.BLACK);

        textview = findViewById(R.id.seamain);
        textview.setText("  -> The trip starts from the Water Sports Complex in Port Blair.\n" +
                "  -> You will board the boat to North Bay and reach the Jetty.\n" +
                "  -> This is where you board the Glass Bottom Boat and explore the sea surrounding the complex.\n" +
                "  -> The complete ride takes 20 minutes and returns back to North Bay Jetty.\n" +
                "  -> You can now either explore more of North Bay or board the boat for Port Blair.");
        textview.setTextColor(Color.BLACK);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            Intent i = new Intent(glassbottom.this,Activities.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}