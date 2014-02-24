/* Lunes 27 de enero
 * En esta primer clase aprenderas lo siguiente
 1. Encapsulamiento
   1. Todos los atributos debe ser asignados a modificador de acceso
     private
   2. A cada atributo para poder ser visto desde el exterior tendra que
      implementarse un metodo get (getters) y un metodo set(setters)
      Los get son para obtener el estado de dicho atributo en un momento dado
      Los set son para CAMBIAR  el valor o estado de ese atributo
      AMBOS DEBEN TENER MODIFICADOR public.

 */

package org.campitos.capitulo1;

/**
 *
 * @author campitos
 */
public class Circulo {
  
   private float radio;
   String nombre;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        if(radio<0)radio=-radio;
        
        this.radio = radio;
        
        
        
    }
    
    
}


















