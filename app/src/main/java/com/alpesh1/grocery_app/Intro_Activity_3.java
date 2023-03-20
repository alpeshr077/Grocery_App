package com.alpesh1.grocery_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Intro_Activity_3 extends AppCompatActivity {

    ImageButton NextButton3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro3);


        NextButton3 = findViewById(R.id.NextButton3);

        NextButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intro_Activity_3.this,Intro_Activity_4.class);
                finish();
                startActivity(intent);
            }
        });
    }
}