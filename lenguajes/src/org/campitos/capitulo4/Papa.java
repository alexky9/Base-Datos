/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.campitos.capitulo4;

/**
 *
 * @author campitos
 */
public class Papa {
    public Papa(String mensaje){
        System.out.println("Constructor con agrumento y es:"+mensaje);
    }
    
    Papa(){
        this("invocando a la version del argumento String");
    }
}
