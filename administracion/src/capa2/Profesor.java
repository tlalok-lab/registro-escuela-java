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
public class Profesor extends Empleado    {

    public Profesor() {
    }
        

    public Profesor(String nombre) {
        super(nombre);
        
       // System.out.println("Constructor de Oficial");
    }
   
    @Override
    public String toString() {
      //  return super.toString() + " -> Oficial";
         return super.toString();
    
    }
    


}
