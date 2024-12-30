  

package com.mycompany.basededatos;

import java.util.Scanner;

public class BaseDeDatos{
    
    private GestorTareas gestorTareas;
    private Scanner scanner;
    
    public BaseDeDatos(){
    this.gestorTareas = new GestorTareas();
    this.scanner = new Scanner(System.in);
    }
    int opcion=0;
    
    public void iniciar(){
        
    System.out.println("1.Agregar tarea");
    System.out.println("2.Eliminar tarea");
    System.out.println("3.Completar tarea");
    System.out.println("4.Salir");
    System.out.print("Ingrese una opción:");
    
    opcion = Integer.parseInt(scanner.nextLine());
    switch(opcion){
        case 1: 
            System.out.println("Ingrese el nombre de la tarea: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la descripción de la tarea: ");
            String descripcion = scanner.nextLine();
            gestorTareas.agregarTarea(new Tarea(nombre,descripcion,true));
            System.out.println("Tarea agregada con éxito");
            break;
        case 2:
            System.out.println("ingrese indice de la tarea a eliminar: ");
            int indice = Integer.parseInt(scanner.nextLine());
            gestorTareas.eliminarTarea(indice);
            System.out.println("Tarea eliminada con exito");
            break;
        case 3:
            System.out.println("Ingrese el índice de la tarea a completar: ");
            int indiceCompletar = Integer.parseInt(scanner.nextLine());
            gestorTareas.completarTarea(indiceCompletar);
            System.out.println("Tarea completada con éxito");
            break;
        case 4:
            System.out.println("Saliendo..");
            return;
        default:
            System.out.println("Opción inválida");
        }
        
    }
    
    public void mostrarNombres(){
    gestorTareas.mostrarNombre();
    }
    
    //public void nombres(){
    
    //    Scanner leer = new Scanner(System.in);
    //    System.out.println("elige un indice para mostrar un nombre");
    //int indice = leer.nextInt();
            
    //gestorTareas.mostrarNombre(indice);
        
    //}
    
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
                
        BaseDeDatos baseDeDatos = new BaseDeDatos();
                
        int opcion=0;
        
        do{

        baseDeDatos.iniciar();
        baseDeDatos.mostrarNombres();
        
        System.out.println("--------");
        
                    System.out.println("1_Salir");
            System.out.println("Cualquier otro numero para seguir");
            opcion=leer.nextInt();
        
        } while(opcion!=1);
        
    }
    
}