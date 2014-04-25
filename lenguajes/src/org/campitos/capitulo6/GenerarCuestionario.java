

package org.campitos.capitulo6;

import java.util.ArrayList;


public class GenerarCuestionario {
    
    public static ArrayList<Pregunta> obtenerCuestionario(){
       
        ArrayList<Pregunta> cuestionario=new ArrayList<Pregunta>();
        ArrayList<Opcion> opciones1=new ArrayList<Opcion>();
        Opcion op11=new Opcion(1,"El Salvador", false);
         Opcion op21=new Opcion(2,"Peru", false);
          Opcion op31=new Opcion(3,"Mexico", false);
         Opcion op41=new Opcion(4,"Finlandia", true);
         
         opciones1.add(op11);
         opciones1.add(op21);
         opciones1.add(op31);
         opciones1.add(op41);
    Pregunta p1=new Pregunta(1,"Cual es el pais mejor escuelas",opciones1);
               cuestionario.add(p1);
        return cuestionario;
    }
}
