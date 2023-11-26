package com.example.hackwestern10.dog_information;

public class DogInformationSingle {
    private String dog_breed;
    private String weight_male;
    private String weight_female;
    private String height_male;
    private String height_female;
    private String life_expectancy;
    private String nutrition;
    private String grooming;
    private int picture;

    public DogInformationSingle(String dog_breed, String weight_male, String weight_female, String height_male, String height_female, String life_expectancy, String nutrition, String exercise, String grooming, int picture) {
        this.dog_breed = dog_breed;
        this.weight_male = weight_male;
        this.weight_female = weight_female;
        this.height_male = height_male;
        this.height_female = height_female;
        this.life_expectancy = life_expectancy;
        this.nutrition = nutrition;
        this.exercise = exercise;
        this.grooming = grooming;
        this.picture = picture;
    }



    public int getPicture() {
        return picture;
    }

    private String exercise;

    public String getDog_breed(){
        return dog_breed;
    }
    public String getWeight_male() {
        return weight_male;
    }

    public void setWeight_male(String weight_male) {
        this.weight_male = weight_male;
    }

    public String getWeight_female() {
        return weight_female;
    }

    public void setWeight_female(String weight_female) {
        this.weight_female = weight_female;
    }

    public String getHeight_male() {
        return height_male;
    }

    public void setHeight_male(String height_male) {
        this.height_male = height_male;
    }

    public String getHeight_female() {
        return height_female;
    }

    public void setHeight_female(String height_female) {
        this.height_female = height_female;
    }

    public String getLife_expectancy() {
        return life_expectancy;
    }

    public void setLife_expectancy(String life_expectancy) {
        this.life_expectancy = life_expectancy;
    }

    public String getNutrition() {
        return nutrition;
    }

    public void setNutrition(String nutrition) {
        this.nutrition = nutrition;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public String getGrooming(){
        return grooming;
    }
    public void setGrooming(){
        this.grooming = grooming;
    }
}
