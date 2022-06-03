package com.example.proyectosistdistribuidos;

public class Lista_Equipos {

    private String nombreEquipo;
    private String nombreEntrenador;
    private String puntosAnotados;
    private String puntosFavor;
    private String puntosContra;
    private String cesto1;
    private String cesto2;
    private String cesto3;

    public Lista_Equipos(String nombreEquipo, String nombreEntrenador, String puntosAnotados, String puntosFavor, String puntosContra, String cesto1, String cesto2, String cesto3) {
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

    public String getPuntosAnotados() {
        return puntosAnotados;
    }

    public void setPuntosAnotados(String puntosAnotados) {
        this.puntosAnotados = puntosAnotados;
    }

    public String getPuntosFavor() {
        return puntosFavor;
    }

    public void setPuntosFavor(String puntosFavor) {
        this.puntosFavor = puntosFavor;
    }

    public String getPuntosContra() {
        return puntosContra;
    }

    public void setPuntosContra(String puntosContra) {
        this.puntosContra = puntosContra;
    }

    public String getCesto1() {
        return cesto1;
    }

    public void setCesto1(String cesto1) {
        this.cesto1 = cesto1;
    }

    public String getCesto2() {
        return cesto2;
    }

    public void setCesto2(String cesto2) {
        this.cesto2 = cesto2;
    }

    public String getCesto3() {
        return cesto3;
    }

    public void setCesto3(String cesto3) {
        this.cesto3 = cesto3;
    }
}
