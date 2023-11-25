package com.example.hackwestern10.Map;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.hackwestern10.R;
import com.example.hackwestern10.database.UserProfile;
import com.example.hackwestern10.database.UserProfileDao;
import com.example.hackwestern10.database.UserProfileDatabase;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MapViewModel extends AndroidViewModel {
    private UserProfileDatabase userDatabase;
    UserProfileDao dao;
    List<UserProfile> nearbyUsers;
    public MapViewModel(@NonNull Application application) {
        super(application);
        this.userDatabase = UserProfileDatabase.getInstance(application);
        this.dao = userDatabase.userProfileDao();
        this.nearbyUsers = dao.getUsers();
    }
    public List<UserProfile> getNearbyUsers(int radius) {
       return nearbyUsers;
    }

}
