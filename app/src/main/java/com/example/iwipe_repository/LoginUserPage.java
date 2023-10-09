package com.example.iwipe_repository;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class LoginUserPage extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    WalletFragment walletFragmentFragment = new WalletFragment();
    SettingsFragment settingsFragment = new SettingsFragment();
    LeaderboardFragment leaderboardFragment = new LeaderboardFragment();
    NotificationFragment notificationFragment = new NotificationFragment();
    NavigationFragment navigationFragment = new NavigationFragment();

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

                bottomNavigationView = findViewById(R.id.bottom_navigation);

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

        getSupportFragmentManager().beginTransaction().replace(R.id.container, settingsFragment).commit();

        BadgeDrawable badgeDrawable = bottomNavigationView.getOrCreateBadge(R.id.notification);
        badgeDrawable.setVisible(true);
        badgeDrawable.setNumber(8);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.settings:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, settingsFragment).commit();
                        return true;
                    case R.id.notification:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, notificationFragment).commit();
                        return true;
                    case R.id.navigation:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, navigationFragment).commit();
                        return true;
                    case R.id.wallet:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, walletFragmentFragment).commit();
                        return true;
                    case R.id.leaderboard:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, leaderboardFragment).commit();
                        return true;
                }

                return false;
            }
        });

    }




}
