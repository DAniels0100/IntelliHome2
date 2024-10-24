package com.example.intellihome;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Domotica extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domotica);

        // Encuentra el botón de regreso en el layout
        ImageView btnBack = findViewById(R.id.botonRegresar);

        // Asigna el evento onClick al botón de regreso
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirige a HomePage
                Intent intent = new Intent(Domotica.this, HomePage.class);
                startActivity(intent);
                finish(); // Finaliza la actividad actual
            }
        });

        // Encuentra el ImageView de perfil
        ImageView perfilMenu = findViewById(R.id.perfilmenu);

        perfilMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Domotica.this, Perfil.class));
            }
        });

        // Encuentra el ImageView de historial
        ImageView historial = findViewById(R.id.historial);

        historial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Domotica.this, Historial.class));
            }
        });

        // Encuentra el ImageView de domotica
        ImageView domotica = findViewById(R.id.domotica);

        domotica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Domotica.this, Domotica.class));
            }
        });
    }
}