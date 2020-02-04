package com.example.circlefun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleClick(View view){
        EditText radiusInput = findViewById(R.id.editTextRadius);
        TextView output = findViewById(R.id.textViewResult);
        DecimalFormat FORMAT = new DecimalFormat("#.##");

        double  radius = Double.parseDouble(radiusInput.getText().toString());

        // calculate results
        double diameter = 2 * radius;
        double circumference = Math.PI * 2 * radius;
        double area = Math.PI * radius * radius;

        String result = "The Diameter is " + FORMAT.format(diameter) + "\nThe Circumference is "
                + FORMAT.format(circumference) + "\nThe area is " + FORMAT.format(area);

        output.setText(result);
        radiusInput.setText("");

    }
}