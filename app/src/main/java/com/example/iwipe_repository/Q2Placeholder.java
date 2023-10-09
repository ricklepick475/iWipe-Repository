package com.example.iwipe_repository;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q2Placeholder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2_placeholder);

        Button nextQuestion2 = findViewById(R.id.next2);

        nextQuestion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextQuestion2 = new Intent(Q2Placeholder.this, Q3Placeholder.class);
                startActivity(nextQuestion2);
            }
        });

    }
}

// Due to a time crunch, all 5 question screens will be considered as placeholders.
// In a professional instance, all questions and answers would be included in a List of Lists and called which is a lot cleaner
// Button text for this task would also be called from the list of lists rather than implemented into .xml files