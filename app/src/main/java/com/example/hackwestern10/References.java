package com.example.hackwestern10;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class References extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.references);

        TextView textview = findViewById(R.id.ReferencesText);
        textview.setPaintFlags(textview.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        TextView petpoisoncontrol = findViewById(R.id.PetPoisonControl);
        TextView petfirstaid = findViewById(R.id.PetFirstAid);
        TextView financialhelpvet = findViewById(R.id.FinancialHelpVet);
        TextView pottytrainingguide = findViewById(R.id.PottyTrainingGuide);


        petpoisoncontrol.setMovementMethod(LinkMovementMethod.getInstance());
        petfirstaid.setMovementMethod(LinkMovementMethod.getInstance());
        financialhelpvet.setMovementMethod(LinkMovementMethod.getInstance());
        pottytrainingguide.setMovementMethod(LinkMovementMethod.getInstance());



    }
}