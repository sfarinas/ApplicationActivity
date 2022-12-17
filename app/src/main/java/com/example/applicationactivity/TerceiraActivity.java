package com.example.applicationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class TerceiraActivity extends AppCompatActivity {

    private Button buttonIrParaPrimeira;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);

        buttonIrParaPrimeira = findViewById(R.id.buttonIrParaPrimeira);

        buttonIrParaPrimeira.setOnClickListener(view -> {
            startActivity(new Intent(this, MainActivity.class));
        });
    }
}