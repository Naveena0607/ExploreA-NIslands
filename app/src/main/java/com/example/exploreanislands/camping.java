package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class camping extends AppCompatActivity {
    TextView text;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camping);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        text= findViewById(R.id.perfectcamp);
        text.setText("  1. Havelock Island\n" +
                "  2. Port Blair\n" +
                "  3. Neil Island\n" +
                "  4. And VArious Islands and Forests");
        text.setTextColor(Color.BLACK);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            Intent i = new Intent(camping.this,Activities.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}