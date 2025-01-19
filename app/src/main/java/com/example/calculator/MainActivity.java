package com.example.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        addition();
        subtraction();
        multiply();
        divide();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void addition() {
        Button addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(v -> {
            EditText firstNumber = findViewById(R.id.firstNumber);
            EditText secondNumber = findViewById(R.id.secondNumber);
            TextView answer = findViewById(R.id.answer);

            String firstNumberString = firstNumber.getText().toString();
            double num1 = Double.parseDouble(firstNumberString);

            String secondNumberString = secondNumber.getText().toString();
            double num2 = Double.parseDouble(secondNumberString);

            double additionSum = num1 + num2;

            answer.setText(String.format("%.2f", additionSum));
        });
    }

    private void subtraction() {
        Button addButton = findViewById(R.id.subButton);
        addButton.setOnClickListener(v -> {
            EditText firstNumber = findViewById(R.id.firstNumber);
            EditText secondNumber = findViewById(R.id.secondNumber);
            TextView answer = findViewById(R.id.answer);

            String firstNumberString = firstNumber.getText().toString();
            double num1 = Double.parseDouble(firstNumberString);

            String secondNumberString = secondNumber.getText().toString();
            double num2 = Double.parseDouble(secondNumberString);

            double subtractionSum = num1 - num2;

            answer.setText(String.format("%.2f", subtractionSum));

        });
    }

    private void divide() {
        Button divButton = findViewById(R.id.divButton);
        divButton.setOnClickListener(v -> {
            EditText firstNumber = findViewById(R.id.firstNumber);
            EditText secondNumber = findViewById(R.id.secondNumber);
            TextView answer = findViewById(R.id.answer);

            String firstNumberString = firstNumber.getText().toString();
            double num1 = Double.parseDouble(firstNumberString);

            String secondNumberString = secondNumber.getText().toString();
            double num2 = Double.parseDouble(secondNumberString);

            double divisionSum = num1 + num2;

            answer.setText(String.format("%.2f", divisionSum));
        });
    }

    private void multiply() {
        Button multiButton = findViewById(R.id.multiButton);
        multiButton.setOnClickListener(v -> {
            EditText firstNumber = findViewById(R.id.firstNumber);
            EditText secondNumber = findViewById(R.id.secondNumber);
            TextView answer = findViewById(R.id.answer);

            String firstNumberString = firstNumber.getText().toString();
            double num1 = Double.parseDouble(firstNumberString);

            String secondNumberString = secondNumber.getText().toString();
            double num2 = Double.parseDouble(secondNumberString);

            double multiSum = num1 + num2;

            answer.setText(String.format("%.2f", multiSum));
        });
    }
}