package com.example.proyectosistdistribuidos.clases;

public class Equipos {
    private String id_equipo;
    private String nombre_equipo;
    private String imagen_equipo;
    private String id_red_social;


    public Equipos(String id_equipo, String nombre_equipo, String imagen_equipo, String id_red_social) {
        this.id_equipo = id_equipo;
        this.nombre_equipo = nombre_equipo;
        this.imagen_equipo = imagen_equipo;
        this.id_red_social = id_red_social;
    }

    public String getId_equipo() {
        return id_equipo;
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public String getImagen_equipo() {
        return imagen_equipo;
    }

    public String getId_red_social() {
        return id_red_social;
    }
}
