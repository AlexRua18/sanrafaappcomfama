package com.example.sanrafa.molde;

import java.io.Serializable;

public class Sitio implements Serializable {
    private String nombre;
    private String precio;

    private String nombreGuia;

    private String descripcion;
    private String telefono;
    private String direccion;

    private Integer calificacion;
    private Integer fotografia;
    private String tipo;

    public Sitio() {
    }

    public Sitio(String nombre, String precio, String nombreGuia, String descripcion, String telefono, String direccion, Integer calificacion, Integer fotografia, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.nombreGuia = nombreGuia;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.direccion = direccion;
        this.calificacion = calificacion;
        this.fotografia = fotografia;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getNombreGuia() {
        return nombreGuia;
    }

    public void setNombreGuia(String nombreGuia) {
        this.nombreGuia = nombreGuia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public Integer getFotografia() {
        return fotografia;
    }

    public void setFotografia(Integer fotografia) {
        this.fotografia = fotografia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
