package org.campitos.capitulo7;

import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
public class GuardarUsuario {
    
    public synchronized static Usuario leer()throws Exception{
   File file=new File("archivaldo.xxx");    
   
    FileInputStream fis=new FileInputStream(file);
    ObjectInputStream  ois=new ObjectInputStream(fis);
  Usuario u=(Usuario)  ois.readObject();
  ois.close();
  return u;
  }
    
    public static void guardar(Usuario u)throws Exception{
       File file=new File("archivaldo.xxx");    
   
    FileOutputStream fis=new FileOutputStream(file);
    ObjectOutputStream  ois=new ObjectOutputStream(fis);
  ois.writeObject(u); 
 ois.close();
  System.out.println("Guardado");
    }
    
}
