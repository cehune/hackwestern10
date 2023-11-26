package com.example.hackwestern10.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hackwestern10.R;

public class register_activity extends AppCompatActivity {
    EditText editpassword, editemail, editusername;
    Button registersubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editpassword = findViewById(R.id.editTextPassword);
        editemail = findViewById(R.id.editTextEmail);
        editusername = findViewById(R.id.editTextUsername);
        registersubmit = findViewById(R.id.registersubmit);


        registersubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password = editpassword.getText().toString();
                String email = editemail.getText().toString();
                String username = editusername.getText().toString();

                Intent intent = new Intent(register_activity.this, second_register.class);
                intent.putExtra("password", password);
                intent.putExtra("email", email);
                intent.putExtra("username", username);
                startActivity(intent);
            }
        });


    }
}