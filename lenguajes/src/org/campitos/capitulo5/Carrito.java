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
public class Carrito extends Sprite{

    public Carrito(int posx, int posy) {
        super(posx, posy);
    }
    
   
    public void run(){
        while(true){
            try {
                Thread.sleep(2000);
                ajustarPosicion();
                 System.out.println(Thread.currentThread().getName()+"posicion:"+this);
                 
            } catch (InterruptedException ex) {
                Logger.getLogger(Carrito.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }
    
}
