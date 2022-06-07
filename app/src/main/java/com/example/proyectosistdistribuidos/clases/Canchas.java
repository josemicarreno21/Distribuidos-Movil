package com.example.proyectosistdistribuidos.clases;

public class Canchas {
    private String id_cancha;
    private String nombre_cancha;
    private String direccion_cancha;
    private String encargado;
    private String telefono_encargado;
    private String imagen_cancha;


    public Canchas(String id_cancha, String nombre_cancha, String direccion_cancha, String encargado, String telefono_encargado, String imagen_cancha) {
        this.id_cancha = id_cancha;
        this.nombre_cancha = nombre_cancha;
        this.direccion_cancha = direccion_cancha;
        this.encargado = encargado;
        this.telefono_encargado = telefono_encargado;
        this.imagen_cancha = imagen_cancha;
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

    public String getEncargado() {
        return encargado;
    }

    public String getTelefono_encargado() {
        return telefono_encargado;
    }

    public String getImagen_cancha() {
        return imagen_cancha;
    }
}
