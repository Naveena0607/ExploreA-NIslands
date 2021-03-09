package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class samudrikamuseum extends AppCompatActivity {
    TextView textview;
    TextView textview1;
    TextView textview2;
    TextView textView3;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samudrikamuseum);
        textview = findViewById(R.id.textviewa2c);
        textview1 = findViewById(R.id.textview13);
        textview2 = findViewById(R.id.textview1g);
        textView3 = findViewById(R.id.textview1gg);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textview.setText("Adults: INR 50"+
                "\n" +
                "Student (with ID): INR 20"+
                "\n"+
                "Camera: INR 50"+
                "\n"+
                "Entry is free for senior citizens and specially-abled citizens on providing a valid identity card.");
        textview1.setText("* There are several activities that can be done in and around the museum."+
                "\n" +
                "* coral cruising, beach activities."+
                "\n"+
                "* Ferrying to islands, Forest walk."+
                "\n"+
                "* Visiting museums, water sports, photography"+
                "\n"+
                "* Beach walk and shopping."+
                "\n"+
                "* A perfect destination for travel, the places nearby Samudrika Marine museums attracts tourist of every age group from every continent to have an enjoyable moment at Andaman.");
        textview2.setText("* Do not feed the fish or crocodiles, as it is against the rules set by the authorities."+
                "\n" +
                "* Do not litter the place, dispose of waste at a proper place."+
                "\n"+
                "* Be careful not to touch any of the relics or exhibits as many are rare showpieces and fragile.");
        textView3.setText("* The museum is maintained by Indian Navy."+
                "\n" +
                "* The skeleton displayed outside the museum is that of a baby blue whale, which got beached in one of the shores of Nicobar Islands."+
                "\n"+
                "* There is no entry fee for handicapped visitors and senior citizens. However, specific ID proof has to be submitted before entering the museum.");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            Intent i = new Intent(samudrikamuseum.this,museum.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}