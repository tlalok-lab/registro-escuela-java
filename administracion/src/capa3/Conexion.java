/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
//import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tepet tepetlalok
 */
public class Conexion {
  
        Connection conect=null;
        public Connection Conexion(){
            try{
                Class.forName("org.gjt.mm.mysql.Driver");
            
            conect=DriverManager.getConnection("jdbc:mysql://localhost/proyecto11?user=root&Password=venado13");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "error "+e);
                
            }
            return conect;
        }
        
        public Connection conectado(){
      return conect;
}

    public void desconectar(){
      conect = null;
      System.out.println("La conexion a la  base de datos a terminado");

    } 

  /*  
    public DefaultTableModel retornarDatos(String sentenciaSQL)
    {
        DefaultTableModel modelo=new DefaultTableModel();
        {
            try{
                
                ResultSet rsfotos=consulta(sentenciaSQL);               
                ResultSetMetaData metadatos=rsfotos.getMetaData();
                int numeroColumnas=metadatos.getColumnCount();
                Object[]etiquetas=new Object [numeroColumnas];
                for(int i=0; i <numeroColumnas; i++){
                    etiquetas[i]=metadatos.getColumnLabel(i+1);
                }
              
                modelo.setColumnIdentifiers(etiquetas);
                while(rsfotos.next()){
                  Object[] datosfila=new Object[modelo.getColumnCount()];
                  for(int i=0; i<modelo.getColumnCount(); i+1){
                      datosFila[i]=rsfotos.getObject(i+1);
                  }
                  modelo.addRow(datosFila);
            }
                
            }catch(Exception e){
                System.out.print(e.getMessage());
            }
        }
    }*/
}
