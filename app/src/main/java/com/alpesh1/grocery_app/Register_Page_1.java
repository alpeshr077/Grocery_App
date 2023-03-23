package com.alpesh1.grocery_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Register_Page_1 extends AppCompatActivity {

    TextView Regi1;
    ImageView BackRegi1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page1);

        Regi1 = findViewById(R.id.Regi1);
        BackRegi1 = findViewById(R.id.BackRegi1);

        Regi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register_Page_1.this,Register_Page_2.class);
                startActivity(intent);
            }
        });

        BackRegi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register_Page_1.this,Login_Page_3.class);
                startActivity(intent);
            }
        });
    }
}