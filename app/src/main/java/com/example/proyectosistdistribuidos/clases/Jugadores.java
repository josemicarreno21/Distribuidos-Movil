package com.example.proyectosistdistribuidos.clases;

public class Jugadores {
    private String id_jugador;
    private String nombre_jugador;
    private String apellidos_jugador;
    private String fecha_nacimiento;
    private String imagen_jugador;
    private String posicion;
    private String altura;
    private String id_red_social;
    private String id_equipo;


    public Jugadores(String id_jugador, String nombre_jugador, String apellidos_jugador, String fecha_nacimiento, String imagen_jugador, String posicion, String altura, String id_red_social, String id_equipo) {
        this.id_jugador = id_jugador;
        this.nombre_jugador = nombre_jugador;
        this.apellidos_jugador = apellidos_jugador;
        this.fecha_nacimiento = fecha_nacimiento;
        this.imagen_jugador = imagen_jugador;
        this.posicion = posicion;
        this.altura = altura;
        this.id_red_social = id_red_social;
        this.id_equipo = id_equipo;
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

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getImagen_jugador() {
        return imagen_jugador;
    }

    public String getPosicion() {
        return posicion;
    }

    public String getAltura() {
        return altura;
    }

    public String getId_red_social() {
        return id_red_social;
    }

    public String getId_equipo() {
        return id_equipo;
    }
}
