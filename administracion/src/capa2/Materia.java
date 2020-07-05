/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa2;

/**
 *
 * @author tepet
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tepet
 */


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tepetlalok
 */
public class Materia {
    String nombre;
    int idmateria;

    //constructor por defecto
public  Materia() {
    }

    //constructor con un parámetro
    public Materia(int idmateria, String nombre ) {
        this.nombre = nombre;
        this.idmateria=idmateria;
        
     //   System.out.println("Constructor de Empleado " + nombre);
    }

    public Materia(int idmateria) {
        this.idmateria=idmateria;
    }

    /*public Materia(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   */
    //métodos get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(int idmateria) {
        this.idmateria = idmateria;
    }

    
    //método toString()
    //devuelve un String formado por la palabra “Empleado” y el nombre de empleado
    @Override
    public String toString() {
        return  "["+this.getIdmateria()+"] ["+this.getNombre()+"]";
    }
}