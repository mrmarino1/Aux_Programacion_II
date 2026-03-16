package videojuego;
public class TestVideojuego {
    public static void main(String[] args) {
        Videojuego juego1 = new Videojuego("Zelda", "Switch");
        Videojuego juego2 = new Videojuego("Halo", "Xbox", 4);
        
        System.out.println("Videojuego 1: "+juego1);
        System.out.println("Videojuego 2: "+juego2);
        juego1.agregarJugadores();
        
        System.out.println("Videojuego 1: "+juego1);
        System.out.println("Videojuego 2: "+juego2);  
        
        int nuevosJugadores = 7;
        juego2.agregarJugadores(nuevosJugadores);
        System.out.println("Videojuego 2: "+juego2);
    }    
}
