package com.example.hackwestern10;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class famous_dog_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous_dog2);

        Button next = findViewById(R.id.nextbtn);
        Button previous = findViewById(R.id.previousbtn);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(famous_dog_2.this, famous_dog_3.class);
                startActivity(intent);
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(famous_dog_2.this, famous_dog_1.class);
                startActivity(intent);
            }
        });
    }
}