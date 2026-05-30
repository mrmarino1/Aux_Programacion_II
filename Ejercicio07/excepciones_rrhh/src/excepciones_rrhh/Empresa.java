package excepciones_rrhh;

import java.util.Scanner;

public class Empresa {

    private String nombre;
    private Empleado[] empleados;

    public Empresa(String nombre, int cantidad) {
        this.nombre = nombre;
        empleados = new Empleado[cantidad];
    }

    public void registrarEmpleados() {

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < empleados.length; i++) {

            System.out.println("\nEMPLEADO " + (i + 1));

            System.out.print("Nombre: ");
            String nombreEmp = leer.nextLine();

            String cargo;

            while (true) {

                try {

                    System.out.print("Cargo: ");
                    cargo = leer.nextLine();

                    for (int j = 0; j < cargo.length(); j++) {

                        if (Character.isDigit(cargo.charAt(j))) {
                            throw new CargoInvalidoException();
                        }
                    }

                    break;

                } catch (CargoInvalidoException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Ingrese nuevamente el cargo.");
                }
            }

            double sueldo;

            try {

                System.out.print("Sueldo: ");
                sueldo = leer.nextDouble();
                leer.nextLine();

                if (sueldo < 2500) {
                    throw new SueldoInvalidoException();
                }

            } catch (SueldoInvalidoException e) {

                System.out.println(e.getMessage());
                System.out.println("Se asignará automáticamente 2500 Bs.");

                sueldo = 2500;
            }

            empleados[i] = new Empleado(nombreEmp, cargo, sueldo);
        }
    }

    public void mostrarEmpleados() {

        System.out.println("\n===== LISTA DE EMPLEADOS =====");

        for (int i = 0; i < empleados.length; i++) {
            System.out.println(empleados[i]);
        }
    }
}
