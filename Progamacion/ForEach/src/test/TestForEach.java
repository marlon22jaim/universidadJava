package test;

import domain.Persona;

/**
 *
 * @author Marlon
 */
public class TestForEach {

    public static void main(String[] args) {

        int edades[] = {5, 6, 8, 9};

//        Asi era el for normal
//        for (int i = 0; i < edades.length; i++) {
//        }
//        ForEach nuevo
        for (int edad : edades) {
            System.out.println("Edad: " + edad);
        }
        Persona personas[] = {new Persona("Marlon"), new Persona("Yessica"), new Persona("Artico")};

        for (Persona persona : personas) {
            System.out.println("Persona: " + persona);
        }
    }
}
