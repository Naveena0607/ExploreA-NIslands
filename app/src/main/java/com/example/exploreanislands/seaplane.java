package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class seaplane extends AppCompatActivity {

    TextView text;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seaplane);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        text= findViewById(R.id.seamain);
        text.setText("  -> Sea Plane rides are subject to weather conditions.\n" +
                "  -> Refund if the trip does not take place because of weather conditions.\n" +
                "  -> The plane can carry a maximum of 9 Persons only.\n" +
                "  -> The trip is CLOSED on Sundays.\n" +
                "  -> NO REFUND Upon Cancellation.\n" +
                "  -> Any special request can be mentioned while filling the form.");
        text.setTextColor(Color.BLACK);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            Intent i = new Intent(seaplane.this,Activities.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}