package com.example.hackwestern10.user_profile_data_base;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {UserProfile.class}, version = 2)
public abstract class UserProfileDatabase extends RoomDatabase {
    private static UserProfileDatabase instance;

    public abstract UserProfileDao userProfileDao();

    public static synchronized UserProfileDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    UserProfileDatabase.class, "database-name").allowMainThreadQueries().fallbackToDestructiveMigration().build();
        } //
        return instance;
    }





}
