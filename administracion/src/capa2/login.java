/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa2;

import capa3.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author tepet
 */
public class login {
    
    
    public int login(String User, String Pass){
        Integer resultado=0;
        try{
             Conexion con=new Conexion();
        Connection conn=con.Conexion();
            Statement ejecutor=conn.createStatement();
            ResultSet rs=ejecutor.executeQuery("select * from alumno where alumnonombre='"+User+"' and numerotel='"+Pass+"'");
            
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"bienvenido");
                   resultado=1;
                 }else{
                  JOptionPane.showMessageDialog(null,"error de usuario y o contraseña");
                  resultado =0;
            }
        }catch (Exception e){
              JOptionPane.showMessageDialog(null,"error al conectar");
              
            
    }
    return resultado;
}
    
    
        public int loginprof(String User, String Pass){
        Integer resultado=0;
        try{
             Conexion con=new Conexion();
        Connection conn=con.Conexion();
            Statement ejecutor=conn.createStatement();
            ResultSet rs=ejecutor.executeQuery("select * from profesor where profnombre='"+User+"' and idProfesor='"+Pass+"'");
            
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"bienvenido");
                   resultado=1;
                 }else{
                  JOptionPane.showMessageDialog(null,"error de usuario y o contraseña");
                  resultado =0;
            }
        }catch (Exception e){
              JOptionPane.showMessageDialog(null,"error al conectar");
              
            
    }
    return resultado;
}
  
    //tepetlalok
}