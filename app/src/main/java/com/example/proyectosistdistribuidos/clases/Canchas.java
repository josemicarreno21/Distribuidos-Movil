package com.example.proyectosistdistribuidos.clases;

public class Canchas {
    private String id_cancha;
    private String nombre_cancha;
    private String direccion_cancha;
    private String encargado_cancha;
    private String telefono_encargado_cancha;
    private String imagen_cancha;
    private String id_equipos;

    public Canchas(String id_cancha, String nombre_cancha, String direccion_cancha, String encargado_cancha, String telefono_encargado_cancha, String imagen_cancha, String id_equipos) {
        this.id_cancha = id_cancha;
        this.nombre_cancha = nombre_cancha;
        this.direccion_cancha = direccion_cancha;
        this.encargado_cancha = encargado_cancha;
        this.telefono_encargado_cancha = telefono_encargado_cancha;
        this.imagen_cancha = imagen_cancha;
        this.id_equipos = id_equipos;
    }

    public String getId_cancha() {
        return id_cancha;
    }

    public String getNombre_cancha() {
        return nombre_cancha;
    }

    public String getDireccion_cancha() {
        return direccion_cancha;
    }

    public String getEncargado_cancha() {
        return encargado_cancha;
    }

    public String getTelefono_encargado_cancha() {
        return telefono_encargado_cancha;
    }

    public String getImagen_cancha() {
        return imagen_cancha;
    }

    public String getId_equipos() {
        return id_equipos;
    }
}
