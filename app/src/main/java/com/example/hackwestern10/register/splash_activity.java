package com.example.hackwestern10.register;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;

import com.example.hackwestern10.R;

public class splash_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run () {
                Intent intent = new Intent(splash_activity.this, register_activity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}