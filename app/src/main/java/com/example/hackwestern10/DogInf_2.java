package com.example.hackwestern10;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hackwestern10.dog_information.DogInformationBase;
import com.example.hackwestern10.dog_information.DogInformationSingle;

public class DogInf_2 extends AppCompatActivity {

    Button back_button;
    ImageView dogPicture;
    TextView dogbreed, heightMale, heightFemale, weightMale, weightFemale, lifeExpectancy, nutrition, exercise, grooming;
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
            case "chihuahua":
                dog = dogInformationBase.chihuahua;
                break;
            case "beagle":
                dog = dogInformationBase.beagle;
                break;
            case "germanhepherd":
                dog = dogInformationBase.germanhepherd;
                break;

            default:
                dog = dogInformationBase.unfound;
                break;
        }
        dogbreed = findViewById(R.id.textDogBreed);
        heightMale = findViewById(R.id.textHeightMale);
        heightFemale = findViewById(R.id.textHeightFemale);
        weightFemale = findViewById(R.id.textWeightFemale);
        weightMale = findViewById(R.id.textWeightMale);
        lifeExpectancy = findViewById(R.id.textLifeExpectancy);
        nutrition = findViewById(R.id.nutrition);
        exercise = findViewById(R.id.exercise);
        grooming = findViewById(R.id.grooming);
        dogPicture = findViewById(R.id.dogPicture);

        dogbreed.setText(dog.getDog_breed());
        heightMale.setText(dog.getHeight_male());
        heightFemale.setText(dog.getHeight_female());
        weightFemale.setText(dog.getWeight_female());
        weightMale.setText(dog.getWeight_male());
        lifeExpectancy.setText(dog.getLife_expectancy());
        nutrition.setText(dog.getNutrition());
        exercise.setText(dog.getExercise());
        grooming.setText(dog.getGrooming());
        dogPicture.setBackgroundResource(dog.getPicture());



        back_button = findViewById(R.id.back_button);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }


}