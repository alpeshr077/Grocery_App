package com.alpesh1.grocery_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Login_Page_3 extends AppCompatActivity {

    TextView LogIn3;
    ImageView Back3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page3);

        LogIn3 = findViewById(R.id.LonIn3);
        Back3 = findViewById(R.id.Back3);

        LogIn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Login_Page_3.this,Register_Page_1.class);
                startActivity(intent);
            }
        });

        Back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login_Page_3.this,login_page_2.class);
                startActivity(intent);
            }
        });
    }
}