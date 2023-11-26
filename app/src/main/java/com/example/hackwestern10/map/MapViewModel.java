package com.example.hackwestern10.map;

import android.annotation.SuppressLint;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.hackwestern10.user_profile_data_base.UserProfile;
import com.example.hackwestern10.user_profile_data_base.UserProfileDao;
import com.example.hackwestern10.user_profile_data_base.UserProfileDatabase;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

import java.util.ArrayList;
import java.util.List;

public class MapViewModel extends AndroidViewModel {
    private UserProfileDatabase userDatabase;
    FusedLocationProviderClient client;
    UserProfileDao dao;
    boolean locationPerms;
    double latitude, longitude;
    List<UserProfile> nearbyUsers;
    UserProfile tag;
    int user_id;

    public MapViewModel(@NonNull Application application) {
        super(application);
        this.userDatabase = UserProfileDatabase.getInstance(application);
        this.dao = userDatabase.userProfileDao();
        client = LocationServices.getFusedLocationProviderClient(application.getApplicationContext());
        locationPerms = true;


    }

    public void retrieveNearbyUsersFromDB(int id) {
        nearbyUsers = dao.getUsers(id);
    }

    public void insert(UserProfile userProfile) {
        // Perform Room database operation on a background thread
        dao.insert(userProfile);

    }

    public List<UserProfile> getNearbyUsers() {
        if (nearbyUsers == null){
            return new ArrayList<>();
        }
        return nearbyUsers;
    }


    @SuppressLint("MissingPermission")
    public void retrieveLatitudeAndLongitude() {

        client.getLastLocation().addOnSuccessListener( location -> {
                    if (location != null) {
                        latitude = location.getLatitude();
                        longitude = location.getLongitude();
                    }
                });
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
