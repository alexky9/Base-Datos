/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.campitos.capitulo5;

import java.util.Random;

/**
 *
 * @author campitos
 */
public class Sprite extends Thread {
    private int posx;
    private int posy;

    public Sprite(int posx, int posy) {
        this.posx = posx;
        this.posy = posy;
    }
    
    public void ajustarPosicion(){
        int valorx=new Random().nextInt(2);
         int valory=new Random().nextInt(2);
        Random rx=new Random();
         Random ry=new Random();
        if(valorx==0){
       posx+=rx.nextInt(2);
        }else{
            posx-=rx.nextInt(2);
        }
        if(valory==0){
      
       posy+=ry.nextInt(2);
        }else{
            posy-=ry.nextInt(2);
        }
        
    }

    @Override
    public String toString() {
        return "Sprite{" + "posx=" + posx + ", posy=" + posy + '}';
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }
    
    
    
    
}
