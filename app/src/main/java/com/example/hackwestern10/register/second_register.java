package com.example.hackwestern10.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hackwestern10.R;
import com.example.hackwestern10.information.DogInf_1;
import com.example.hackwestern10.user_profile_data_base.UserProfile;

public class second_register extends AppCompatActivity {

    EditText editname, editbreed, editage;
    Button registersubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String password = getIntent().getStringExtra("password");
        String email = getIntent().getStringExtra("email");
        String username = getIntent().getStringExtra("username");

        setContentView(R.layout.activity_second_register);

        editage = findViewById(R.id.editDogAge);
        editbreed = findViewById(R.id.editDogBreed);
        editname = findViewById(R.id.editDogName);
        registersubmit = findViewById(R.id.registersubmit);
        RegisterViewModel viewModel = new RegisterViewModel(second_register.this.getApplication());


        registersubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editname.getText().toString();
                String age = editage.getText().toString();
                String breed = editbreed.getText().toString();
                UserProfile new_user = new UserProfile(username, email, 1.000, 1.000, R.drawable.dog, name, breed);
                int user_id = new_user.getUid();
                viewModel.insert(new_user);

                Intent intent = new Intent(second_register.this, DogInf_1.class);
                intent.putExtra("id", user_id);
                startActivity(intent);
            }
        });


    }
}