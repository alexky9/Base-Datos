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
public class MuchosThreads implements Runnable {

  
    public static void main(String[] args) {
      
        Runnable r=new MuchosThreads();
        Thread ts[]=new  Thread[20];
        for(Thread t:ts){
            t=new Thread(r);
            t.start();
        }
        
        
    }

  
    @Override
    public void run() {
        try {
            System.out.println("holasoy el thread:"+Thread.currentThread().getName());
            Thread.sleep(40);
        } catch (InterruptedException ex) {
            Logger.getLogger(MuchosThreads.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
