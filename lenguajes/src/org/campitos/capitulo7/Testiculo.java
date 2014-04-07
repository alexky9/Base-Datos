/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.campitos.capitulo7;

/**
 * https://github.com/daton/lenguajes.git
 *
 * @author campitos
 */
public class Testiculo {

    public static void main(String[] args) throws Exception {
        Usuario u = new Usuario("raton vaquero", 6, "rata@gmail.com");
      GuardarUsuario.guardar(u);

        for (Usuario usu : GuardarUsuario.leer()) {
            System.out.println(usu);
        }
    }

}
