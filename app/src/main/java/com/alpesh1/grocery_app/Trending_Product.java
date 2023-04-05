package com.alpesh1.grocery_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Trending_Product extends AppCompatActivity {

    ImageView backarrow;

    LinearLayout chocksend;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending_product);

        backarrow = findViewById(R.id.backarrow);

        chocksend = findViewById(R.id.chocksend);

        backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Trending_Product.this,Home_page.class);
                startActivity(intent);
            }
        });

        chocksend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Trending_Product.this,Details.class);
                startActivity(intent);
            }
        });
    }
}