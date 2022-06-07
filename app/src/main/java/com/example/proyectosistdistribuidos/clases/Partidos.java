package com.example.proyectosistdistribuidos.clases;

public class Partidos {
    private String id_partido;
    private String id_equipo_l;
    private String id_equipo_v;
    private String fecha_partido;
    private String hora_partido;
    private String lugar_partido;
    private String id_cancha;
    private String id_score;


    public Partidos(String id_partido, String id_equipo_l, String id_equipo_v, String fecha_partido, String hora_partido, String lugar_partido, String id_cancha, String id_score) {
        this.id_partido = id_partido;
        this.id_equipo_l = id_equipo_l;
        this.id_equipo_v = id_equipo_v;
        this.fecha_partido = fecha_partido;
        this.hora_partido = hora_partido;
        this.lugar_partido = lugar_partido;
        this.id_cancha = id_cancha;
        this.id_score = id_score;
    }

    public String getId_partido() {
        return id_partido;
    }

    public String getId_equipo_l() {
        return id_equipo_l;
    }

    public String getId_equipo_v() {
        return id_equipo_v;
    }

    public String getFecha_partido() {
        return fecha_partido;
    }

    public String getHora_partido() {
        return hora_partido;
    }

    public String getLugar_partido() {
        return lugar_partido;
    }

    public String getId_cancha() {
        return id_cancha;
    }

    public String getId_score() {
        return id_score;
    }
}
