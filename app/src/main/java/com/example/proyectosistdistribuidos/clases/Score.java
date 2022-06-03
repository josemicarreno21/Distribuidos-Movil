package com.example.proyectosistdistribuidos.clases;

public class Score {
    private String id_score;
    private String puntos_Afavor;
    private String puntos_Encontra;
    private String faltas_personales_jugador;
    private String faltas_tecnicaCouch;
    private String cesto_de_1punto;
    private String cesto_de_2puntos;
    private String cesto_de_3puntos;
    private String id_equipos;
    private String id_partido;
    private String id_jugador;

    public Score(String id_score, String puntos_Afavor, String puntos_Encontra, String faltas_personales_jugador, String faltas_tecnicaCouch, String cesto_de_1punto, String cesto_de_2puntos, String cesto_de_3puntos, String id_equipos, String id_partido, String id_jugador) {
        this.id_score = id_score;
        this.puntos_Afavor = puntos_Afavor;
        this.puntos_Encontra = puntos_Encontra;
        this.faltas_personales_jugador = faltas_personales_jugador;
        this.faltas_tecnicaCouch = faltas_tecnicaCouch;
        this.cesto_de_1punto = cesto_de_1punto;
        this.cesto_de_2puntos = cesto_de_2puntos;
        this.cesto_de_3puntos = cesto_de_3puntos;
        this.id_equipos = id_equipos;
        this.id_partido = id_partido;
        this.id_jugador = id_jugador;
    }

    public String getId_score() {
        return id_score;
    }

    public String getPuntos_Afavor() {
        return puntos_Afavor;
    }

    public String getPuntos_Encontra() {
        return puntos_Encontra;
    }

    public String getFaltas_personales_jugador() {
        return faltas_personales_jugador;
    }

    public String getFaltas_tecnicaCouch() {
        return faltas_tecnicaCouch;
    }

    public String getCesto_de_1punto() {
        return cesto_de_1punto;
    }

    public String getCesto_de_2puntos() {
        return cesto_de_2puntos;
    }

    public String getCesto_de_3puntos() {
        return cesto_de_3puntos;
    }

    public String getId_equipos() {
        return id_equipos;
    }

    public String getId_partido() {
        return id_partido;
    }

    public String getId_jugador() {
        return id_jugador;
    }
}
