package com.example.intellihome;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        // Encuentra el ImageView de perfil
        ImageView perfilMenu = findViewById(R.id.perfilmenu);

        perfilMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomePage.this, Perfil.class));
            }
        });

        // Encuentra el ImageView de historial
        ImageView historial = findViewById(R.id.historial);

        historial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomePage.this, Historial.class));
            }
        });

        // Encuentra el ImageView de domotica
        ImageView domotica = findViewById(R.id.domotica);

        domotica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomePage.this, Domotica.class));
            }
        });
    }
}
