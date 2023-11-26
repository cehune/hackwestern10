package com.example.hackwestern10.register;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.hackwestern10.user_profile_data_base.UserProfile;
import com.example.hackwestern10.user_profile_data_base.UserProfileDao;
import com.example.hackwestern10.user_profile_data_base.UserProfileDatabase;

public class RegisterViewModel extends AndroidViewModel {
    private final UserProfileDatabase userDatabase;
    private final UserProfileDao dao;

    public RegisterViewModel(@NonNull Application application) {
        super(application);
        this.userDatabase = UserProfileDatabase.getInstance(application);
        this.dao = userDatabase.userProfileDao();
    }
    public void insert(UserProfile userProfile) {
        // Perform Room database operation on a background thread
        dao.insert(userProfile);

    }
}
