package com.e.loguin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText ETnombre, ETcontrasenia;
    /*    private final String USER = "User";
    private final String PASS = "123";*/

    private ArrayList<Users> Usurers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ETnombre = (EditText) findViewById(R.id.ETName);
        ETcontrasenia = (EditText) findViewById(R.id.ETContrasenia);
        ImageButton btnIngresar = (ImageButton) findViewById(R.id.IBIngresar);
        Usurers = new ArrayList<>();
        Usurers.add(new Users("Andrea", "123"));
        Usurers.add(new Users("Juan", "456"));
        Usurers.add(new Users("Maria", "789"));

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter();

            }
        });
    }

    private void enter() {
     /*if(ETnombre.getText().toString().equals(USER) && ETcontrasenia.getText().toString().equals(PASS)){
         Intent i = new Intent(this, Bienvenido.class);
         i.putExtra("name", ETnombre.getText().toString());
         startActivity(i);*/
        for (int j = 0; j < Usurers.size(); j++) {
            if ((Usurers.get(j).getName().equals(ETnombre.getText().toString())) && Usurers.get(j).getPass().equals(ETcontrasenia.getText().toString())) {
                Intent intent = new Intent(this, Bienvenido.class);
                intent.putExtra("name", ETnombre.getText().toString());
                startActivity(intent);

            } else
                Toast.makeText(this, "Usuario inválido, reintente!", Toast.LENGTH_SHORT).show();

        }
        }
    }
