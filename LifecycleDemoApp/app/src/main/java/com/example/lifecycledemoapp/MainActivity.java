package com.example.lifecycledemoapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvStatus = findViewById(R.id.tvStatus);

        tvStatus.setText("onCreate() Called");
        Toast.makeText(this, "onCreate()", Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle", "onCreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        tvStatus.setText("onStart() Called");
        Toast.makeText(this, "onStart()", Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle", "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        tvStatus.setText("onResume() Called");
        Toast.makeText(this, "onResume()", Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle", "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        tvStatus.setText("onPause() Called");
        Toast.makeText(this, "onPause()", Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle", "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        tvStatus.setText("onStop() Called");
        Toast.makeText(this, "onStop()", Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle", "onStop called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        tvStatus.setText("onRestart() Called");
        Toast.makeText(this, "onRestart()", Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle", "onRestart called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy()", Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle", "onDestroy called");
    }
}