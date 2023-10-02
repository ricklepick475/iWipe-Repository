package com.example.iwipe_repository;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
public class CreateUserPage extends AppCompatActivity {

    private EditText firstNameEditText;
    private EditText emailEditText;
    private EditText passwordEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user_page);

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

        Button signUpButton = findViewById(R.id.signUpButton);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Get registration Info
                String firstName = firstNameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                FbHelper fbHelper = new FbHelper();
                fbHelper.createUser(firstName, email, password);


                Intent verifyIDInfoIntent = new Intent(CreateUserPage.this, VerifyIDInfo.class);
                startActivity(verifyIDInfoIntent);
            }
        });
    }
}
