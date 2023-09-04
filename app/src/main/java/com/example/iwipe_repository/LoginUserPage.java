package com.example.iwipe_repository;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LoginUserPage extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user_page);

        TextView newToWipe = (TextView) findViewById(R.id.newToiWipeText);
        newToWipe.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent newUser = new Intent(LoginUserPage.this, CreateUserPage.class);
        startActivity(newUser);
    }
}
