package com.example.realcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;

    String currentExpression = "";
    int firstNumber = 0;
    boolean isAddPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.tvDisplay);
    }

    // Called when any calculator button is clicked
    public void onButtonClick(View view) {
        Button button = (Button) view;
        String value = button.getText().toString();

        // NUMBER BUTTONS
        if (value.matches("[0-9]")) {
            currentExpression += value;
            tvDisplay.setText(currentExpression);
        }

        // PLUS BUTTON
        else if (value.equals("+")) {
            if (!currentExpression.contains("+")) {
                firstNumber = Integer.parseInt(currentExpression);
                currentExpression += "+";
                isAddPressed = true;
                tvDisplay.setText(currentExpression);
            }
        }

        // EQUAL BUTTON
        else if (value.equals("=")) {
            if (isAddPressed && currentExpression.contains("+")) {
                String[] parts = currentExpression.split("\\+");
                int secondNumber = Integer.parseInt(parts[1]);
                int result = firstNumber + secondNumber;

                tvDisplay.setText(String.valueOf(result));
                currentExpression = String.valueOf(result);
                isAddPressed = false;
            }
        }

        // CLEAR BUTTON
        else if (value.equals("C")) {
            currentExpression = "";
            firstNumber = 0;
            isAddPressed = false;
            tvDisplay.setText("0");
        }
    }
}