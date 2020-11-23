package com.e.loguin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Bienvenido extends AppCompatActivity {
    private TextView TVSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);

        TVSaludo = (TextView) findViewById(R.id.TVSaludo);
        String saludo = "Bienvenido "+getIntent().getStringExtra("name")+"!!!";
        TVSaludo.setText(saludo);
        Toast.makeText(this, "Usuario válido", Toast.LENGTH_LONG).show();

    }
}