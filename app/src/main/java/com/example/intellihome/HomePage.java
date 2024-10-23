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

        // Estableciendo un OnClickListener para que al hacer clic se redirija a PerfilActivity
        perfilMenu.setOnClickListener(v -> {
            Intent intent = new Intent(HomePage.this, PerfilActivity.class);
            startActivity(intent);
        });
    }
}
