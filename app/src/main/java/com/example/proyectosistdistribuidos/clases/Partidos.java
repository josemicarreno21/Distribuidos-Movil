package com.example.proyectosistdistribuidos.clases;

public class Partidos {
    private int id_partido;
    private String nombre_equipos_local;
    private String nombre_equipos_visitante;
    private String fecha_partido;
    private String hora_partido;
    private String lugar_partido;
    private String cambios_realizados_equipo_jugador;
    private String lista_arbitros_partido;
    private int id_cancha;
    private int id_equipos;

    public Partidos(int id_partido, String nombre_equipos_local, String nombre_equipos_visitante, String fecha_partido, String hora_partido, String lugar_partido, String cambios_realizados_equipo_jugador, String lista_arbitros_partido, int id_cancha, int id_equipos) {
        this.id_partido = id_partido;
        this.nombre_equipos_local = nombre_equipos_local;
        this.nombre_equipos_visitante = nombre_equipos_visitante;
        this.fecha_partido = fecha_partido;
        this.hora_partido = hora_partido;
        this.lugar_partido = lugar_partido;
        this.cambios_realizados_equipo_jugador = cambios_realizados_equipo_jugador;
        this.lista_arbitros_partido = lista_arbitros_partido;
        this.id_cancha = id_cancha;
        this.id_equipos = id_equipos;
    }

    public int getId_partido() {
        return id_partido;
    }

    public String getNombre_equipos_local() {
        return nombre_equipos_local;
    }

    public String getNombre_equipos_visitante() {
        return nombre_equipos_visitante;
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

    public String getCambios_realizados_equipo_jugador() {
        return cambios_realizados_equipo_jugador;
    }

    public String getLista_arbitros_partido() {
        return lista_arbitros_partido;
    }

    public int getId_cancha() {
        return id_cancha;
    }

    public int getId_equipos() {
        return id_equipos;
    }
}
