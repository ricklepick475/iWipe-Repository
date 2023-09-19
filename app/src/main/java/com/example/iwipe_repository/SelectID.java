package com.example.iwipe_repository;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SelectID extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_id);

        ImageButton driverID = findViewById(R.id.drivers);
        ImageButton passportID = findViewById(R.id.passport);
        ImageButton cardID = findViewById(R.id.card);
        driverID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent driverID = new Intent(SelectID.this, GetStarted.class);
                startActivity(driverID);
            }
        });

        passportID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent passportID = new Intent(SelectID.this, GetStarted.class);
                startActivity(passportID);
            }
        });

        cardID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cardID = new Intent(SelectID.this, GetStarted.class);
                startActivity(cardID);
            }
        });
    }
}