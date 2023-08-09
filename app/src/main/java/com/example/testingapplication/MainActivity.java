package com.example.testingapplication;


import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
        Button buttonOne = findViewById(R.id.button_one);
        Button buttonTwo = findViewById(R.id.button_two);
        Button buttonPlus = findViewById(R.id.button_plus);

        buttonOne.setOnClickListener(view -> addNumber(1));
        buttonTwo.setOnClickListener(view -> addNumber(2));
        buttonPlus.setOnClickListener(view -> addOperation());
    }

    private void addNumber(int number) {
        String currentText = result.getText().toString();
        result.setText(currentText + number);
    }

    private void addOperation() {
        String currentText = result.getText().toString();
        result.setText(currentText + "+");
    }

    public int calculate(String expression) {
        String[] parts = expression.split("\\+");
        int sum = 0;
        for (String part : parts) {
            sum += Integer.parseInt(part);
        }
        return sum;
    }
}