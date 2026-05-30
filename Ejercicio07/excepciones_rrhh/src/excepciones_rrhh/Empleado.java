package excepciones_rrhh;

public class Empleado {

    private String nombre;
    private String cargo;
    private double sueldo;

    public Empleado(String nombre, String cargo, double sueldo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + ", Cargo: " + cargo
                + ", Sueldo: " + sueldo + " Bs";
    }
}
