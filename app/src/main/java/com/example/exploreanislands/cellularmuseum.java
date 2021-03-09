package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class cellularmuseum extends AppCompatActivity {

    TextView textview;
    TextView textview1;
    TextView textview2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cellularmuseum);


        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textview = findViewById(R.id.textviewa2c);
        textview1 = findViewById(R.id.textview13);
        textview2 = findViewById(R.id.textview1g);
        textView3 = findViewById(R.id.textview1gg);
        textView4 = findViewById(R.id.textview1ig);
        textView5 = findViewById(R.id.textview1jg);
        textView6 = findViewById(R.id.textview1kg);
        textView7 = findViewById(R.id.textviewayc);

        textview.setText("Per Person: INR 30"+
                "\n" +
                "Still Camera: INR 200"+
                "\n"+
                "Video Camera/li: INR 1000"+
                "\n"+
                "Film shooting per day with prior permission: INR 10000");
        textView7.setText("Timings:5:15 pm | 6:15 pm | 7:15 pm in the evening."+
                "\n"+
                "Entry Fee:Rs. 50/- per person"+
                "\n"+
                "Light & Show Timings[Hindi]:06:00 pm & 07:15 pm Tuesday, Thursday, Saturday, and Sunday"+
                "\n"+
                "Light & Show Timings[English]:07:15 pm, Monday, Wednesday & Friday");
        textview1.setText("* Pay homage to the national heroes who spent their lives here fighting for your independence."+
                "\n" +
                "* Visit the photo gallery which showcases the various points of the freedom movement of India"+
                "\n"+
                "* Travel into the past in the museum which displays various artefacts linked to the inmates of Cellular Jail"+
                "\n"+
                "* Enjoy the light show which highlights the various aspects of the Indian struggle for freedom.");
        textview2.setText("* The museum at the Cellular jail closes at 1700 hours. The visitors are advised to plan their trip accordingly to thoroughly enjoy their time."+
                "\n" +
                "* The light and sound show takes place after the sun has set in the jail campus. For the viewers benefit, the show is played in both English and Hindi languages"+
                "\n"+
                "* The numbers of ticket for the light show are limited in quantity. It is better to just get them booked earlier by your travel agent so that there are no last-minute hassles"+
                "\n"+
                "* The weather here gets pretty hot and humid during the day. It’s better to travel light in cotton clothes."+
                "\n"+
                "There are sufficient food junctions to cater to your needs, so you need not carry eatables along with you for the trip.");
        textView3.setText("* The colonial prison reached completion in 1906. Its main purpose was to serve as a remote and inescapable jail for anyone against the colonial rule"+
                "\n" +
                "* Some its famous political prisoners include Yogendra Shukla, Maulana Ahmadullah, Diwan Singh Kalepani, Vaman Rao Joshi and Nand Gopal."+
                "\n"+
                "* Over a period of time, due to earthquakes and tsunamis only three wings have survived to tell the tale."+
                "\n"+
                "* The Panopticon architecture was used to construct the jail. According to it, there were seven wings surrounding the central tower which served as an intersection"+
                "\n"+
                "* According to this Panopticon concept, the prisoners could never know when they were placed under watch. This created quite a stir among the prisoners."+
                "\n"+
                "* There was a huge bell at the tower to alert the guards during a jailbreak situation."+
                "\n"+
                "* The light show is simply a dazzling treat to watch. It is certainly not worth missing.");
        textView4.setText("New Delhi to Andaman:4.55 hours"+
                "\n" +
                "Mumbai to Andaman:5.15 hours"+
                "\n"+
                "Kolkata to Andaman:2.15 hours"+
                "\n"+
                "Bangalore to Andaman:5.0 hours"+
                "\n"+
                "Pune to Andaman:8.3 hours"+
                "\n"+
                "Chennai to Andaman:3.0 hours");
        textView5.setText("Marina Park and Aquarium"+
                "\n" +
                "Ross Island"+
                "\n"+
                "North Bay Island"+
                "\n"+
                "Little Andaman"+
                "\n"+
                "Viper Island"+
                "\n"+
                "Havelock Island"+
                "\n"+
                "Bharatpur beach"+
                "\n"+
                "Mahatama Gandhi Marine National Park"+
                "\n"+
                "Kala Phatar beach");
        textView6.setText("Mandalay restaurant"+
                "\n" +
                "Adi Bengali restaurant"+
                "\n"+
                "BrewMerry’s"+
                "\n"+
                "Waves, Mily watch"+
                "\n"+
                "Coorbyn’s delight");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            Intent i = new Intent(cellularmuseum.this,museum.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}