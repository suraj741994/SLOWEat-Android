package com.example.myfoodapplication;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ChineseitemActivity extends AppCompatActivity {

    // Assuming you have a Cart instance in your ChineseitemActivity class
    private Cart cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chineseitems);

        // Initialize the cart
        cart = new Cart();

        // Back Button Click Listener
        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(view -> {
            // Start MenuActivity when the Back button is clicked
            Intent intent = new Intent(ChineseitemActivity.this, MenuActivity.class);
            startActivity(intent);
            // Finish the current activity (ChineseItemsActivity)
            finish();
        });


        // Initialize the cart
        cart = new Cart();

        // Add to Cart Button Click Listener
        Button addToCartButton = findViewById(R.id.addToCartButton1);
        addToCartButton.setOnClickListener(view -> {
            // Add the item to the cart
            CartItem item = new CartItem("Fried rice", 10.99); // Replace with actual item details
            cart.addItem(item);
            Toast.makeText(this, "Item added to cart", Toast.LENGTH_SHORT).show();
        });
        // Add to Cart Button Click Listener
        Button addToCartButton1 = findViewById(R.id.addToCartButton3);
        addToCartButton1.setOnClickListener(view -> {
            // Add the item to the cart
            CartItem item = new CartItem("Szechuan Shrimp", 14.99); // Replace with actual item details
            cart.addItem(item);
            Toast.makeText(this, "Item added to cart", Toast.LENGTH_SHORT).show();
        });
        // Go to Cart Button Click Listener
        Button goCartButton = findViewById(R.id.goCartButton);
        goCartButton.setOnClickListener(view -> {
            // Open the cart activity
            Intent intent = new Intent(ChineseitemActivity.this, CartActivity.class);
            startActivity(intent);
        });
    }
}
