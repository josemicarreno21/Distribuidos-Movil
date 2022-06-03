package com.example.proyectosistdistribuidos.clases;

public class Equipos {
    private int id_equipos;
    private String nombre_equipo;
    private String nombre_entrenador;
    private String redSocial_equipo;
    private String imagen_equipo;
    private String lista_jugadores;

    public Equipos(int id_equipos, String nombre_equipo, String nombre_entrenador, String redSocial_equipo, String imagen_equipo, String lista_jugadores, int id_jugador) {
        this.id_equipos = id_equipos;
        this.nombre_equipo = nombre_equipo;
        this.nombre_entrenador = nombre_entrenador;
        this.redSocial_equipo = redSocial_equipo;
        this.imagen_equipo = imagen_equipo;
        this.lista_jugadores = lista_jugadores;
    }

    public int getId_equipos() {
        return id_equipos;
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public String getNombre_entrenador() {
        return nombre_entrenador;
    }

    public String getRedSocial_equipo() {
        return redSocial_equipo;
    }

    public String getImagen_equipo() {
        return imagen_equipo;
    }

    public String getLista_jugadores() {
        return lista_jugadores;
    }

}
