/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.campitos.capitulo2;

public class ProbarCuentas {
   public static void main(String args[])throws CuentaSinfondosException{
    
       Cuenta []cuentas=new Cuenta[6];
      cuentas[0]=new CuentaAhorro();
      cuentas[1]=new CuentaCredito();
      cuentas[2]=new CuentaNomina();
      cuentas[3]=new CuentaAhorro();
      cuentas[4]=new CuentaNomina();
      cuentas[5]=new CuentaCredito();

      for(Cuenta c:cuentas){
          c.crearCuenta();
      }
      
       
       
       
  
   } 
    
}
