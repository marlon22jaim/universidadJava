package mundopc;

import mx.com.gm.mundopc.*;

/**
 *
 * @author Marlon
 */
public class MundoPc {

    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 22.1);
        Teclado tecladoHP = new Teclado("USB", "HP");
        Raton ratonHP = new Raton("USB", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);

        Monitor monitorGamer = new Monitor("Gamer", 27.1);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Logitech");
        Raton ratonGamer = new Raton("Bluetooth", "SteelSeries");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraHP);
        orden2.agregarComputadora(computadoraGamer);
        orden2.mostrarOrden();
    }

}
