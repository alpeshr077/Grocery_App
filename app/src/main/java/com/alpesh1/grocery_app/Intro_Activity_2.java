package com.alpesh1.grocery_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Intro_Activity_2 extends AppCompatActivity {

    ImageButton NextButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro2);

        NextButton2 = findViewById(R.id.NextButton2);

        NextButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intro_Activity_2.this,Intro_Activity_3.class);
                finish();
                startActivity(intent);
            }
        });
    }
}