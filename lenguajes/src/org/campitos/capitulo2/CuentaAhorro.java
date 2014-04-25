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
public class CuentaAhorro extends Cuenta{

    public CuentaAhorro(String nombre, float saldo) throws CuentaSinfondosException {
        super(nombre, saldo);
    }

   
    public void crearCuenta() throws  CuentaSinfondosException{
   ValidaCuenta.validarSaldo(getSaldo());
        System.out.println("Estas creando una cuenta de ahorro");
    }
  
}
