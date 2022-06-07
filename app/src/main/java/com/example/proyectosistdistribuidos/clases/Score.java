package com.example.proyectosistdistribuidos.clases;

public class Score {
    private String id_score;
    private String id_equipo;
    private String puntos;
    private String cesto_1_punto;
    private String cesto_2_puntos;
    private String cesto_3_puntos;

    public Score(String id_score, String id_equipo, String puntos, String cesto_1_punto, String cesto_2_puntos, String cesto_3_puntos) {
        this.id_score = id_score;
        this.id_equipo = id_equipo;
        this.puntos = puntos;
        this.cesto_1_punto = cesto_1_punto;
        this.cesto_2_puntos = cesto_2_puntos;
        this.cesto_3_puntos = cesto_3_puntos;
    }

    public String getId_score() {
        return id_score;
    }

    public String getId_equipo() {
        return id_equipo;
    }

    public String getPuntos() {
        return puntos;
    }

    public String getCesto_1_punto() {
        return cesto_1_punto;
    }

    public String getCesto_2_puntos() {
        return cesto_2_puntos;
    }

    public String getCesto_3_puntos() {
        return cesto_3_puntos;
    }
}
