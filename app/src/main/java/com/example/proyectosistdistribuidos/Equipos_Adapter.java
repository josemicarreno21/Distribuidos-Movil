package com.example.proyectosistdistribuidos;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Equipos_Adapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Lista_Equipos> lista_equipos;

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

        ViewHol
        return null;
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

        public ViewHolder (View view){
            this.tvNombre=view.findViewById(R.id.nombreEquipo);
            //this.tvEntrenador=view.findViewById(R.id.tvEntrenador);
            this.tvNombre=view.findViewById(R.id.nombreEquipo);
            this.tvNombre=view.findViewById(R.id.nombreEquipo);
            this.tvNombre=view.findViewById(R.id.nombreEquipo);
            this.tvNombre=view.findViewById(R.id.nombreEquipo);
            this.tvNombre=view.findViewById(R.id.nombreEquipo);
            this.tvNombre=view.findViewById(R.id.nombreEquipo);


        }

    }

}
