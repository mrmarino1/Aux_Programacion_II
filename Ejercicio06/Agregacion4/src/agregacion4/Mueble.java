package agregacion4;

public class Mueble {

    private String tipo, material;

    public String getTipo() {
        return tipo;
    }

    public String getMaterial() {
        return material;
    }

    public Mueble(String tipo, String material) {
        this.tipo = tipo;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Mueble{" + "tipo=" + tipo + ", material=" + material + '}';
    }
}
