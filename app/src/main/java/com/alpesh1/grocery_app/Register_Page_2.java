package com.alpesh1.grocery_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Register_Page_2 extends AppCompatActivity {

    TextView Regi2;

    ImageView BackRegi2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page2);

        Regi2 = findViewById(R.id.Regi2);
        BackRegi2 = findViewById(R.id.BackRegi2);

        Regi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register_Page_2.this,Product_Page_1.class);
                startActivity(intent);
            }
        });

        BackRegi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register_Page_2.this,Register_Page_1.class);
                startActivity(intent);
            }
        });
    }
}