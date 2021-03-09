package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class aboutus extends AppCompatActivity {

    TextView tex;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        tex=findViewById(R.id.text);
        tex.setText("Version:1.0");

        tex=findViewById(R.id.textco);
        tex.setText("“TRAVELING – IT LEAVES YOU SPEECHLESS, THEN TURNS YOU INTO A STORYTELLER.”\n"+
                "-IBN BATTUTA");


        tex=findViewById(R.id.textcopyinfo);
        tex.setText("All rights reserved .No part of this app may be reproduced or used in any manner without written permission of the copyright owner.");

        tex=findViewById(R.id.textcopy);
        tex.setText("Copyright © 2020 by Dr. B R Ambedkar Institute of Technology\n");


        tex=findViewById(R.id.textmain);
        tex.setText("At Explore A&N Isalnds we believe everyone should travel and explore all beautiful places of the world and improve ones knowledge about nature and attractive places of the world.Our goal in this app is to make everyone aware of beautiness and rich heritage of flora and fauna of Andaman And Nicobar Isalnds.Hope our app helps you to know about Andaman And Nicobar Isalnds.");
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(aboutus.this,MainHomeActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}