package com.example.proyectosistdistribuidos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.proyectosistdistribuidos.clases.Jugadores;
import com.example.proyectosistdistribuidos.clases.Partidos;

import java.util.ArrayList;
import java.util.List;

public class Info_Equipos extends AppCompatActivity {
    ListView listView;
    List<Jugadores> jugadoresList;
    Formacion_Adapter formacion_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_equipos);

        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.lvPartidos);
        cargarJugadores();
        formacion_adapter=new Formacion_Adapter(jugadoresList,R.layout.lista_formacion,this);
        listView.setAdapter(formacion_adapter);
    }

    private void cargarJugadores() {
        jugadoresList = new ArrayList<>();
        jugadoresList.add(new Jugadores("1","Jose","Carreno Angola", "02-06-2000",
                "","Delantero","180","1","1"));
        jugadoresList.add(new Jugadores("2","Claudia","Jimenez Herera", "02-06-2001",
                "","Defensa","175","2","1"));
    }
}