package agregacion4;

import java.util.ArrayList;

public class Edificio {

    private String nombre;
    private double superficie;
    private int cantDep;
    private ArrayList<Departamento> deps;
    private Parqueo parqueo;

    public ArrayList<Departamento> getDeps() {
        return deps;
    }

    public Edificio(String nombre, double superficie, Parqueo P) {
        this.nombre = nombre;
        this.superficie = superficie;
        this.deps = new ArrayList<>(100);
        this.cantDep = this.deps.size();
        this.parqueo = P;
    }

    public void addDepartamento(int nroPuerta, int nroPiso) {
        Departamento d = new Departamento(nroPuerta, nroPiso);
        deps.add(d);
        this.cantDep = deps.size();
    }

    public void mostrarDepMasHabitaciones(int pisoY) {
        Departamento mayorDep = null;
        int maxHab = -1;

        // Recorremos la lista de departamentos del edificio
        for (Departamento d : deps) {
            // Filtramos por el piso solicitado (requiere getNroPiso)
            if (d.getNroPiso() == pisoY) {
                // Comparamos la cantidad de habitaciones (requiere getNroHab)
                if (d.getNroHab() > maxHab) {
                    maxHab = d.getNroHab();
                    mayorDep = d;
                }
            }
        }

        // Mostramos el resultado
        if (mayorDep != null) {
            System.out.println("El departamento con más habitaciones en el piso " + pisoY
                    + " es el de la puerta: " + mayorDep.getNroPuerta());
        } else {
            System.out.println("No se encontraron departamentos en el piso " + pisoY);
        }
    }

    public void agregarMuebleADepartamento(int pisoX, int puertaZ, String nombreHab, Mueble m) {
        boolean encontrado = false;
        for (Departamento d : deps) {
            if (d.getNroPiso() == pisoX && d.getNroPuerta() == puertaZ) {
                d.agregarMuebleAHabitacion(nombreHab, m);
                System.out.println("Mueble agregado con éxito.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el departamento en el piso " + pisoX + " con puerta " + puertaZ);
        }
    }

    public void mostrarDepsMasMuebles() {
        int maxMuebles = -1;
        for (Departamento d : deps) {
            if (d.totalMuebles() > maxMuebles) {
                maxMuebles = d.totalMuebles();
            }
        }
        System.out.println("Departamentos con más muebles (" + maxMuebles + "):");
        for (Departamento d : deps) {
            if (d.totalMuebles() == maxMuebles) {
                System.out.println("- Puerta: " + d.getNroPuerta() + " (Piso " + d.getNroPiso() + ")");
            }
        }
    }

    public void habMasMueblesEnPiso(int pisoZ) {
        String nombreHab = "";
        int maxMuebles = -1;

        for (Departamento d : deps) {
            if (d.getNroPiso() == pisoZ) {
                for (Habitacion h : d.getHab()) {
                    if (h.getCantMuebles() > maxMuebles) {
                        maxMuebles = h.getCantMuebles();
                        nombreHab = h.getNombre();
                    }
                }
            }
        }
        System.out.println("La habitación con más muebles del piso " + pisoZ + " es: " + nombreHab);
    }

    private boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void eliminarDepsHabPrimas() {
        deps.removeIf(d -> esPrimo(d.getNroHab()));
        this.cantDep = deps.size(); // Actualizamos el contador
        System.out.println("Eliminación completada.");
    }

    public Parqueo getParqueo() {
        return parqueo;
    }

    @Override
    public String toString() {
        return "Edificio{" + "nombre=" + nombre + ", superficie=" + superficie + ", cantDep=" + cantDep + ", deps=" + deps + ", parqueo=" + parqueo + '}';
    }
}
