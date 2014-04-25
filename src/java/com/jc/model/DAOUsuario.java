/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.model;

import java.sql.*;
public class DAOUsuario {
    
    public Usuario buscarUsuario(Usuario u){
        Conexion conectarse=new Conexion();
       try{
  Connection con=conectarse.conectarse();
Statement st=con.createStatement();
ResultSet res=st.executeQuery("select * from usuario");
while(res.next()){
    if(u.getEmail().equals(res.getString(2))&u.getPassword().equals(res.getString(3))){
  u.setId( res.getInt(1));
  break;
    }else{
        u.setId(0);
       
    }
}
       }catch(Exception e){
           u.setEmail(e.getMessage());
       }
       return u;
    }
    
 
    
    

//  Metodo Buscar     
    
    public int autenticar(Usuario u){
        int autenticacion=0;
        Conexion conectarse=new Conexion();
       try{
  Connection con= conectarse.conectarse();
Statement st=con.createStatement();
ResultSet res=st.executeQuery("select * from usuario");
while(res.next()){
    if(u.getEmail().equals(res.getString(2))&u.getPassword().equals(res.getString(3))){
  u.setId( res.getInt(1));
  autenticacion=1;
  
  break;
  
  
    }else{
        u.setId(0);
       
    }
}
       }catch(Exception e){
           u.setEmail(e.getMessage());
       }
       return autenticacion;
    }
    
}


//  hacer un metodo por cada accion 