package com.example.myfoodapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        // Back Button Click Listener
        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(view -> {
            // Start OrderActivity when the Back button is clicked
            Intent intent = new Intent(MenuActivity.this, OrderActivity.class);
            startActivity(intent);
            // Finish the current activity (MenuActivity)
            finish();
        });

        // Indian Button Click Listener
        Button indianButton = findViewById(R.id.indianButton);
        indianButton.setOnClickListener(view -> {
            // Start IndianItemsActivity when the Indian button is clicked
            Intent intent = new Intent(MenuActivity.this, IndianitemActivity.class);
            startActivity(intent);
        });

        // Chinese Button Click Listener
        Button chineseButton = findViewById(R.id.chineseButton);
        chineseButton.setOnClickListener(view -> {
            // Start ChineseItemsActivity when the Chinese button is clicked
            Intent intent = new Intent(MenuActivity.this, ChineseitemActivity.class);
            startActivity(intent);
        });

        // Italian Button Click Listener
        Button italianButton = findViewById(R.id.italianButton);
        italianButton.setOnClickListener(view -> {
            // Start ItalianItemsActivity when the Italian button is clicked
            Intent intent = new Intent(MenuActivity.this, ItalianActivity.class);
            startActivity(intent);
        });

        // Thai Button Click Listener
        Button thaiButton = findViewById(R.id.thaiButton);
        thaiButton.setOnClickListener(view -> {
            // Start ThaiItemsActivity when the Thai button is clicked
            Intent intent = new Intent(MenuActivity.this, ThaiitemActivity.class);
            startActivity(intent);
        });




    }
}