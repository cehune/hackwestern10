package com.example.hackwestern10;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.hackwestern10.user_profile_data_base.UserProfile;
import com.example.hackwestern10.user_profile_data_base.UserProfileDao;
import com.example.hackwestern10.user_profile_data_base.UserProfileDatabase;

public class MainViewModel extends AndroidViewModel {
    private final UserProfileDatabase userDatabase;
    private final UserProfileDao dao;
    public MainViewModel(@NonNull Application application) {
        super(application);
        this.userDatabase = UserProfileDatabase.getInstance(application);
        this.dao = userDatabase.userProfileDao();
    }

    public void database_prep() {
        dao.nukeTable();

        UserProfile user1 = new UserProfile("Jessica", "gentle, friendly", 1.2,
                1.2, R.drawable.pfp4, "Raymond", "Dachshund");
        UserProfile user2 = new UserProfile("Jessica", "Quiet, friendly", 1.2,
                1.2, R.drawable.pfp2, "Cooper", "Golden Retriever");
        UserProfile user3 = new UserProfile("Jessica", "Lazy, Fluffy", 1.2,
                1.2, R.drawable.pfp3, "Coco", "Shiba Inu");
        UserProfile user4 = new UserProfile("Jessica", "Playful, Affectionate", 1.2,
                1.2, R.drawable.pfp1, "Ellie", "Doberman");
        dao.insert(user1);
        dao.insert(user2);
        dao.insert(user3);
        dao.insert(user4);
    }



}
