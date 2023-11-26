package com.example.hackwestern10;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hackwestern10.information.DogInf_1;
import com.example.hackwestern10.map.MapFragment;
import com.example.hackwestern10.quiz.start_quiz_page;
import com.example.hackwestern10.references.References;
import com.google.android.material.navigation.NavigationBarView;

public class MapActivity extends AppCompatActivity{
    NavigationBarView bottomNavigationView;
    private Button footerbtn_info, footerbtn_map, footerbtn_quiz, footerbtn_ref;
    int user_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        user_id = getIntent().getIntExtra("id", 0);
        MainViewModel mainViewModel = new MainViewModel(MapActivity.this.getApplication());
        mainViewModel.database_prep();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_page_view, new MapFragment(user_id))
                .commit();

        footerbtn_info = findViewById(R.id.btn_start_info_activity);
        footerbtn_map = findViewById(R.id.btn_start_map_activity);
        footerbtn_quiz = findViewById(R.id.btn_start_quiz_activity);
        footerbtn_ref = findViewById(R.id.btn_start_ref_activity);
        footerbtn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MapActivity.this.getApplication(), DogInf_1.class);
                intent1.putExtra("id", user_id);
                startActivity(intent1);
            }
        });
        footerbtn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        footerbtn_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MapActivity.this.getApplication(), start_quiz_page.class);
                intent1.putExtra("id", user_id);
                startActivity(intent1);
            }
        });
        footerbtn_ref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MapActivity.this.getApplication(), References.class);
                intent1.putExtra("id", user_id);
                startActivity(intent1);
            }
        });
    }

}