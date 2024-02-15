// CartActivity.java
package com.example.myfoodapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart_layout);

        // Retrieve cart details from Intent (assuming you've passed the cart information)
        // You may need to modify this part based on how you pass the cart information
        // For simplicity, I'm assuming you've passed the items and total as strings
        String item1 = "Item 1: Fried Rice $10.99";
        String item2 = "Item 2: Sezchuan Shrimp $14.99";
        String total = "Total: $26.98";

        // Initialize TextViews
        TextView item1TextView = findViewById(R.id.item1TextView);
        TextView item2TextView = findViewById(R.id.item2TextView);
        TextView totalTextView = findViewById(R.id.totalTextView);

        // Display cart details
        item1TextView.setText(item1);
        item2TextView.setText(item2);
        totalTextView.setText(total);


        // Make Payment Button Click Listener
        Button paymentButton = findViewById(R.id.paymentButton);
        paymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open PaymentActivity when the Make Payment button is clicked
                Intent intent = new Intent(CartActivity.this, PaymentActivity.class);
                startActivity(intent);
            }
        });
        // Back Button Click Listener
        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    // Start OrderActivity when the Back button is clicked
                    Intent intent = new Intent(CartActivity.this, OrderActivity.class);
                    startActivity(intent);
                    // Finish the current activity (CartActivity)
                    finish();
                }
        });
    }

    private void showToast(String message) {
        // Display a toast message
        // You can replace this with your preferred way of showing messages
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }
}
