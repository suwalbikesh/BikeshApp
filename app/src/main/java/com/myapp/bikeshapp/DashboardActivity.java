package com.myapp.bikeshapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btncal, btnsi, btncon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btncal = findViewById(R.id.btncal);
        btnsi = findViewById(R.id.btnsi);
        btncon = findViewById(R.id.btncon);

        btncal.setOnClickListener(this);
        btnsi.setOnClickListener(this);
        btncon.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btncal){
            Intent intent = new Intent(DashboardActivity.this,MainActivity.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.btnsi){
            Intent intent = new Intent(DashboardActivity.this,MainActivity.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.btncon){
            Intent intent = new Intent(DashboardActivity.this,MainActivity.class);
            startActivity(intent);
        }


    }
}
