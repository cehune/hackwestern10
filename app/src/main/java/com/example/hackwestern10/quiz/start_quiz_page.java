package com.example.hackwestern10.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import com.example.hackwestern10.MapActivity;
import com.example.hackwestern10.R;
import com.example.hackwestern10.information.DogInf_1;
import com.example.hackwestern10.references.References;

public class start_quiz_page extends AppCompatActivity {

    private Button footerbtn_info, footerbtn_map, footerbtn_quiz, footerbtn_ref;
    int user_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_quiz);
        user_id = getIntent().getIntExtra("id", 0);
        Button startbtn = findViewById(R.id.start_quiz_button);
        Button closebtn = findViewById(R.id.cancel_btn);

        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(start_quiz_page.this, quiz_part1.class);
                startActivity(intent);
            }
        });

        closebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        footerbtn_info = findViewById(R.id.btn_start_info_activity);
        footerbtn_map = findViewById(R.id.btn_start_map_activity);
        footerbtn_quiz = findViewById(R.id.btn_start_quiz_activity);
        footerbtn_ref = findViewById(R.id.btn_start_ref_activity);
        footerbtn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(start_quiz_page.this.getApplication(), DogInf_1.class);
                intent1.putExtra("id", user_id);
                startActivity(intent1);
            }
        });
        footerbtn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(start_quiz_page.this.getApplication(), MapActivity.class);
                intent1.putExtra("id", user_id);
                startActivity(intent1);
            }
        });
        footerbtn_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        footerbtn_ref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(start_quiz_page.this.getApplication(), References.class);
                intent1.putExtra("id", user_id);
                startActivity(intent1);
            }
        });

    }

}

