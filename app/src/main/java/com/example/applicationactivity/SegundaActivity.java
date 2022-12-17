package com.example.applicationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private Button buttonIrParaTerceira;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        buttonIrParaTerceira = findViewById(R.id.buttonIrParaTerceira);

        buttonIrParaTerceira.setOnClickListener(view -> {
            startActivity(new Intent(this, TerceiraActivity.class));
        });
    }
}