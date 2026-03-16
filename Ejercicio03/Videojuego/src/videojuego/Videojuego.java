package videojuego;
public class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidad;
    
    public String getNombre() {
        return nombre;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public Videojuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidad = 0;
    }
    
    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidad = cantidadJugadores;
    }
    
    public void agregarJugadores() {
        this.cantidad++;
        System.out.println("Se agregó 1 jugador a " + this.nombre + ". Total: " + this.cantidad);
    }

    public void agregarJugadores(int nuevos) {
        this.cantidad += nuevos;
        System.out.println("Se agregaron " + nuevos + " jugadores a " + this.nombre + ". Total: " + this.cantidad);
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + ", plataforma: " + this.plataforma + ", cantidad: " + this.cantidad;
    }
}