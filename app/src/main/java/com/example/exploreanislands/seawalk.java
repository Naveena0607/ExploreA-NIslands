package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class seawalk extends AppCompatActivity {
    TextView tex,text;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seawalk);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tex= findViewById(R.id.main);
        tex.setText("  1. Havelock Island\n" +
                "  2. North Bay Island\n" );
        tex.setTextColor(Color.BLACK);


        text= findViewById(R.id.mainwalk);
        text.setText("  -> You will be taken to through the 5-10 min training tutorial where you will learn some tips on walking correctly inside the water and hand signs for communication during your Sea Walk.\n" +
                "  -> Next, a helmet type breather with transparent front will be fixed on your head comfortably and will be connected with the rest of the apparatus for normal underwater breathing.\n" +
                "  -> After the setup you will be taken to the Walking-Spot and slowly leveraged inside the water with wide netted boundaries for maximum safety.\n" +
                "  -> A team of Sea Walk guides will be there with you every step of the way to make sure your experience is safe, hassle-free, and completely out of the world.");
        text.setTextColor(Color.BLACK);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            Intent i = new Intent(seawalk.this,Activities.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}