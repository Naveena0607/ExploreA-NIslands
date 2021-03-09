package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class mangrovesafari extends AppCompatActivity {

    TextView textview;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mangrovesafari);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        textview = findViewById(R.id.perfect);
        textview.setText(" 1. Try not to put hands in the sea. You may get    pulled into the water.\n" +
                " 2. Be very cautious during the safari. A very   slight tilt in the sitting position of anybody   can make your craft unsteady as these diesel   country boats are not steady in the sea.\n" +
                " 3. Make sure that sufficient gap is maintained   between the returning and ongoing boats to the   Limestone Cave. As, there is only one way to   reach and return the cavern, there are chances   that a returning boat may hit your vessel and   your hands can get crushed if placed on the   edges. So, it’s better to take care of your hands.\n" +
                " 4. The turns are very narrow and sometimes   the sides and edges of the boat hit the banks of   the channel. Don’t panic in such a situation and   sit firmly to avoid falling off.\n" +
                " 5. Make sure you carry a valid permit while entering the region where it is mandatory to carry one.\n" +
                " 6. Try not to move alone. It is always better   to travel in the desired vehicle with the desired   group.\n" +
                " **One should never miss to go for a Mangrove Creek Safari in the Andaman Islands for an ultimate experience.");
        textview.setTextColor(Color.BLACK);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            Intent i = new Intent(mangrovesafari.this,Activities.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}