package com.alpesh1.grocery_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    TextView Edit;

    ImageView BackOrders;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Edit = findViewById(R.id.Edit);

        BackOrders = findViewById(R.id.BackOrders);

        Edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this,Profile_2.class);
                startActivity(intent);
            }
        });

        BackOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this,Home_page.class);
                startActivity(intent);
            }
        });
    }
}