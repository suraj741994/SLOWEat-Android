package com.example.myfoodapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ThaiitemActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thaiitems);


        // Back Button Click Listener
        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(view -> {
            // Start MenuActivity when the Back button is clicked
            Intent intent = new Intent(ThaiitemActivity.this, MenuActivity.class);
            startActivity(intent);
            // Finish the current activity (ThaiItemsActivity)
            finish();
        });



        // Add code specific to Thai items activity if needed
    }
}

