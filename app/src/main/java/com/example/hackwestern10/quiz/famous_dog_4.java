package com.example.hackwestern10.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hackwestern10.R;

public class famous_dog_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous_dog4);

        Button back = findViewById(R.id.backbtn);
        Button previous = findViewById(R.id.previous);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(famous_dog_4.this, start_quiz_page.class);
                startActivity(intent);
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(famous_dog_4.this, famous_dog_3.class);
                startActivity(intent);
            }
        });
    }
}