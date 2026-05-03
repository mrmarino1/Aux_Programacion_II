package agregacion4;

import java.util.ArrayList;

public class Habitacion {

    private String nombre;
    private double tamanio;
    private int cantMuebles;

    public String getNombre() {
        return nombre;
    }

    public int getCantMuebles() {
        return cantMuebles;
    }
    private ArrayList<Mueble> muebles;

    public Habitacion(String nombre, double tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        muebles = new ArrayList<>(100);
        cantMuebles = muebles.size();
    }

    public void addMueble(Mueble m) {
        this.muebles.add(m);
        this.cantMuebles = muebles.size();
    }

    @Override
    public String toString() {
        return "Habitacion{" + "nombre=" + nombre + ", tamanio=" + tamanio + ", cantMuebles=" + cantMuebles + ", muebles=" + muebles + '}';
    }

}
