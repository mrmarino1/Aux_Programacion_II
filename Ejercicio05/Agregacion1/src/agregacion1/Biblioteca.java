package agregacion1;
import java.util.ArrayList;
class Biblioteca {
    String nombre;
    int cantLibros;
    ArrayList<Libro> libros;
    
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        libros = new ArrayList<>(100);
        this.cantLibros = 0;
    }
    
    public void addLibro(Libro l) {
        libros.add(l);
        cantLibros++;
    }
    
    public void buscarLibro(String nombre) {
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getNombre().equals(nombre)) {
                encontrado = true;
                break;
            }
        }
        
        if (encontrado) {
            System.out.println("Libro encontrado");
        } else {
            System.out.println("Libro no encontrado");
        }
    }

    public void mostrar() {
        System.out.println("Biblioteca: " + nombre);
        System.out.println("Cantidad de libros: " + cantLibros);
    }
}