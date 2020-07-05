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
public class salon{
    public int idalumno;
    public int idmateria;

    public salon()
    {
        
    }
    public salon(int idalumno, int idmateria) {
        this.idalumno = idalumno;
        this.idmateria = idmateria;
    }
    

    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }

    public int getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(int idmateria) {
        this.idmateria = idmateria;
    }
      @Override
    public String toString() {
        return "["+this.getIdalumno()+"] ["+this.getIdmateria()+"]";
    }

    
}
