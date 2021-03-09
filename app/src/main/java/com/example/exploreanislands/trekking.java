package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class trekking extends AppCompatActivity {

    TextView textview,tex,text;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trekking);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tex= findViewById(R.id.main);
        tex.setText("  1. Mount Harriet – Madhuban\n" +
                "  2. Chidiya Tapu – Black Mountain\n" +
                "  3. Havelock – Elephant Beach\n" +
                "  4. Baratang – Limestone Caves\n"+
                "  5. Diglipur Island – Alfred Caves\n"+
                "  6. Diglipur Island – Saddle Peak");
        tex.setTextColor(Color.BLACK);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            Intent i = new Intent(trekking.this,Activities.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}