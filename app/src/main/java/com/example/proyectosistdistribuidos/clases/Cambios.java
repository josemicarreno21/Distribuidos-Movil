package com.example.proyectosistdistribuidos.clases;

public class Cambios {
    private String id_cambio;
    private String id_jugador;
    private String id_partido;
    private String cambio;

    public Cambios(String id_cambio, String id_jugador, String id_partido, String cambio) {
        this.id_cambio = id_cambio;
        this.id_jugador = id_jugador;
        this.id_partido = id_partido;
        this.cambio = cambio;
    }

    public String getId_cambio() {
        return id_cambio;
    }

    public String getId_jugador() {
        return id_jugador;
    }

    public String getId_partido() {
        return id_partido;
    }

    public String getCambio() {
        return cambio;
    }
}
