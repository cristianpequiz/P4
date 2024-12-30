
package com.mycompany.basededatos;


public class Tarea {
    
    private String nombre;
    private String descripcion;
    private boolean completada;

    public Tarea(String nombre, String descripcion, boolean completada) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.completada = false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
    
}
