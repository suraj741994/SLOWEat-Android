package com.example.myfoodapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        // Back Button Click Listener
        Button backButton = findViewById(R.id.Back);
        backButton.setOnClickListener(view -> {
            // Start MainActivity when the Back button is clicked
            Intent intent = new Intent(ContactActivity.this, HomeActivity.class);
            startActivity(intent);
            // Finish the current activity (ContactActivity)
            finish();
        });
    }
}