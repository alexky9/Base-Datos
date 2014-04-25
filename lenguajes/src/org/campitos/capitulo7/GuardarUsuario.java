package org.campitos.capitulo7;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.io.File;
import java.util.ArrayList;
public class GuardarUsuario {
    
    public synchronized static ArrayList<Usuario> leer()throws Exception{
   File file=new File("archivaldo.xxxx");    
 
    FileInputStream fis=new FileInputStream(file);
    ObjectInputStream  ois=new ObjectInputStream(fis);
  ArrayList<Usuario> u=(ArrayList<Usuario>)  ois.readObject();
  ois.close();
  return u;
  }
    
    public static void guardar(Usuario u)throws Exception{
        ArrayList usuarios=new ArrayList<Usuario>();
        
       File file=new File("archivaldo.xxxx");    
         if(file.exists()){
           usuarios=  leer();
         }
    FileOutputStream fis=new FileOutputStream(file);
    ObjectOutputStream  ois=new ObjectOutputStream(fis);
    usuarios.add(u);
     ois.writeObject(usuarios); 
    ois.close();
  System.out.println("Guardado");
    }
    
}
