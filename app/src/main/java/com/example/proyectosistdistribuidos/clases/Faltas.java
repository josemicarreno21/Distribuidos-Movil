package com.example.proyectosistdistribuidos.clases;

public class Faltas {
    private String id_falta;
    private String id_jugador;
    private String id_partido;
    private String descripcion_falta;

    public Faltas(String id_falta, String id_jugador, String id_partido, String descripcion_falta) {
        this.id_falta = id_falta;
        this.id_jugador = id_jugador;
        this.id_partido = id_partido;
        this.descripcion_falta = descripcion_falta;
    }

    public String getId_falta() {
        return id_falta;
    }

    public String getId_jugador() {
        return id_jugador;
    }

    public String getId_partido() {
        return id_partido;
    }

    public String getDescripcion_falta() {
        return descripcion_falta;
    }
}
