
package com.mycompany.basededatos;

import java.util.ArrayList;
public class GestorTareas {
    private ArrayList<Tarea>tareas;
    private Tarea tarea;
    
    public void mostrarNombre(){
        System.out.println("--------");
        int cantidad=tareas.size();
    for(int i=0;i<cantidad;i++){
        System.out.println("----");
        System.out.println("id:" + i);
        System.out.println(tareas.get(i).getNombre());
        System.out.println("Completado:" + tareas.get(i).isCompletada());
        System.out.println("----");
        }
    }
    
    public GestorTareas(){
    this.tareas = new ArrayList<>();
    } 
    
    public void agregarTarea(Tarea tarea){
        tareas.add(tarea);
    }
    
    public void eliminarTarea(int indice){
    tareas.remove(indice);
    }
    
    public void completarTarea(int indice){
    tareas.get(indice).setCompletada(true);
    }
    
    public ArrayList<Tarea>getTareas(){
    return tareas;
    }
    
}
