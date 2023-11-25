package com.example.hackwestern10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class DogInf_1 extends AppCompatActivity {
    private Button button1;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doginf_1);

        button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_MainActivity2();
            }

        });
    }

        public void open_MainActivity2() {
            Intent intent1 = new Intent(this, DogInf_2.class);
            startActivity(intent1);

        }

}