package com.example.exploreanislands;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

public class splashActivity extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        int timeout = 5000;
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            Intent i = new Intent(splashActivity.this, LoginActivity.class);
            startActivity(i);
            finish();
        }, timeout);

    }
}


