package com.example.proyectosistdistribuidos.clases;

public class listaPartidos {
    private String imagen_equipo_l;
    private String imagen_equipo_v;
    private String puntos;
    private String fecha_partido;
    private String hora_partido;
    private String lugar_partidov;

    public listaPartidos(String imagen_equipo_l, String imagen_equipo_v, String puntos, String fecha_partido, String hora_partido, String lugar_partidov) {
        this.imagen_equipo_l = imagen_equipo_l;
        this.imagen_equipo_v = imagen_equipo_v;
        this.puntos = puntos;
        this.fecha_partido = fecha_partido;
        this.hora_partido = hora_partido;
        this.lugar_partidov = lugar_partidov;
    }

    public String getImagen_equipo_l() {
        return imagen_equipo_l;
    }

    public String getImagen_equipo_v() {
        return imagen_equipo_v;
    }

    public String getPuntos() {
        return puntos;
    }

    public String getFecha_partido() {
        return fecha_partido;
    }

    public String getHora_partido() {
        return hora_partido;
    }

    public String getLugar_partidov() {
        return lugar_partidov;
    }
}
