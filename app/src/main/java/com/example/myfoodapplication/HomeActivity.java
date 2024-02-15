package com.example.myfoodapplication;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        // About Us Button Click Listener
        Button aboutUsButton = findViewById(R.id.aboutUSButton);
        aboutUsButton.setOnClickListener(view -> {
            // Start AboutActivity when About Us button is clicked
            Intent intent = new Intent(HomeActivity.this, AboutActivity.class);
            startActivity(intent);
        });

        // Contact Button Click Listener
        Button contactButton = findViewById(R.id.ContactButton);
        contactButton.setOnClickListener(view -> {
            // Start ContactActivity when Contact button is clicked
            Intent intent = new Intent(HomeActivity.this, ContactActivity.class);
            startActivity(intent);
        });

        // Order Now Button Click Listener
        Button orderNowButton = findViewById(R.id.orderNowButton);
        orderNowButton.setOnClickListener(view -> {
            // Open the OrderActivity when the Order Now button is clicked
            Intent intent = new Intent(HomeActivity.this, OrderActivity.class);
            startActivity(intent);
        });

        // Back Button Click Listener
        Button BackButton = findViewById(R.id.Back);
        BackButton.setOnClickListener(view -> {
            // Open the OrderActivity when the Order Now button is clicked
            Intent intent = new Intent(HomeActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}