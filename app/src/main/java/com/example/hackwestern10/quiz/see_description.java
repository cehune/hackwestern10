package com.example.hackwestern10.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hackwestern10.R;

public class see_description extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_description);

        Button back = findViewById(R.id.back_icon);
        Button see_more = findViewById(R.id.see_allbtn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(see_description.this, start_quiz_page.class);
                startActivity(intent);
            }
        });

        see_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(see_description.this, famous_dog_1.class);
                startActivity(intent);
            }
        });
    }
}