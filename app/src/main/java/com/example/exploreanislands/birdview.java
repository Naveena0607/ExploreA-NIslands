package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class birdview extends AppCompatActivity {

    TextView textview;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birdview);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        textview = findViewById(R.id.perfect);
        textview.setText("  2. Mount Harriet\n"+ "  3. Sippi Ghat\n" + "  4. Farar Ganj\n" + "  5. Havelock Islands\n" +
                "  6. South Andaman\n"+ "  7. Neil Island Island\n" + "  8. Little Andaman Island (Hut Bay)\n" + "  9. Cambell Bay Island (Great Nicobar)");
        textview.setTextColor(Color.BLACK);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            Intent i = new Intent(birdview.this,Activities.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}