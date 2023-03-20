package com.alpesh1.grocery_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Intro_Activity_4 extends AppCompatActivity {

    ImageButton NextButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro4);

        NextButton4 = findViewById(R.id.NextButton4);

        NextButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intro_Activity_4.this,Login_Page_1.class);
                finish();
                startActivity(intent);
            }
        });
    }
}