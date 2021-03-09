package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class forestmuseum extends AppCompatActivity {

    Toolbar toolbar;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView5;
    TextView textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forestmuseum);


        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textView1 = findViewById(R.id.textview13);
        textView2 = findViewById(R.id.textview1g);
        textView3 = findViewById(R.id.textview1gg);
        textView5 = findViewById(R.id.textview1jg);
        textView6 = findViewById(R.id.textview1kg);


        textView1.setText("* To keep the memories of this trip intact, do not forget to carry the camera along with you.You can pick up souvenirs or little gifts for relatives or friends."+
                "\n" +
                "* In a nearby place called the “Andaman Kayak Tours”, you can go exploring the blue waters and island."+
                "\n"+
                "* The Chatham Saw Mill is a place of major tourist attraction. The income of many households in Andaman is generated from this mill. Thus, it serves a major economic purpose");
        textView2.setText("* To keep the memories of this trip intact, do not forget to carry the camera along with you."+
                "\n" +
                "* You might want to carry a bottle of water. Also, make sure that you are not littering any part by throwing away plastics or bottles"+
                "\n"+
                "* Try wearing full sleeves clothes to avoid any insect or mosquito bites in the forest area.");
        textView3.setText("* The Forest Museum in Andaman is very well maintained by the Forest Department of union territory."+
                "\n" +
                "* The arts, artefacts and carvings are a representation of the flora and fauna that was previously present inside the area of the forest."+
                "\n"+
                "* There are many people who are employed to clean the artefacts on regular periods of time. The Forest Museum, thus, generates employment too."+
                "\n"+
                "* You can witness the excellence of craftsmanship by the intricate details on pieces of art. There is a chain that is also made of wood. You will find many such pieces of art here.");
        textView5.setText("Anthropological Museum"+
                "\n" +
                "Kalapani Museum"+
                "\n"+
                "Science Centre"+
                "\n"+
                "Jogger’s Park"+
                "\n"+
                "Long Island");
        textView6.setText("New India Café"+
                "\n" +
                "Annapurna Café"+
                "\n"+
                "China Room"+
                "\n"+
                "Full Moon Café"+
                "\n"+
                "New Lighthouse Restaurant"+
                "\n"+
                "Waves");


    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            Intent i = new Intent(forestmuseum.this,museum.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}