package com.example.iwipe_repository;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q3Placeholder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3_placeholder);

        Button nextQuestion3 = findViewById(R.id.next3);

        nextQuestion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextQuestion3 = new Intent(Q3Placeholder.this, Q4Placeholder.class);
                startActivity(nextQuestion3);
            }
        });

    }
}

// Due to a time crunch, all 5 question screens will be considered as placeholders.
// In a professional instance, all questions and answers would be included in a List of Lists and called which is a lot cleaner
// Button text for this task would also be called from the list of lists rather than implemented into .xml files