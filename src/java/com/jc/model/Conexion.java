/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.model;
import java.sql.*;

public class Conexion {
  public Connection  conectarse(){
      Connection con=null;
  String estatus="sin conexion";
      try{
          String cadena="jdbc:mysql://localhost:3306/proyecto";
          Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection(cadena, "root", " ");
          System.out.println("Se conecto a la perfeccion");
      }catch(Exception e){
          System.out.println(e.getMessage());
 estatus=e.getMessage();
         }
      estatus="conectado";
      return con;
      }
}
