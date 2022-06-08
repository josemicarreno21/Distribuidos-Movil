package com.example.proyectosistdistribuidos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.proyectosistdistribuidos.clases.ConexionPG;
import com.example.proyectosistdistribuidos.clases.Partidos;
import com.example.proyectosistdistribuidos.clases.listaPartidos;

import java.sql.CallableStatement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<Partidos>partidosList;
    List<listaPartidos>partidosLista;
    Lista_Partidos_Adapter lista_partidos_adapter;

    private static ConexionPG con=new ConexionPG();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cargar_Partidos();

        listView=findViewById(R.id.lvPartidos);
        cargarPartidos();
        lista_partidos_adapter=new Lista_Partidos_Adapter(partidosList,R.layout.lista_partidos,this);
        listView.setAdapter(lista_partidos_adapter);
    }

    private void cargarPartidos(){
        partidosList = new ArrayList<>();
        partidosList.add(new Partidos("1","Equipo Local 1","Equipo Visitante 1",
                "03/06/2022","15:30","La Paz", "1","1"));
    }

    private void Cargar_Partidos(){
        try {
            String query="select Eql.imagen_equipo, Eqv.imagen_equipo, Sc.puntos, Par.fecha_partido, Par.hora_partido, Par.lugar_partido\n" +
                    "from tpartidos Par inner join tequipos Eql on Par.id_equipo_l=Eql.id_equipo\n" +
                    "    inner join tequipos Eqv on Par.id_equipo_v=Eqv.id_equipo\n" +
                    "    inner join tscore Sc on Par.id_score=Sc.id_score";
            CallableStatement cstmt=con.conexion().prepareCall(query);
            cstmt.registerOutParameter(1, Types.VARCHAR);
            cstmt.registerOutParameter(2, Types.VARCHAR);
            cstmt.registerOutParameter(3, Types.VARCHAR);
            cstmt.registerOutParameter(4, Types.VARCHAR);
            cstmt.registerOutParameter(5, Types.VARCHAR);
            cstmt.registerOutParameter(6, Types.VARCHAR);

            String imagen_equipo_l=cstmt.getString(1);
            String imagen_equipo_v=cstmt.getString(2);
            String puntos=cstmt.getString(3);
            String fecha_partido=cstmt.getString(4);
            String hora_partido=cstmt.getString(5);
            String lugar_partidov=cstmt.getString(6);

            partidosLista.add(new listaPartidos(imagen_equipo_l,imagen_equipo_v,puntos,
                    fecha_partido,hora_partido,lugar_partidov));

        }catch (Exception ex){
            //Toast.makeText(getApplicationContext(),ex.toString(),Toast.LENGTH_LONG).show();
        }
    }
}