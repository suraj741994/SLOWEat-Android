package com.example.myfoodapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        // Back Button Click Listener
        Button backButtonPayment = findViewById(R.id.backButtonPayment);
        backButtonPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start ChineseitemActivity when the Back button is clicked
                Intent intent = new Intent(PaymentActivity.this, ChineseitemActivity.class);
                startActivity(intent);
                // Finish the current activity (PaymentActivity)
                finish();
            }
        });

        // Payment Option Button Click Listener
        Button paymentOptionButton = findViewById(R.id.paymentOptionButton);
        paymentOptionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start PaymentSuccessActivity when the Payment Option button is clicked
                Intent intent = new Intent(PaymentActivity.this, PaymentSuccessActivity.class);
                startActivity(intent);
            }
        });
    }
}
