package com.example.hackwestern10.quiz;
import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import android.widget.Button;
import android.content.Intent;


import androidx.appcompat.app.AppCompatActivity;

import com.example.hackwestern10.MapActivity;
import com.example.hackwestern10.R;
import com.example.hackwestern10.information.DogInf_1;
import com.example.hackwestern10.references.References;

public class quiz_part1 extends AppCompatActivity implements View.OnClickListener{

    TextView totalQuestionsTextView;
    TextView QuestionTextView;
    Button ans_1, ans_2;
    Button submit_btn;
    private Button footerbtn_info, footerbtn_map, footerbtn_quiz, footerbtn_ref;
    int user_id;

    int score = 0;
    int totalQuestion = QuestionAnswer.question.length;
    int currentQuestionIndex = 0;
    String selectedanswer = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);

        totalQuestionsTextView = findViewById(R.id.total_questions);
        QuestionTextView = findViewById(R.id.question);
        ans_1 = findViewById(R.id.answer_A);
        ans_2 = findViewById(R.id.answer_B);
        submit_btn = findViewById(R.id.submit_button);

        ans_1.setOnClickListener(this);
        ans_2.setOnClickListener(this);
        submit_btn.setOnClickListener(this);


        totalQuestionsTextView.setText("Total Question : " + totalQuestion);

        loadNewQuestion();


        footerbtn_info = findViewById(R.id.btn_start_info_activity);
        footerbtn_map = findViewById(R.id.btn_start_map_activity);
        footerbtn_quiz = findViewById(R.id.btn_start_quiz_activity);
        footerbtn_ref = findViewById(R.id.btn_start_ref_activity);
        footerbtn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(quiz_part1.this.getApplication(), DogInf_1.class);
                intent1.putExtra("id", user_id);
                startActivity(intent1);
            }
        });
        footerbtn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(quiz_part1.this.getApplication(), MapActivity.class);
                intent1.putExtra("id", user_id);
                startActivity(intent1);
            }
        });
        footerbtn_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(quiz_part1.this.getApplication(), start_quiz_page.class);
                intent1.putExtra("id", user_id);
                startActivity(intent1);
            }
        });
        footerbtn_ref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(quiz_part1.this.getApplication(), References.class);
                intent1.putExtra("id", user_id);
                startActivity(intent1);
            }
        });

    }

    @Override
    public void onClick(View view) {

        ans_1.setBackgroundColor(Color.BLACK);
        ans_2.setBackgroundColor(Color.BLACK);

        Button clickedButton = (Button) view;
        if (clickedButton.getId() == R.id.submit_button) {
            if (currentQuestionIndex != 5) {
                if(selectedanswer.equals("YES")) {
                    score += 10;
                } else {
                    score += 5;
                }
            } else {
                if (selectedanswer.equals("Afraid")) {
                    score += 10;
                } else {
                    score += 5;
                }
            }
            currentQuestionIndex++;
            loadNewQuestion();
        } else {
            selectedanswer = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.YELLOW);

        }
    }

    void loadNewQuestion() {

        if (currentQuestionIndex == totalQuestion) {
            finishquiz();
            return;
        }

        QuestionTextView.setText(QuestionAnswer.question[currentQuestionIndex]);
        ans_1.setText(QuestionAnswer.answer[currentQuestionIndex][0]);
        ans_2.setText(QuestionAnswer.answer[currentQuestionIndex][1]);
    }

    void finishquiz() {
        String finalresult = "";
        if (score >= 60) {
            finalresult = "extroversion";
        } else if (score >= 50) {
            finalresult = "agreeableness";
        } else if (score >= 45) {
            finalresult = "neuroticism";
        } else if (score >= 40){
            finalresult = "openness";
        } else if (score >= 35) {
            finalresult = "conscientiousness";
        } else {
            finalresult = "error";
        }

        new AlertDialog.Builder(this)
                .setMessage("Your final result is " + finalresult)
                .setPositiveButton("Restart",(dialogInterface, i) -> restartquiz() )
                .setNegativeButton("Cancel",(dialogInterface, i) -> goback())
                .setPositiveButton("See All",(dialogInterface, i) -> see_all())
                .setCancelable(false)
                .show();

    }

    void restartquiz() {

        score = 0;
        currentQuestionIndex = 0;
        loadNewQuestion();
    }

    void goback() {
        Intent intent = new Intent(this, start_quiz_page.class);
        finish();
    }

    void see_all() {
        Intent intent = new Intent(this, see_description.class);
        startActivity(intent);
    }
}