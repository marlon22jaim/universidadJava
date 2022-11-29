package domain;

/**
 *
 * @author Marlon
 */
public class Persona {

    private final int idPersona;
    private static int contadorPersonas;

    /**
     * Descripción: BLoque de inicialización estático (se ejecuta al iniciar el
     * programa antes del constructor) Se ejecuta la primera vez que se carga en
     * memoria esta clase
     */
    static {
        System.out.println("Ejecución Bloque estatico");
        ++Persona.contadorPersonas;
    }

    /**
     * Descripcion: Bloque de inicialización NO estatico (se ejecuta antes del
     * constructor) Se ejecuta cada vez que se crea un nuevo objeto
     */
    {
        System.out.println("Ejecución de bloque no estatico");
        this.idPersona = Persona.contadorPersonas++;
    }

    public Persona() {
        System.out.println("Ejecución del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
