package com.example.proyectosistdistribuidos.clases;

public class Entrenador {
    private String id_entrenador;
    private String nombre_entrenador;
    private String apellidos_entrenador;
    private String id_red_social;
    private String id_equipo;

    public Entrenador(String id_entrenador, String nombre_entrenador, String apellidos_entrenador, String id_red_social, String id_equipo) {
        this.id_entrenador = id_entrenador;
        this.nombre_entrenador = nombre_entrenador;
        this.apellidos_entrenador = apellidos_entrenador;
        this.id_red_social = id_red_social;
        this.id_equipo = id_equipo;
    }

    public String getId_entrenador() {
        return id_entrenador;
    }

    public String getNombre_entrenador() {
        return nombre_entrenador;
    }

    public String getApellidos_entrenador() {
        return apellidos_entrenador;
    }

    public String getId_red_social() {
        return id_red_social;
    }

    public String getId_equipo() {
        return id_equipo;
    }
}
