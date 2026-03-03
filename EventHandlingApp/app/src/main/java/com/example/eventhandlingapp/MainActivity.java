package com.example.eventhandlingapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnClick, btnLongClick;
    CheckBox checkBox;
    TextView tvResult;
    LinearLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = findViewById(R.id.btnClick);
        btnLongClick = findViewById(R.id.btnLongClick);
        checkBox = findViewById(R.id.checkBox);
        tvResult = findViewById(R.id.tvResult);
        mainLayout = findViewById(R.id.mainLayout);

        // 1️⃣ Click Event
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("Button Clicked!");
                Toast.makeText(MainActivity.this,
                        "You clicked the button",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // 2️⃣ Long Click Event
        btnLongClick.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                tvResult.setText("Long Button Pressed!");
                Toast.makeText(MainActivity.this,
                        "Long Press Detected",
                        Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        // 3️⃣ Checkbox Event
        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                mainLayout.setBackgroundColor(Color.parseColor("#FFB6C1"));
                tvResult.setText("Background Changed!");
            } else {
                mainLayout.setBackgroundResource(R.drawable.bg_gradient);
                tvResult.setText("Background Reset!");
            }
        });
    }
}