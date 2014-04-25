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
public class ValidaCuenta {
    
public static void validarSaldo(float s)
throws CuentaSinfondosException {
     if(s<0)throw new CuentaSinfondosException();
    }
    
}
