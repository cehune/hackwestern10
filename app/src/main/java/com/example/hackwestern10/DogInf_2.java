package com.example.hackwestern10;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.hackwestern10.dog_information.DogInformationBase;
import com.example.hackwestern10.dog_information.DogInformationSingle;

public class DogInf_2 extends AppCompatActivity {

    Button back_button;
    TextView heightMale, heightFemale, weightMale, weightFemale, lifeExpectancy, nutrition, exercise;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doginf_2);
        String breed = getIntent().getStringExtra("breed");
        DogInformationBase dogInformationBase =  new DogInformationBase();

        DogInformationSingle dog;
        switch(breed){
            case "golden_retriever":
                dog = dogInformationBase.goldenRetriever;
                break;
            default:
                dog = dogInformationBase.unfound;
                break;
        }

        heightMale = findViewById(R.id.textHeightMale);
        heightFemale = findViewById(R.id.textHeightFemale);
        weightFemale = findViewById(R.id.textWeightFemale);
        weightMale = findViewById(R.id.textWeightMale);
        lifeExpectancy = findViewById(R.id.textLifeExpectancy);
        nutrition = findViewById(R.id.nutrition);
        exercise = findViewById(R.id.exercise);

        heightMale.setText(dog.getHeight_male());
        heightFemale.setText(dog.getHeight_female());
        weightFemale.setText(dog.getWeight_female());
        weightMale.setText(dog.getWeight_male());
        lifeExpectancy.setText(dog.getLife_expectancy());
        nutrition.setText(dog.getNutrition());
        exercise.setText(dog.getExercise());



        back_button = findViewById(R.id.back_button);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }


}