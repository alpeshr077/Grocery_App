package com.alpesh1.grocery_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class login_page_2 extends AppCompatActivity {

    TextView LogIn2;
    ImageView Back1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page2);


        LogIn2 = findViewById(R.id.LogIn2);
        Back1 = findViewById(R.id.Back1);

        LogIn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(login_page_2.this,Login_Page_3.class);
                startActivity(intent);
            }
        });

        Back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login_page_2.this,Login_Page_1.class);
                startActivity(intent);
            }
        });
    }
}