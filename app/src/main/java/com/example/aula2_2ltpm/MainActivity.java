package com.example.aula2_2ltpm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    EditText edNome;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edNome = findViewById(R.id.edNome);
        btnEnviar = findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String nome = edNome.getText().toString();
                Toast.makeText(MainActivity.this, "Hello World " + nome, Toast.LENGTH_LONG).show();
            }
        });
    }
}