package com.example.screenorientationapp;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvOrientation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOrientation = findViewById(R.id.tvOrientation);

        updateOrientation();
    }

    private void updateOrientation() {

        if (getResources().getConfiguration().orientation
                == Configuration.ORIENTATION_PORTRAIT) {

            tvOrientation.setText("Device is in Portrait Mode 📱");
        }
        else if (getResources().getConfiguration().orientation
                == Configuration.ORIENTATION_LANDSCAPE) {

            tvOrientation.setText("Device is in Landscape Mode 🖥️");
        }
    }
}