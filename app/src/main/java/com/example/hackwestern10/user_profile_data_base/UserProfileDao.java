package com.example.hackwestern10.user_profile_data_base;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserProfileDao {

    @Insert // function definition for inserting new user profile into table
    void insert(UserProfile userProfile);

    @Delete
    void delete(UserProfile userProfile);

    @Query("SELECT * FROM user_profile_table WHERE uid != :uid")
    //LiveData<List<UserProfile>> getUsers();
    List<UserProfile> getUsers(int uid);

    @Query("SELECT * FROM user_profile_table WHERE uid = :uid")
    UserProfile getUserById(int uid);

    @Query("SELECT * FROM user_profile_table WHERE uid = :uid")
    UserProfile updateUserById(int uid);

    @Query("DELETE FROM user_profile_table")
    public void nukeTable();
}
