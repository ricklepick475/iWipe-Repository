package com.example.iwipe_repository;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LoginUserPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user_page);

        Button quizPlaceholder = findViewById(R.id.loginButton);

        TextView newToWipe = (TextView) findViewById(R.id.newToiWipeText);

        newToWipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newUser = new Intent(LoginUserPage.this, CreateUserPage.class);
                startActivity(newUser);
            }
        });

        // Testing purposes, quiz should be accessed from main menu
//        quizPlaceholder.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent quizPlaceholderScreen = new Intent(LoginUserPage.this, Q1Placeholder.class);
//                startActivity(quizPlaceholderScreen);
//            }
//        });

    }




}
