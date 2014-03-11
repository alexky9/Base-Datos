/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.campitos.capitulo2;

/**
 *
 * @author campitos
 */
public class CuentaNomina extends Cuenta{

    public CuentaNomina(String nombre, float saldo) throws CuentaSinfondosException {
        super(nombre, saldo);
    }
    
    public void crearCuenta(){
   System.out.println("Esta ya es una cuenta de nimina");
    } 
    
}
