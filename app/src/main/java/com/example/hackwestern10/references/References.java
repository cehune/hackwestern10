package com.example.hackwestern10.references;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.hackwestern10.MapActivity;
import com.example.hackwestern10.R;
import com.example.hackwestern10.information.DogInf_1;
import com.example.hackwestern10.quiz.start_quiz_page;

import java.lang.ref.Reference;

public class References extends AppCompatActivity {
    private Button footerbtn_info, footerbtn_map, footerbtn_quiz, footerbtn_ref;
    int user_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_references);
        user_id = getIntent().getIntExtra("id", 0);
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


        footerbtn_info = findViewById(R.id.btn_start_info_activity);
        footerbtn_map = findViewById(R.id.btn_start_map_activity);
        footerbtn_quiz = findViewById(R.id.btn_start_quiz_activity);
        footerbtn_ref = findViewById(R.id.btn_start_ref_activity);
        footerbtn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(References.this.getApplication(), DogInf_1.class);
                intent1.putExtra("id", user_id);
                startActivity(intent1);
            }
        });
        footerbtn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(References.this.getApplication(), MapActivity.class);
                intent1.putExtra("id", user_id);
                startActivity(intent1);
            }
        });
        footerbtn_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(References.this.getApplication(), start_quiz_page.class);
                intent1.putExtra("id", user_id);
                startActivity(intent1);
            }
        });
        footerbtn_ref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}