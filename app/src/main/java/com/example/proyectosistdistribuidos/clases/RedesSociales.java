package com.example.proyectosistdistribuidos.clases;

public class RedesSociales {
    private String id_red_social;
    private String nombre_red_social;
    private String perfil_red_social;

    public RedesSociales(String id_red_social, String nombre_red_social, String perfil_red_social) {
        this.id_red_social = id_red_social;
        this.nombre_red_social = nombre_red_social;
        this.perfil_red_social = perfil_red_social;
    }

    public String getId_red_social() {
        return id_red_social;
    }

    public String getNombre_red_social() {
        return nombre_red_social;
    }

    public String getPerfil_red_social() {
        return perfil_red_social;
    }
}
