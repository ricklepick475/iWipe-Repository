package com.example.iwipe_repository;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
public class VerifyIDInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_idinfo);

        TextView missingID = findViewById(R.id.noID);

        ImageButton selectID = findViewById(R.id.selectID);

        missingID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent noID = new Intent(VerifyIDInfo.this, CreateUserPage.class);
                startActivity(noID);
            }
        });

        selectID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent selectID = new Intent(VerifyIDInfo.this, SelectID.class);
                startActivity(selectID);
            }
        });
    }



}

