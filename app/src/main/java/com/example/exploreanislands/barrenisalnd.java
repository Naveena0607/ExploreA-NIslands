package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class barrenisalnd extends AppCompatActivity {

    Toolbar toolbar;

    TextView tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barrenisalnd);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tex=findViewById(R.id.abouthave);
        tex.setText(" Due to lack of publicity and the fact that this active volcano has limited access to it, Barren island is not that popular amongst the tourists. But with the recent change of events and a few eruptions here and there, this volcano has been able to voice its fame with hot lava!");
        tex.setTextColor(Color.BLACK);

        tex= findViewById(R.id.perfectsea);
        tex.setText(" That’s right, this place is amongst the hottest region in the Andaman and Nicobar islands. So, while you’re planning to visit this place soon, here are a few things to keep in mind for your next vacation:\n" +
                "\n" +
                " 1. This island does not have any population and is only 3 Km in width.\n" +
                " 2. The crater of the so-called majestic crater of this island is 2 Km wide and the walls of this volcano are 250 to 350 m in height.\n" +
                " 3. Though the volcano on this island has stayed dormant for a long period, 1991 witnessed an eruption, which was considered to be major.\n" +
                " 4. In the year 2017, February month also witnessed a similar eruption letting the hot lava flow in the sea at once.\n" +
                " 5. Its recent popularity has placed this island amongst the top tourist attractions in Andaman and Nicobar islands.\n" +
                " 6. Having a diverse marine life on board, this island is made open for scuba diving and it is surely an experience that you should not miss here.\n" +
                " 7. It has also been recorded in 2017, that there were some stranded groups of goats on the island which were left behind by the passing steamer back in 1891. As per the story, British would leave livestock on certain islands in case they were stranded here at some point of time.");
        tex.setTextColor(Color.BLACK);


    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(barrenisalnd.this,IsalndActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

