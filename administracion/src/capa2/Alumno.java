/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa2;

/**
 *
 * @author tepet tepetlalok
 */
public class Alumno {
        int idalumno;
     String nombre;
     String direccion;
     String telefono;

    //constructor por defecto
public  Alumno() {
    }

    //constructor con un parámetro
    public Alumno(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion=direccion;
                this.telefono=telefono;
     //   System.out.println("Constructor de Empleado " + nombre);
    }

    public Alumno(int idalumno) {
        this.idalumno=idalumno;
         }
   
    //métodos get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //método toString()
    //devuelve un String formado por la palabra “Empleado” y el nombre de empleado
    @Override
    public String toString() {
        return "["+this.getIdalumno()+"] ["+this.getNombre()+"] ["+this.getDireccion()+"] ["+this.getTelefono()+"]";
    }
    
}
