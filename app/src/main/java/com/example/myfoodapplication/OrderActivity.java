package com.example.myfoodapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);

        // Back Button Click Listener
        Button backButton = findViewById(R.id.Back);
        backButton.setOnClickListener(view -> {
            // Start MainActivity when the Back button is clicked
            Intent intent = new Intent(OrderActivity.this, HomeActivity.class);
            startActivity(intent);
            // Finish the current activity (OrderActivity)
            finish();
        });

        // Order Now Button Click Listener
        Button orderNowButton = findViewById(R.id.orderNowButton);
        orderNowButton.setOnClickListener(view -> {
            // Start MenuActivity when Order Now button is clicked
            Intent intent = new Intent(OrderActivity.this, com.example.myfoodapplication.MenuActivity.class);
            startActivity(intent);
        });
    }
}