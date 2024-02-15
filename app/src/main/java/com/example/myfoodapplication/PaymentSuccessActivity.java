package com.example.myfoodapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PaymentSuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_success);

        // Back Button Click Listener
        Button backButtonSuccess = findViewById(R.id.backButtonSuccess);
        backButtonSuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start ChineseitemActivity when the Back button is clicked
                Intent intent = new Intent(PaymentSuccessActivity.this, ChineseitemActivity.class);
                startActivity(intent);
                // Finish the current activity (PaymentSuccessActivity)
                finish();
            }
        });
    }
}
