package agregacion4;

import java.util.ArrayList;

public class Departamento {

    private int nroPuerta, nroHab, nroPiso;
    private ArrayList<Habitacion> hab;

    public Departamento(int nroPuerta, int nroPiso) {
        this.nroPuerta = nroPuerta;
        this.nroPiso = nroPiso;
        hab = new ArrayList<>(100);
        nroHab = hab.size();
    }

    public int getNroPuerta() {
        return nroPuerta;
    }

    public int getNroHab() {
        return nroHab;
    }

    public int getNroPiso() {
        return nroPiso;
    }

    public ArrayList<Habitacion> getHab() {
        return hab;
    }

    public void addHabitacion(String nombre, double tamanio) {
        Habitacion h = new Habitacion(nombre, tamanio);
        hab.add(h);
        this.nroHab = hab.size();
    }

    public void agregarMuebleAHabitacion(String nombreHab, Mueble nuevoMueble) {
        for (Habitacion h : hab) {
            if (h.getNombre().equalsIgnoreCase(nombreHab)) {
                h.addMueble(nuevoMueble);
                return;
            }
        }
        System.out.println("Habitación '" + nombreHab + "' no encontrada en este departamento.");
    }

    public int totalMuebles() {
        int total = 0;
        for (Habitacion h : hab) {
            total += h.getCantMuebles();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Departamento{" + "nroPuerta=" + nroPuerta + ", nroHab=" + nroHab + ", nroPiso=" + nroPiso + ", hab=" + hab + '}';
    }
}
