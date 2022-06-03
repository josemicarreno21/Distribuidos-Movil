package com.example.proyectosistdistribuidos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.proyectosistdistribuidos.clases.ConexionPG;
import com.example.proyectosistdistribuidos.clases.Partidos;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<Partidos>partidosList;
    Lista_Partidos_Adapter lista_partidos_adapter;

    private static ConexionPG con=new ConexionPG();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.lvPartidos);
        cargarPartidos();
        lista_partidos_adapter=new Lista_Partidos_Adapter(partidosList,R.layout.lista_partidos,this);
        listView.setAdapter(lista_partidos_adapter);
    }

    private void cargarPartidos(){
        partidosList = new ArrayList<>();
        partidosList.add(new Partidos(1,"Equipo Local 1","Equipo Visitante 1",
                "03/06/2022","15:30","La Paz", "1","1",1,1));
        partidosList.add(new Partidos(2,"Equipo Local 2","Equipo Visitante 2",
                "05/07/2022","18:30","Cochabamba", "2","2",2,2));
    }
}