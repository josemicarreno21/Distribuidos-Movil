package com.example.proyectosistdistribuidos;

public class Lista_Equipos {
    private String nombreEquipo;

    private String nombreEntrenador;
    private int puntosAnotados;
    private int puntosFavor;
    private int puntosContra;
    private int cesto1;
    private int cesto2;
    private int cesto3;

    public Lista_Equipos(String nombreEquipo, String nombreEntrenador, int puntosAnotados, int puntosFavor, int puntosContra, int cesto1, int cesto2, int cesto3) {
        this.nombreEquipo = nombreEquipo;
        this.nombreEntrenador = nombreEntrenador;
        this.puntosAnotados = puntosAnotados;
        this.puntosFavor = puntosFavor;
        this.puntosContra = puntosContra;
        this.cesto1 = cesto1;
        this.cesto2 = cesto2;
        this.cesto3 = cesto3;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public int getPuntosAnotados() {
        return puntosAnotados;
    }

    public void setPuntosAnotados(int puntosAnotados) {
        this.puntosAnotados = puntosAnotados;
    }

    public int getPuntosFavor() {
        return puntosFavor;
    }

    public void setPuntosFavor(int puntosFavor) {
        this.puntosFavor = puntosFavor;
    }

    public int getPuntosContra() {
        return puntosContra;
    }

    public void setPuntosContra(int puntosContra) {
        this.puntosContra = puntosContra;
    }

    public int getCesto1() {
        return cesto1;
    }

    public void setCesto1(int cesto1) {
        this.cesto1 = cesto1;
    }

    public int getCesto2() {
        return cesto2;
    }

    public void setCesto2(int cesto2) {
        this.cesto2 = cesto2;
    }

    public int getCesto3() {
        return cesto3;
    }

    public void setCesto3(int cesto3) {
        this.cesto3 = cesto3;
    }
}
