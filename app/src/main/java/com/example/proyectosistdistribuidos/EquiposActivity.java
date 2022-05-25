package com.example.proyectosistdistribuidos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

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
        imageView = findViewById(R.id.imgView);

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
                Intent desempeño = new Intent(getBaseContext(),Desempenio.class);
                startActivity(desempeño);
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(EquiposActivity.this, "A", Toast.LENGTH_SHORT).show();
                Intent detallado = new Intent(getBaseContext(),Info_Equipos.class);
                startActivity(detallado);
            }
        });
    }
}