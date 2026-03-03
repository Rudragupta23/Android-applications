package com.example.toastdemoapp;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnSimple, btnLong, btnCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSimple = findViewById(R.id.btnSimple);
        btnLong = findViewById(R.id.btnLong);
        btnCustom = findViewById(R.id.btnCustom);

        // 1️⃣ Simple Toast
        btnSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "This is a Simple Toast!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // 2️⃣ Long Toast
        btnLong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "This is a Long Duration Toast!",
                        Toast.LENGTH_LONG).show();
            }
        });

        // 3️⃣ Custom Positioned Toast
        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this,
                        "Toast at Top of Screen!",
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 150);
                toast.show();
            }
        });
    }
}