package com.example.proyectosistdistribuidos;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.proyectosistdistribuidos.clases.Jugadores;
import com.example.proyectosistdistribuidos.clases.Partidos;

import java.util.List;

public class Formacion_Adapter extends BaseAdapter {
    private List<Jugadores> jugadoresList;
    private int layout;
    private Context context;

    public Formacion_Adapter(List<Jugadores> jugadoresList, int layout, Context context) {
        this.jugadoresList = jugadoresList;
        this.layout = layout;
        this.context = context;
    }

    @Override
    public int getCount() {
        return this.jugadoresList.size();
    }

    @Override
    public Object getItem(int i) {
        return this.jugadoresList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ViewHolder holder;
        if(convertView==null){
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            convertView=layoutInflater.inflate(this.layout,null);
            holder = new ViewHolder(convertView);

            convertView.setTag(holder);
        }else {
            holder=(Formacion_Adapter.ViewHolder)convertView.getTag();
        }
        Jugadores jugadores=this.jugadoresList.get(i);
        //holder.txtFormacion.setText(jugadores.getNombre_jugador()+" "+jugadores.getNombre_jugador()+": "+jugadores.getPosicion_jugador());


        return convertView;
    }

    public class ViewHolder{
        TextView txtFormacion;

        public ViewHolder(@NonNull View v) {
            txtFormacion=v.findViewById(R.id.txtFormacion);
        }
    }
}
