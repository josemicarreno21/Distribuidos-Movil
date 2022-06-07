package com.example.proyectosistdistribuidos.clases;

public class Arbitro {
    private String id_arbitro;
    private String nombre_arbitro;
    private String apellidos_arbitro;
    private String id_partido;

    public Arbitro(String id_arbitro, String nombre_arbitro, String apellidos_arbitro, String id_partido) {
        this.id_arbitro = id_arbitro;
        this.nombre_arbitro = nombre_arbitro;
        this.apellidos_arbitro = apellidos_arbitro;
        this.id_partido = id_partido;
    }

    public String getId_arbitro() {
        return id_arbitro;
    }

    public String getNombre_arbitro() {
        return nombre_arbitro;
    }

    public String getApellidos_arbitro() {
        return apellidos_arbitro;
    }

    public String getId_partido() {
        return id_partido;
    }
}
