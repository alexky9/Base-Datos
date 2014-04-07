/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.campitos.capitulo6;


public class TestCuestionario {

    public static void main(String[] args) {
      for(Pregunta p:GenerarCuestionario.obtenerCuestionario()){
          System.out.println(p.getTitulo());
          for(Opcion o:p.getOpciones()){
          System.out.println(o.getTitulo()+" " +o.isValor());
                  }
      }
    }
    
}
