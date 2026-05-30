package excepciones_rrhh;

public class CargoInvalidoException extends Exception {

    public CargoInvalidoException() {
        super("El cargo no debe contener números.");
    }
}
