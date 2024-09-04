package com.anna.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        double doubleValue = intent.getDoubleExtra("double_value", 0.0);
        String stringValue = intent.getStringExtra("string_value");
        int intValue = intent.getIntExtra("int_value", 0);
        float floatValue = intent.getFloatExtra("float_value", 0.0f);

        // Referenciar os TextViews
        TextView textDouble = findViewById(R.id.textDouble);
        TextView textString = findViewById(R.id.textString);
        TextView textInt = findViewById(R.id.textInt);
        TextView textFloat = findViewById(R.id.textFloat);

        // Exibir os dados nos TextViews
        textDouble.setText("Double: " + doubleValue);
        textString.setText("String: " + stringValue);
        textInt.setText("Int: " + intValue);
        textFloat.setText("Float: " + floatValue);
    }
}