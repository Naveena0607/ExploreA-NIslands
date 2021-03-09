package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class map extends AppCompatActivity {
    EditText source, destination;
    Button track;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        source = findViewById(R.id.esource);
        destination = findViewById(R.id.edest);
        track = findViewById(R.id.trabut);

        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= source.getText().toString().trim();
                String so= destination.getText().toString().trim();

                if(s.equals("") && so.equals("")) {
                    Toast.makeText(getApplicationContext(),"Enter Both Locaions",Toast.LENGTH_SHORT).show();
                }else{
                    DisplayTrack(s,so);
                }
            }
        });
    }

    private void DisplayTrack(String s, String so) {
        try{
            Uri uri=Uri.parse("https://www.google.co.in/maps/dir/"+s+"/"+so);
            Intent i=new Intent(Intent.ACTION_VIEW,uri);
            i.setPackage("com.google.android.apps.maps");
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(i);
        }catch (ActivityNotFoundException e){
            Uri uri=Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
            Intent i=new Intent(Intent.ACTION_VIEW,uri);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(i);

        }
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent i = new Intent(map.this,MainHomeActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}