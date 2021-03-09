package com.example.exploreanislands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

import java.io.File;

public class MainHomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ImageView general, ini, pack, trans;
    DrawerLayout drawable;
    NavigationView navigationView;
    Toolbar toolbar;
    private FirebaseAuth mAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

        mAuth=FirebaseAuth.getInstance();

        drawable = findViewById(R.id.drawable);
        navigationView = findViewById(R.id.design_navigation_view);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawable, toolbar, R.string.navopen, R.string.navclo);
        drawable.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        general = findViewById(R.id.imageViewd);
        ini = findViewById(R.id.imageViewA);
        pack = findViewById(R.id.imageViewB);
        trans = findViewById(R.id.imageViewC);


        general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainHomeActivity.this, GeneralInfo.class);
                startActivity(i);
                finish();
            }
        });
        ini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(MainHomeActivity.this, InsightActivity.class);
                startActivity(k);
                finish();

            }
        });
        pack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(MainHomeActivity.this, packages.class);
                startActivity(m);
                finish();

            }
        });
        trans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(MainHomeActivity.this, TransActivity.class);
                startActivity(n);
                finish();

            }
        });


    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.navhome:
                break;

            case R.id.logout:
                logOut();
                break;

            case R.id.rateus:
                Intent i = new Intent(MainHomeActivity.this, shareactivity.class);
                startActivity(i);
                break;

            case R.id.About:
                Intent i2 = new Intent(MainHomeActivity.this, aboutus.class);
                startActivity(i2);
                break;


            case R.id.map:
                Intent i1 = new Intent(MainHomeActivity.this, map.class);
                startActivity(i1);
                break;

            case R.id.share:
            Intent in =new Intent(Intent.ACTION_SEND);
            in.setType("text/plain");
            in.putExtra(Intent.EXTRA_SUBJECT,"Explore AN Isalnds");
            in.putExtra(Intent.EXTRA_TEXT,"https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName());
            startActivity(Intent.createChooser(in,"Share With"));
            break;

        }
        drawable.closeDrawer(GravityCompat.START);
        return true;
    }
    private void logOut() {
        mAuth.signOut();
        sendToLogin();
    }

    private void sendToLogin() {

        Intent loginIntent = new Intent(MainHomeActivity.this, LoginActivity.class);
        startActivity(loginIntent);
        finish();

    }

    @Override
    public void onBackPressed() {
        if (drawable.isDrawerOpen(GravityCompat.START)) {
            drawable.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}