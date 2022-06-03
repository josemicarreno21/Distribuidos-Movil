package com.example.proyectosistdistribuidos;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Equipos_Adapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Lista_Equipos> lista_equipos;
    Button irJugador,irEntrenador,irDesempeñoEquipo;

    public Equipos_Adapter(Context context, int layout, List<Lista_Equipos> lista_equipos) {
        this.context = context;
        this.layout = layout;
        this.lista_equipos = lista_equipos;
    }


    @Override
    public int getCount() {
        return this.lista_equipos.size();
    }

    @Override
    public Object getItem(int position) {
        return this.lista_equipos.get(position);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if(convertView==null){
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            convertView=layoutInflater.inflate(this.layout,null);
            holder = new ViewHolder(convertView);

            convertView.setTag(holder);
        }else {
            holder=(ViewHolder)convertView.getTag();
        }

        Lista_Equipos lista1 = this.lista_equipos.get(position);
        String nombre=lista1.getNombreEquipo();
        String entrenador = lista1.getNombreEntrenador();
        String puntosAnotados = lista1.getPuntosAnotados();
        String puntosFavor = lista1.getPuntosFavor();
        String puntosContra = lista1.getPuntosContra();
        String cesto1 = lista1.getCesto1();
        String cesto2 = lista1.getCesto2();
        String cesto3 = lista1.getCesto3();

        holder.tvNombre.setText(nombre);
        holder.tvEntrenador.setText(entrenador);
        holder.puntosAnotados.setText(puntosAnotados);
        holder.puntosContra.setText(puntosContra);
        holder.puntosFavor.setText(puntosFavor);
        holder.cesto1.setText(cesto1);
        holder.cesto2.setText(cesto2);
        holder.cesto2.setText(cesto2);
        holder.cesto3.setText(cesto3);

        holder.btnEntrenador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context,EntrenadorActivity.class);
                context.startActivity(i);
            }
        });

        holder.verJugadorInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context,Info_Equipos.class);
                context.startActivity(i);
            }
        });

        holder.verDesempeño.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context,Desempenio.class);
                context.startActivity(i);
            }
        });



        return convertView;
    }

    static class ViewHolder{
        private TextView tvNombre;
        private TextView tvEntrenador;
        private TextView puntosAnotados;
        private TextView puntosFavor;
        private TextView puntosContra;
        private TextView cesto1;
        private TextView cesto2;
        private TextView cesto3;
        private Button btnEntrenador,verJugadorInfo,verDesempeño;

        public ViewHolder (View view){
            this.tvNombre=view.findViewById(R.id.nombreEquipo);
            this.tvEntrenador=view.findViewById(R.id.irEntrenador);
            this.puntosAnotados=view.findViewById(R.id.puntosAnotados);
            this.puntosFavor=view.findViewById(R.id.puntosFavor);
            this.puntosContra=view.findViewById(R.id.puntosContra);
            this.cesto1=view.findViewById(R.id.cestosAnotados1);
            this.cesto2=view.findViewById(R.id.cestosAnotados2);
            this.cesto3=view.findViewById(R.id.cestosAnotados3);

            this.btnEntrenador=view.findViewById(R.id.irEntrenador);
            this.verDesempeño=view.findViewById(R.id.irDesempeñoEquipo);
            this.verJugadorInfo=view.findViewById(R.id.irJugador);
        }
    }
}
