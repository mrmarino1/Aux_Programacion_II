package excepciones_rrhh;

public class SueldoInvalidoException extends Exception {

    public SueldoInvalidoException() {
        super("El sueldo no puede ser menor a 2500 Bs.");
    }
}
