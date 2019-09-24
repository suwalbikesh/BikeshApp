package com.myapp.bikeshapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etCelsius, etFahrenheit;
    private Button btnCelsius, btnFahrenheit;
    Double celsius, fahrenheit, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding
        etCelsius = findViewById(R.id.etCelsius);
        etFahrenheit = findViewById(R.id.etFahrenheit);
        btnCelsius = findViewById(R.id.btnCelsius);
        btnFahrenheit = findViewById(R.id.btnFahrenheit);

        //click listener for buttons
        btnCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fahrenheit = Double.parseDouble(etFahrenheit.getText().toString());
                result = (fahrenheit - 32) * 5/9;

                //output
                Toast.makeText(MainActivity.this, "Celsius is "+result, Toast.LENGTH_LONG).show();
            }
        });

        btnFahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                celsius = Double.parseDouble(etCelsius.getText().toString());
                result = (celsius * 9/5) + 32;

                //output
                Toast.makeText(MainActivity.this, "Fahrenheit is "+result, Toast.LENGTH_LONG).show();


            }
        });


    }
}
