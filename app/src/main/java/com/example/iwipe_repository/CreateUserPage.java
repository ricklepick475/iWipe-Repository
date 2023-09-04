package com.example.iwipe_repository;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CreateUserPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user_page);

        TextView notNewToWipe = findViewById(R.id.notNewToiWipeText);
        notNewToWipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oldUser = new Intent(CreateUserPage.this, LoginUserPage.class);
                startActivity(oldUser);
            }
        });
    }
}
