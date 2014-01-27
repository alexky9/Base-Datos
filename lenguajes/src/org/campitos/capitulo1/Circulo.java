/* Lunes 27 de enero
 * En esta primer clase aprenderas lo siguiente
 1. Encapsulamiento
 2. Creacion de constructores
 */

package org.campitos.capitulo1;

/**
 *
 * @author campitos
 */
public class Circulo {
     private float radio;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        if(radio<0)radio=-radio;
        this.radio = radio;
    }
    
    
    
}
