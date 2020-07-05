/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa2;

/**
 *
 * @author A
 */
public class Administrador extends Empleado {
    //Clase Empleado. Clase Base de la jerarquía

    
  

    //constructor por defecto
    public Administrador() {
    }

    //constructor con un parámetro
    public Administrador(String nombre) {
         super(nombre);
        
        //System.out.println("Constructor de Empleado " + nombre);
    }


   
    //métodos get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    //método toString()
    //devuelve un String formado por la palabra “Empleado” y el nombre de empleado
    @Override
    public String toString() {
              return  nombre;
        
    }
}

