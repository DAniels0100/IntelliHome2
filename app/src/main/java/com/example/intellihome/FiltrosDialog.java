package com.example.intellihome;

import android.app.Dialog;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class FiltrosDialog extends AppCompatDialogFragment {

    private EditText inputUbicacion, inputAmenidades, inputPersonas, inputPrecio, inputHabitaciones;
    private Button aplicarFiltros;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(R.layout.filtros, null);

        // Inicializar los campos
        inputUbicacion = view.findViewById(R.id.input_ubicacion);
        inputAmenidades = view.findViewById(R.id.input_amenidades);
        inputPersonas = view.findViewById(R.id.input_personas);
        inputPrecio = view.findViewById(R.id.input_precio);
        inputHabitaciones = view.findViewById(R.id.input_habitaciones);

        aplicarFiltros = view.findViewById(R.id.boton_aplicar_filtros);

        aplicarFiltros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí puedes obtener los valores y aplicar los filtros
                String ubicacion = inputUbicacion.getText().toString();
                String amenidades = inputAmenidades.getText().toString();
                String personas = inputPersonas.getText().toString();
                String precio = inputPrecio.getText().toString();
                String habitaciones = inputHabitaciones.getText().toString();

                // Procesar los filtros
                // ...

                // Cerrar el diálogo
                dismiss();
            }
        });

        builder.setView(view);
        return builder.create();
    }
}
