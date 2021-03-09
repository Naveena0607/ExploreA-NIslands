package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class BeachActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beach);

        TextView t1 = findViewById(R.id.textViewd);


        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BeachActivity.this,Beachesinportblair.class);
                startActivity(i);
                finish();
            }
        });
        TextView t2 = findViewById(R.id.textViewe);


        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BeachActivity.this,Beachesinhavelock.class);
                startActivity(i);
                finish();
            }
        });
        TextView t3 = findViewById(R.id.textViewf);


        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BeachActivity.this,beachesinneil.class);
                startActivity(i);
                finish();
            }
        });
        TextView t4 = findViewById(R.id.textViewg);


        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BeachActivity.this,beachesinbaratang.class);
                startActivity(i);
                finish();
            }
        });
        TextView t5 = findViewById(R.id.textViewh);


        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BeachActivity.this,beachesindigilpur.class);
                startActivity(i);
                finish();
            }
        });
        TextView t6 = findViewById(R.id.beachlong);


        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BeachActivity.this,beachesinlong.class);
                startActivity(i);
                finish();
            }
        });
        TextView t7 = findViewById(R.id.textViewj);


        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BeachActivity.this,beachesinrangat.class);
                startActivity(i);
                finish();
            }
        });
        TextView t8 = findViewById(R.id.textViewl);


        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BeachActivity.this,beachesinmayabandur.class);
                startActivity(i);
                finish();
            }
        });
        TextView t9 = findViewById(R.id.textViewo);


        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BeachActivity.this,littleislandbeach.class);
                startActivity(i);
                finish();
            }
        });
        TextView t10 = findViewById(R.id.textViewq);


        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BeachActivity.this,rossislandbeach.class);
                startActivity(i);
                finish();
            }
        });
        toolbar=findViewById(R.id.toolbarB);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            Intent i = new Intent(BeachActivity.this,InsightActivity.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}