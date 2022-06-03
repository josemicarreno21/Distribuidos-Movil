package com.example.proyectosistdistribuidos.clases;

public class Jugadores {
    private String id_jugador;
    private String nombre_jugador;
    private String apellidos_jugador;
    private String fechaNac_jugador;
    private String imagen_jugador;
    private String posicion_jugador;
    private String altura_jugador;
    private String id_equipos;

    public Jugadores(String id_jugador, String nombre_jugador, String apellidos_jugador, String fechaNac_jugador, String imagen_jugador, String posicion_jugador, String altura_jugador, String id_equipos) {
        this.id_jugador = id_jugador;
        this.nombre_jugador = nombre_jugador;
        this.apellidos_jugador = apellidos_jugador;
        this.fechaNac_jugador = fechaNac_jugador;
        this.imagen_jugador = imagen_jugador;
        this.posicion_jugador = posicion_jugador;
        this.altura_jugador = altura_jugador;
        this.id_equipos=id_equipos;
    }

    public String getId_jugador() {
        return id_jugador;
    }

    public String getNombre_jugador() {
        return nombre_jugador;
    }

    public String getApellidos_jugador() {
        return apellidos_jugador;
    }

    public String getFechaNac_jugador() {
        return fechaNac_jugador;
    }

    public String getImagen_jugador() {
        return imagen_jugador;
    }

    public String getPosicion_jugador() {
        return posicion_jugador;
    }

    public String getAltura_jugador() {
        return altura_jugador;
    }

    public String getId_equipos() {
        return id_equipos;
    }
}
