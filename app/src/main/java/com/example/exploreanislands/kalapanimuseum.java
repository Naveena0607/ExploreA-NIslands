package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class kalapanimuseum extends AppCompatActivity {

    TextView textView5;
    TextView textView6;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalapanimuseum);

        textView5 = findViewById(R.id.textview1jg);
        textView6 = findViewById(R.id.textview1kg);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textView5.setText("Netaji Subhash Chandra Bose Island"+
                "\n" +
                "Mahatma Gandhi Marine National Park"+
                "\n"+
                "Viper Island"+
                "\n"+
                "Samudrika Marine Museum"+
                "\n"+
                "Chidiya Tapu Beach"+
                "\n"+
                "Mount Harriet National Park"+
                "\n"+
                "Corbyn Cove Beach"+
                "\n"+
                "Zonal Anthropological Museum"+
                "\n"+
                "Red Skin Island");
        textView6.setText("Amaya"+
                "\n" +
                "Annapurna"+
                "\n"+
                "New Lighthouse Restaurant"+
                "\n"+
                "The Munching Baba"+
                "\n"+
                "Brewberrys\n"+
                "\n"+
                "Ananda Restaurant\n"+
                "\n"+
                "Junglee Mirchi"+
                "\n"+
                "The Love Garden"+
                "\n"+
                "Sea Food Delights"+
                "\n"+
                "Mandalay Restaurant");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            Intent i = new Intent(kalapanimuseum.this,museum.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}