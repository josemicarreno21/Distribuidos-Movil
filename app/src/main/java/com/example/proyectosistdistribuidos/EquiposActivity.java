package com.example.proyectosistdistribuidos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class EquiposActivity extends AppCompatActivity {

    Button irJugador,irEntrenador,irDesempeñoEquipo;
    ImageView imageView;
    ListView listView;
    List <Lista_Equipos>lista;
    Equipos_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipos);


        listView=findViewById(R.id.listviewEquipos);

        setLista();

        Equipos_Adapter adapter = new Equipos_Adapter(this, R.layout.lista_equipos, lista);
        listView.setAdapter(adapter);

        /*irJugador = findViewById(R.id.irJugador);
        irEntrenador = findViewById(R.id.irEntrenador);
        irDesempeñoEquipo = findViewById(R.id.irDesempeñoEquipo);
        imageView = findViewById(R.id.imgView);

        /*irJugador.setOnClickListener(new View.OnClickListener() {
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
        });*/
    }

    private void setLista() {
        lista = new ArrayList<>();
        lista.add(new Lista_Equipos("Lakers","Juan Gabriel","9","15","10","2","3","5"));
        lista.add(new Lista_Equipos("Ushuni","Pedro Fernandez","25","2","6","7","2","1"));
        lista.add(new Lista_Equipos("BoliviaBasket","Pedro Fernandez","15","9","2","7","5","6"));
        lista.add(new Lista_Equipos("La Paz BC","Alejando Sans","15","9","2","7","5","6"));

    }
}