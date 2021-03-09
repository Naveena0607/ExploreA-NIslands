package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class bluebird extends AppCompatActivity {
    Toolbar toolbar;

    TextView textview1;
    TextView textview2;
    TextView textView3;
    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluebird);

        textview1 = findViewById(R.id.text);
        textview2 = findViewById(R.id.text1);
        textView3 = findViewById(R.id.text2);
        textView4 = findViewById(R.id.text3);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textview1.setText("The multi cuisine restaurant serves an exceptional fare that you will absolutely enjoy"+
                "\n"+
                "The Radhanagar Beach in Havelock is just a speedboat ride away");

        textview2.setText("Air conditioning"+
                "\n"+
                "Allergy-free room"+
                "\n"+
                "Desk"+
                "\n"+
                "Dining area"+
                "\n"+
                "Coffee / tea maker"+
                "\n"+
                "Cable / satellite TV"+
                "\n"+
                "Extra long beds"+
                "\n"+
                "Bath / shower");

        textView3.setText("Non-smoking rooms"+"\n");

        textView4.setText("Free parking"+"\n"+"Free breakfast"+"\n"+"Beach"+"\n"+"Bicycle rental"+
                "\n"+"Kids stay free"+"\n"+"Free shuttle or taxi services"+"\n"+"24-hour security"+"\n"+"Baggage storage");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(bluebird.this,hotels.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}