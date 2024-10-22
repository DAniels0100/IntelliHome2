package com.example.intellihome;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;  // Asegúrate de importar esta clase
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        // Obtener el color pasado desde la actividad anterior
        String selectedColor = getIntent().getStringExtra("SELECTED_COLOR");

        // Establecer el color de la franja
        View colorBand = findViewById(R.id.color_band);

        // Verificar si el color seleccionado no es nulo
        if (selectedColor != null) {
            colorBand.setBackgroundColor(Color.parseColor(selectedColor));
        }
    }
}