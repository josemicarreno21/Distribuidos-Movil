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
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectosistdistribuidos.clases.Partidos;

import java.util.List;

public class Lista_Partidos_Adapter extends BaseAdapter {

    private List<Partidos> partidosList;
    private int layout;
    private Context context;

    public Lista_Partidos_Adapter(List<Partidos> partidosList, int layout, Context context) {
        this.partidosList = partidosList;
        this.layout = layout;
        this.context = context;
    }

    @Override
    public int getCount() {
        return this.partidosList.size();
    }

    @Override
    public Object getItem(int i) {
        return this.partidosList.get(i);
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
            holder=(ViewHolder)convertView.getTag();
        }
        Partidos partidos=this.partidosList.get(i);
        String txtFechaPartido=partidos.getFecha_partido();
        holder.txtFechaPartido.setText(txtFechaPartido);
        holder.btnEquipo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context,EquiposActivity.class);
                context.startActivity(i);
            }
        });
        holder.btnEquipo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context,EquiposActivity.class);
                context.startActivity(i);
            }
        });
        holder.btnIrCanchaInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context,CanchaInfo.class);
                context.startActivity(i);
            }
        });

        return convertView;
    }

    public class ViewHolder{
        ImageButton btnEquipo1, btnEquipo2;
        Button btnIrCanchaInfo;
        TextView txtPuntosPartido, txtFechaPartido;

        public ViewHolder(@NonNull View v) {
            btnEquipo1=v.findViewById(R.id.btnEquipo1);
            btnEquipo2=v.findViewById(R.id.btnEquipo2);

            btnIrCanchaInfo=v.findViewById(R.id.btnIrCanchaInfo);

            txtPuntosPartido=v.findViewById(R.id.txtPuntosPartido);
            txtFechaPartido=v.findViewById(R.id.txtFechaPartido);
        }
    }
}
