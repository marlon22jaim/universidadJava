package test;

import domain.Persona;

/**
 *
 * @author Marlon
 */
public class TestBloquesInicializacion {

    public static void main(String[] args) {
        /**
         * Descripción: primero se carga la Clase en memoria por eso se ejecuta
         * primero el bloque estatico Luego se ejecuta el bloque de codigo no
         * estatico Y por ultimo se ejecuta nuestro Constructor de la clase
         */
        Persona persona1 = new Persona();
        System.out.println("persona: " + persona1);

        System.out.println("\n");
        
        Persona persona2 = new Persona();
        System.out.println("persona: " + persona2);
    }
}
