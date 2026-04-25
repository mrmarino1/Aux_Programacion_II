package agregacion1;
public class main {
    public static void main(String[] args) {
        Libro l1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro l2 = new Libro("El Aleph", "Jorge Luis Borges", 1949);
        Libro l3 = new Libro("1984", "George Orwell", 1949);
        Libro l4 = new Libro("Rayuela", "Julio Cortázar", 1963);
        Libro l5 = new Libro("Metamorfosis", "Gabriel Garcia Marquez", 1999);
        
        
        Biblioteca b1 = new Biblioteca("Biblioteca Central");
        Biblioteca b2 = new Biblioteca("Biblioteca de Informatica");
        
        b1.addLibro(l1);
        b1.addLibro(l2);

        b2.addLibro(l3);
        b2.addLibro(l4);
        b2.addLibro(l5);

        System.out.println("--- Buscando libro '1984' ---");
        b1.buscarLibro("1984");
        b2.buscarLibro("1984");

        System.out.println("\n--- Biblioteca con más libros ---");
        if (b1.cantLibros > b2.cantLibros) {
            b1.mostrar();
        } else if (b2.cantLibros > b1.cantLibros) {
            b2.mostrar();
        } else {
            System.out.println("Empate en cantidad de libros:");
            b1.mostrar();
            b2.mostrar();
        }
    }
}