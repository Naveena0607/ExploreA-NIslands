package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class gamefishing extends AppCompatActivity {

    TextView textview, tex, text;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamefishing);

        toolbar = findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        tex = findViewById(R.id.main);
        tex.setText("  1. Blue Marlin\n" +
                "  2. Black Marlin\n" +
                "  3. Sailfish\n" +
                "  4. Dorado\n" +
                "  5. Dogtooth Tuna\n" +
                "  6. Yellow Fin Tuna\n" +
                "  7. Red Snapper\n" +
                "  8. Grouper\n" +
                "  9. coral Trout\n" +
                "  10. Big Spanish Mackerel\n" +
                "  11. Bluefin\n" +
                "  12. Bigeye\n" +
                "  13. Pilot Trevally\n" +
                "  14. Sailfish\n" +
                "  15. Wahoo\n" +
                "  16. Marlin\n" +
                "  17. Famed Giant Trevally \n");
        tex.setTextColor(Color.BLACK);

        text = findViewById(R.id.fishmain);
        text.setText("  1. Havelock Island\n" +
                "  2. Port Blair\n" +
                "  3. Cinque Island\n" +
                "  4. Rutland Island");
        text.setTextColor(Color.BLACK);

        text = findViewById(R.id.how);
        text.setText("  -> You can select a boat from the three options available and get ready for the adventure.\n" +
                "  -> You will be given some instructions on how to operate the fishing rods, if you are new to the game.\n" +
                "  -> Fishing Rods, Baits and other necessary stuff will be provided by us.\n" +
                "  -> Next, we will take you on the boat to spots known for abundance of fishes including the uninhabited islands of Cinque where you can indulge yourself in fishing.\n" +
                "  -> You will also get to explore islands and areas that are not opened for tourists and aren't discovered by much people. ");
        text.setTextColor(Color.BLACK);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(gamefishing.this, Activities.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);

    }
}