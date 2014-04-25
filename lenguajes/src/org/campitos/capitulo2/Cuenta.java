/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.campitos.capitulo2;

public abstract class Cuenta {

    public Cuenta(String nombre, float saldo) throws CuentaSinfondosException {
        ValidaCuenta.validarSaldo(saldo);
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
 
    private String nombre;
    private float saldo;
    
    public abstract void crearCuenta()
            throws CuentaSinfondosException;
    
    
    
    
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
}
