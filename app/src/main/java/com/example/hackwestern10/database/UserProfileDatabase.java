package com.example.hackwestern10.database;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {UserProfile.class}, version = 1)
public abstract class UserProfileDatabase extends RoomDatabase {
    private static UserProfileDatabase instance;

    public abstract UserProfileDao userProfileDao();

    public static synchronized UserProfileDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    UserProfileDatabase.class, "database-name").allowMainThreadQueries().fallbackToDestructiveMigration().build();
        }
        return instance;
    }



}
