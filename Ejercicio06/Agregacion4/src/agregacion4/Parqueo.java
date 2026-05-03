package agregacion4;

public class Parqueo {

    private int capacidad, cantAuto;
    private double precioH;
    private String[] parqueo;

    public int getCapacidad() {
        return capacidad;
    }

    public int getCantAuto() {
        return cantAuto;
    }

    public Parqueo(int capacidad, double precioH) {
        this.capacidad = capacidad;
        this.precioH = precioH;
        parqueo = new String[capacidad]; //Placas
        this.cantAuto = 0;
    }

    public void agregarAuto(String placa) {
        if (this.cantAuto < this.capacidad) {
            parqueo[cantAuto] = placa;
            this.cantAuto++;
            System.out.println("Auto con placa " + placa + " registrado.");
        } else {
            System.out.println("ERROR: No hay capacidad disponible en el parqueo.");
        }
    }

    @Override
    public String toString() {
        return "Parqueo{" + "capacidad=" + capacidad + ", cantAuto=" + cantAuto + ", precioH=" + precioH + '}';
    }
}
