package agregacion4;

public class main {

    public static void main(String[] args) {
        // --- INCISO A: Instanciar Edificio y adicionar un Parqueo ---
        System.out.println("\nEjecutando Inciso A");

        Parqueo miParqueo = new Parqueo(10, 15.0);
        Edificio miEdificio = new Edificio("Torre Cristal", 3000.5, miParqueo);
        System.out.println("--- Edificio y Parqueo creados con éxito ---");

        // Preparación de datos (Agregando departamentos y habitaciones)
        miEdificio.addDepartamento(201, 2);
        Departamento dep201 = miEdificio.getDeps().get(0);
        dep201.addHabitacion("Dormitorio", 12.5);
        dep201.addHabitacion("Cocina", 8.0);

        miEdificio.addDepartamento(202, 2);
        Departamento dep202 = miEdificio.getDeps().get(1);
        dep202.addHabitacion("Dormitorio 1", 10.0);
        dep202.addHabitacion("Dormitorio 2", 10.0);
        dep202.addHabitacion("Sala", 15.0);

        miEdificio.addDepartamento(301, 3);
        Departamento dep301 = miEdificio.getDeps().get(2);
        dep301.addHabitacion("Suite", 20.0);
        dep301.addHabitacion("Baño", 5.0);
        dep301.addHabitacion("Cocina", 7.0);
        dep301.addHabitacion("Balcon", 4.0);

        // --- INCISO B: Mostrar depto con más habitaciones del piso Y (Piso 2) ---
        System.out.println("\nEjecutando Inciso B (Piso 2):");
        miEdificio.mostrarDepMasHabitaciones(2);

        // --- INCISO C: Agregar un Mueble al Departamento con puerta Z del piso X ---
        System.out.println("\nEjecutando Inciso C:");
        Mueble miSofa = new Mueble("Sofa", "Cuero");
        miEdificio.agregarMuebleADepartamento(2, 202, "Sala", miSofa);

        // --- INCISO G: Agregar un auto al parqueo si hay capacidad ---
        System.out.println("\nEjecutando Inciso G:");
        miEdificio.getParqueo().agregarAuto("ABC-123");

        // --- INCISO D: Mostrar departamento(s) con más muebles ---
        System.out.println("\nEjecutando Inciso D:");
        miEdificio.mostrarDepsMasMuebles();

        // --- INCISO E: Mostrar nombre de habitación con más muebles del piso Z (Piso 2) ---
        System.out.println("\nEjecutando Inciso E (Piso 2):");
        miEdificio.habMasMueblesEnPiso(2);

        // --- INCISO F: Eliminar departamentos con cantidad prima de habitaciones ---
        System.out.println("\nEjecutando Inciso F (Eliminar habs primas):");
        miEdificio.eliminarDepsHabPrimas();

        // Verificación del estado final
        System.out.println("\nEstado final del Edificio:");
        System.out.println(miEdificio);
    }
}
