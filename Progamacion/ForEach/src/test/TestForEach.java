package test;

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
//        ForEach
        for (int edad : edades) {
            System.out.println("Edad: " + edad);
        }

    }
}
