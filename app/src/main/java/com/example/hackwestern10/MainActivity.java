package com.example.hackwestern10;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener{
    NavigationBarView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = this.findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.information_navigation);
    }
    InformationFragment informationFragment = new InformationFragment();
    MapFragment mapFragment = new MapFragment();
    ProfileFragment profileFragment = new ProfileFragment();
    QuizFragment quizFragment = new QuizFragment();



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.information_navigation) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.main_page_view, informationFragment)
                    .commit();
            return true;
        }
        else if (item.getItemId() == R.id.map_navigation) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.main_page_view, mapFragment)
                    .commit();
            return true;
        }
        if (item.getItemId() == R.id.quiz_navigation) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.main_page_view, quizFragment)
                    .commit();
            return true;
        }
        if (item.getItemId() == R.id.profile_navigation) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.main_page_view, profileFragment)
                    .commit();
            return true;
        }

        return false;
    }
}