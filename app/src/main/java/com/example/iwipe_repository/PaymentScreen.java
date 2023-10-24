package com.example.iwipe_repository;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PaymentScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_screen);

        Button loginNow = findViewById(R.id.loginHereNow);

        loginNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentScreen.this, Q1Placeholder.class);
                startActivity(intent);
            }
        });
    }
}