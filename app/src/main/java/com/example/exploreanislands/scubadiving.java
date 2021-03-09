package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class scubadiving extends AppCompatActivity {
    TextView textview,tex,text;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scubadiving);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textview = findViewById(R.id.perfect);
        textview.setText("   -> Water Depth\n" +
                "   -> Clarity of water\n" +
                "   -> Safety\n" +
                "   -> Population of Corals\n" +
                "   -> Fish Population\n" +
                "   -> Water Current\n" +
                "   -> Weather");
        textview.setTextColor(Color.BLACK);

        tex= findViewById(R.id.main);
        tex.setText("  1. Havelock Island\n" +
                "  2. North Bay Island\n" +
                "  3 .Neil Island\n" +
                "  4. Port Blair\n"+
        "  5. Barren Island");
        tex.setTextColor(Color.BLACK);

        text= findViewById(R.id.havelockmain);
        text.setText("  1. Barracuda City:\n" +
                "  2. Seduction Point:\n" +
                "  3. Aquarium:\n" +
                "  4. Turtle Bay:\n" +
                "  5. Mac Point:\n" +
                "  6. Lighthouse:\n" +
                "  7. The Wall:\n" +
                "  8. Pilot Reef:\n" +
                "  9. Minvera Lidge:\n" +
                "  10.Jonnys Geroge");
        text.setTextColor(Color.BLACK);

        text= findViewById(R.id.neilmain);
        text.setText("  1. Busy Burro\n" +
                "  2. Rocky's\n" +
                "  3. Margerita\n" +
                "  4. Junction\n" +
                "  5. Manta Point/Robin's Bay\n" +
                "  6. Nursery/ One Bottle\n" +
                "  7. Bus Stop\n" +
                "  8. Aquarium/ Neil Garden\n" +
                "  9. Lighthouse");
        text.setTextColor(Color.BLACK);

        text= findViewById(R.id.portblairmain);
        text.setText("  1. Mahatma Gandhi Marine National Park.\n" +
                "  2. Carbyn's Cove Beach \n" +
                "  3. snake island (no snakes here)\n" +
                "  4. Corruption Rock\n" +
                "  5. Rutland Island\n" +
                "  6. Snake Island");
        text.setTextColor(Color.BLACK);


        text= findViewById(R.id.Barrenmain);
        text.setText("  1. Purple Haze \n" +
                "  2. Manta Point  \n" +
                "  3. Coral Paradise )\n" +
                "  4. Barren Garden-‘Washing Machine’ \n" +
                "  5. Manta Bay \n" +
                "  6. Auditorium & Gallery");
        text.setTextColor(Color.BLACK);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            Intent i = new Intent(scubadiving.this,Activities.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}