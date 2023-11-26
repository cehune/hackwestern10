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
        TextView treatmentauthform = findViewById(R.id.treatmentauthform);
        TextView hotdogcar = findViewById(R.id.hotdogcar);
        TextView decodingdoglanguage = findViewById(R.id.decodingdoglanguage);
        TextView pettravelguide = findViewById(R.id.pettravelguide);
        TextView nippingproducts = findViewById(R.id.nippingproducts);

        petpoisoncontrol.setMovementMethod(LinkMovementMethod.getInstance());
        petfirstaid.setMovementMethod(LinkMovementMethod.getInstance());
        financialhelpvet.setMovementMethod(LinkMovementMethod.getInstance());
        pottytrainingguide.setMovementMethod(LinkMovementMethod.getInstance());
        treatmentauthform.setMovementMethod(LinkMovementMethod.getInstance());
        hotdogcar.setMovementMethod(LinkMovementMethod.getInstance());
        decodingdoglanguage.setMovementMethod(LinkMovementMethod.getInstance());
        pettravelguide.setMovementMethod(LinkMovementMethod.getInstance());
        nippingproducts.setMovementMethod(LinkMovementMethod.getInstance());
    }
}