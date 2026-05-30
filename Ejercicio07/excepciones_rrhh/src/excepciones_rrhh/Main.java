package excepciones_rrhh;

public class Main {

    public static void main(String[] args) {

        Empresa empresa = new Empresa("Mi Empresa", 3);

        empresa.registrarEmpleados();

        empresa.mostrarEmpleados();
    }
}
