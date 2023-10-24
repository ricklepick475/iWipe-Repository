package com.example.iwipe_repository;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.AuthResult;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.OnCompleteListener;
import androidx.annotation.NonNull;
public class LoginUserPage extends AppCompatActivity {
     EditText editTextTextPersonName;
     EditText passwordEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user_page);

        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

        Button quizPlaceholder = findViewById(R.id.loginButton);


        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        passwordEditText = findViewById(R.id.editTextTextPassword);

        TextView newToWipe = (TextView) findViewById(R.id.newToiWipeText);





        newToWipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newUser = new Intent(LoginUserPage.this, CreateUserPage.class);
                startActivity(newUser);
            }
        });




//        quizPlaceholder.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String email = editTextTextPersonName.getText().toString();
//                FbHelper fbHelper = new FbHelper();
//
//                // Call the getPasswordForEmail method
//                fbHelper.getPasswordForEmail(email, new FbHelper.OnPasswordLoadedListener() {
//                    @Override
//                    public void onPasswordLoaded(String password) {
//                        if (password != null) {
//                            // Password found, display a toast message
//                            Toast.makeText(LoginUserPage.this, "Password: " + password, Toast.LENGTH_SHORT).show();
//                        } else {
//                            // Password not found, handle the error or show a message.
//                           // Intent verifyIDInfoIntent = new Intent(LoginUserPage.this, VerifyIDInfo.class);
//                           // startActivity(verifyIDInfoIntent);
//                        }
//                    }
//                });
//            }
//        });

        quizPlaceholder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = editTextTextPersonName.getText().toString();
                String password = passwordEditText.getText().toString();

                firebaseAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(LoginUserPage.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Authentication successful, go to the next screen
                                    Intent verifyIDInfoIntent = new Intent(LoginUserPage.this, VerifyIDInfo.class);
                                    startActivity(verifyIDInfoIntent);
//                                    Intent intent = new Intent(LoginUserPage.this, NextActivity.class);
//                                    startActivity(intent);
                                } else {
                                    // Authentication failed, display a message
                                    Toast.makeText(LoginUserPage.this, "Authentication failed.", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });








//        // Testing purposes, quiz should be accessed from main menu
//        quizPlaceholder.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent quizPlaceholderScreen = new Intent(LoginUserPage.this, Q1Placeholder.class);
//                startActivity(quizPlaceholderScreen);
//            }
//        });
//
//    }




}}
