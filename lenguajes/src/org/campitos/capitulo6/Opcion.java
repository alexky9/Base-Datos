/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.campitos.capitulo6;

/**
 *
 * @author campitos
 */
public class Opcion {
    private int id;
    private String titulo;
    private boolean valor;

    public Opcion(int id, String titulo, boolean valor) {
        this.id = id;
        this.titulo = titulo;
        this.valor = valor;
    }

    public boolean isValor() {
        return valor;
    }

    public void setValor(boolean valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
