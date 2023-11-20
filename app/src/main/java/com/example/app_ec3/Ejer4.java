package com.example.app_ec3;

public class Ejer4 {

    private int id;
    private int imagen;
    private String nombre;
    private String direccion;
    private String estado;


    public Ejer4(int id, int imagen, String nombre, String direccion, String estado) {
        this.id = id;
        this.imagen = imagen;
        this.nombre = nombre;
        this.direccion = direccion;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
