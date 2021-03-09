package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class peopleofandaman extends AppCompatActivity {
    Toolbar toolbar;

    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peopleofandaman);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tex= findViewById(R.id.lang);
        tex.setText("  Bengali - 25.7%\n" +
                "  Hindi - 18.2%\n" +
                "  Tamil - 17.7%\n" +
                "  Telugu - 12.9%\n" +
                "  Malayalam - 8.1%\n" +
                "  Nicobarese - 8.05%\n" +
                "  Kurukh/Oraon - 3.9%\n" +
                "  Munda - 1.3%");
        tex.setTextColor(Color.BLACK);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            Intent i = new Intent(peopleofandaman.this,GeneralInfo.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}