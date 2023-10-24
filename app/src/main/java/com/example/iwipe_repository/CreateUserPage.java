package com.example.iwipe_repository;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.AuthResult;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.OnCompleteListener;
import androidx.annotation.NonNull;
import android.widget.Toast;

public class CreateUserPage extends AppCompatActivity {

    private EditText firstNameEditText;
    private EditText emailEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user_page);
        FirebaseAuth mAuth = FirebaseAuth.getInstance();

        // Initialize TextView
        TextView notNewToWipe = findViewById(R.id.notNewToiWipeText);

        // Initialize EditText fields
        firstNameEditText = findViewById(R.id.editTextTextPersonName);
        emailEditText = findViewById(R.id.editTextTextPersonEmail);
        passwordEditText = findViewById(R.id.editTextTextPassword);

        notNewToWipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oldUser = new Intent(CreateUserPage.this, LoginUserPage.class);
                startActivity(oldUser);
            }
        });

        // Declare and initialize the signUpButton
        Button signUpButton = findViewById(R.id.signUpButton);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get registration info
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Create a new user account
                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(CreateUserPage.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Registration successful, go to the next screen (e.g., VerifyIDInfo)
                                    Intent loginIntent = new Intent(CreateUserPage.this, LoginUserPage.class);
                                    startActivity(loginIntent);
                                } else {
                                    // Registration failed, handle the error or show a message
                                    Toast.makeText(CreateUserPage.this, "Registration failed.", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });
    }
}