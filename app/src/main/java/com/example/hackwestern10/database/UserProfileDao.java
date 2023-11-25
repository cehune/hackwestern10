package com.example.hackwestern10.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UserProfileDao {

    @Insert // function definition for inserting new user profile into table
    void insert(UserProfile userProfile);

    @Update // function definition for updating existing user profile
    void update(UserProfile userProfile);

    @Delete
    void delete(UserProfile userProfile);

    @Query("SELECT * FROM user_profile_table")
    //LiveData<List<UserProfile>> getUsers();
    List<UserProfile> getUsers();
}