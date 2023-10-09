package com.example.iwipe_repository;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q1Placeholder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1_placeholder);

        Button nextQuestion = findViewById(R.id.next1);

        nextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextQuestion = new Intent(Q1Placeholder.this, Q2Placeholder.class);
                startActivity(nextQuestion);
            }
        });

    }
}

// Due to a time crunch, all 5 question screens will be considered as placeholders.
// In a professional instance, all questions and answers would be included in a List of Lists and called which is a lot cleaner
// Button text for this task would also be called from the list of lists rather than implemented into .xml files