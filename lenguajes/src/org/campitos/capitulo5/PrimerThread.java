/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.campitos.capitulo5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author campitos
 */
public class PrimerThread implements Runnable{

    public static void main(String[] args) {
      //1. creado
        Runnable r=new PrimerThread();
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        t1.setName("primero");
        t2.setName("segundo");
        
       //2 inicializado
        t1.start();
        t2.start();
    }

    //3 En ejecucion
    public void run() {
        try {
            
    if(Thread.currentThread().getName().
    equals("primero")) Thread.sleep(4000);
    
    System.out.println(" soy el thread "+
    Thread.currentThread().getName());

        } catch (InterruptedException ex) {
          
        }
     
      
    }
    //5. termina su ejecucion
    
}
