package com.anna.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btenv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btenv = findViewById(R.id.btEnviar);
        btenv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Criar Intent para enviar dados para SegundaActivity
                Intent intent = new Intent(MainActivity.this, Activity2.class);

                // Adicionar dados à Intent
                intent.putExtra("double_value", 10.5);
                intent.putExtra("string_value", "Olá Mundo!");
                intent.putExtra("int_value", 123);
                intent.putExtra("float_value", 3.14f);

                // Iniciar SegundaActivity
                startActivity(intent);
            }
        });






    }
}
