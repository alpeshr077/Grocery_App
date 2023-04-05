package com.alpesh1.grocery_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Home_page extends AppCompatActivity {

    ImageView trending,notification,categories,profile;

    TextView seeall1,seeall2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        trending = findViewById(R.id.trending);

        notification = findViewById(R.id.notification);

        categories = findViewById(R.id.categories);

        seeall1 = findViewById(R.id.seeall1);

        seeall2 = findViewById(R.id.seeall2);

        profile = findViewById(R.id.profile);

        trending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_page.this,Trending_Product.class);
                startActivity(intent);
            }
        });

        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_page.this,Notification.class);
                startActivity(intent);
            }
        });

        categories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_page.this,Categories.class);
                startActivity(intent);
            }
        });
        seeall1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_page.this,Categories.class);
                startActivity(intent);
            }
        });
        seeall2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_page.this,Recommended.class);
                startActivity(intent);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_page.this,Profile.class);
                startActivity(intent);
            }
        });
    }
}