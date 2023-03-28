package com.alpesh1.grocery_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Delivery_Status extends AppCompatActivity {

    TextView Cancel_order1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_status);

        Cancel_order1 = findViewById(R.id.Cancel_order1);

        Cancel_order1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Delivery_Status.this,My_Order.class);
                startActivity(intent);
            }
        });
    }
}