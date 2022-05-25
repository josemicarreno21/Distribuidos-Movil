package com.example.proyectosistdistribuidos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EquiposActivity extends AppCompatActivity {

    Button irJugador,irEntrenador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipos);

        irJugador = findViewById(R.id.irJugador);
        irEntrenador = findViewById(R.id.irEntrenador);

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



    }
}