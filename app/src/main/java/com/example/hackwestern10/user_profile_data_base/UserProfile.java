package com.example.hackwestern10.user_profile_data_base;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "user_profile_table")
public class UserProfile {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    //owner dependant
    String ownerName;
    String ownerEmail;

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    Double latitude;
    Double longitude;

    // dog dependant
    int picture;
    String dogName;
    String dogBreed;


    public UserProfile(String ownerName, String ownerEmail, Double latitude, Double longitude,  int picture, String dogName, String dogBreed) {
        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail;
        this.latitude = latitude;
        this.longitude = longitude;
        this.picture = picture;
        this.dogName = dogName;
        this.dogBreed = dogBreed;
    }

    /*
    Getters
    */

    public int getUid() {
        return uid;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }



    public int getPicture() {
        return picture;
    }

    public String getDogName() {
        return dogName;
    }

    public String getDogBreed() {
        return dogBreed;
    }
}
