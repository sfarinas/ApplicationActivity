package com.example.applicationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button buttonIrParaSegunda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonIrParaSegunda = findViewById(R.id.buttonIrParaSegunda);


        buttonIrParaSegunda.setOnClickListener(view -> {

            Intent intent = new Intent(this, SegundaActivity.class);
            startActivity(intent);

        });
    }
}