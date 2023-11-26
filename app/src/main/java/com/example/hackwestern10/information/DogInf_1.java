package com.example.hackwestern10.information;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

import androidx.appcompat.widget.SearchView;


import com.example.hackwestern10.MapActivity;
import com.example.hackwestern10.R;
import com.example.hackwestern10.quiz.start_quiz_page;
import com.example.hackwestern10.references.References;


public class DogInf_1 extends AppCompatActivity {
    private Button button_golden;
    private Button button_chihuahua;
    private Button button_beagle;
    private Button button_German_Shepherd;
    private SearchView search_dog;
    private Button footerbtn_info, footerbtn_map, footerbtn_quiz, footerbtn_ref;
    int user_id;

    private String Doglist[]
            = { "golden r", "hairy",
            "Languages", "Interview Corner",
            "GATE", "ISRO CS",
            "UGC NET CS", "CS Subjects",
            "Web Technologies" };


    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doginf_1);
        user_id = getIntent().getIntExtra("id", 0);
        button_golden = (Button) findViewById(R.id.button_golden);
        button_golden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_MainActivity2("golden_retriever");
            }
        });



        button_chihuahua = (Button) findViewById(R.id.button_chihuahua);
        button_chihuahua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_MainActivity2("chihuahua");
            }
        });



        button_beagle = (Button) findViewById(R.id.button_beagle);
        button_beagle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                open_MainActivity2("beagle");
            }
        });

        button_German_Shepherd = (Button) findViewById(R.id.button_German_Shepherd);
        button_German_Shepherd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_MainActivity2("germanhepherd");
            }
        });

        footerbtn_info = findViewById(R.id.btn_start_info_activity);
        footerbtn_map = findViewById(R.id.btn_start_map_activity);
        footerbtn_quiz = findViewById(R.id.btn_start_quiz_activity);
        footerbtn_ref = findViewById(R.id.btn_start_ref_activity);
        footerbtn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        footerbtn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(DogInf_1.this.getApplication(), MapActivity.class);
                intent1.putExtra("id", user_id);
                startActivity(intent1);
            }
        });
        footerbtn_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(DogInf_1.this.getApplication(), start_quiz_page.class);
                intent1.putExtra("id", user_id);
                startActivity(intent1);
            }
        });
        footerbtn_ref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(DogInf_1.this.getApplication(), References.class);
                intent1.putExtra("id", user_id);
                startActivity(intent1);
            }
        });



    }

    public void open_MainActivity2(String key) {
            Intent intent1 = new Intent(this, DogInf_2.class);
            intent1.putExtra("breed", key);
            intent1.putExtra("id", user_id);
            startActivity(intent1);


        }

}