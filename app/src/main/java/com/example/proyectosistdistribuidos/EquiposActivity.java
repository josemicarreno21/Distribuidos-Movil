package com.example.proyectosistdistribuidos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class EquiposActivity extends AppCompatActivity {

    Button irJugador,irEntrenador,irDesempeñoEquipo;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipos);

        irJugador = findViewById(R.id.irJugador);
        irEntrenador = findViewById(R.id.irEntrenador);
        irDesempeñoEquipo = findViewById(R.id.irDesempeñoEquipo);
        imageView = findViewById(R.id.imageView);

        irJugador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jugador = new Intent(getBaseContext(),JugadorActivity.class);
                startActivity(jugador);

            }
        });

        irEntrenador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent entrenador = new Intent(getBaseContext(),EntrenadorActivity.class);
                startActivity(entrenador);
            }
        });

        irDesempeñoEquipo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent desempeño = new Intent(getBaseContext(),)
                //TODO ir a Activity DesempeñoEquipos
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO ir a Activity equipos Detallados
            }
        });

    }
}