package agregacion5;
public class Main {
    public static void main(String[] args) {
        CentroVeterinario c1 = new CentroVeterinario("CazaGrande");
        Perro p1 = new Perro("Asia", 3, "Adriana", false, true);
        Perro p2 = new Perro("Zadam", 3, "Moises", false, true);
        Gato g1 = new Gato("DonGato", 2, "Belen", true, true);
        Gato g2 = new Gato("Mostaza", 1, "Moises", true, false);
        c1.addPerro(p1);
        c1.addPerro(p2);
        c1.addGato(g1);
        c1.addGato(g2);
        System.out.println(c1);
        
        CentroVeterinario c2 = new CentroVeterinario("CanHijos");
        Perro p3 = new Perro("Finn", 2, "Pedro", false, false);
        Perro p4 = new Perro("Peggy", 3, "Juana", false, false);
        Gato g3 = new Gato("Norman", 3, "Belen", false, false);
        Gato g4 = new Gato("Huge", 1, "Federico", true, false);
        c2.addPerro(p3);
        c2.addPerro(p4);
        c2.addGato(g3);
        c2.addGato(g4);
        System.out.println(c2);
        
        c1.ordenarPerros();
        c2.ordenarPerros();
        System.out.println("========Perros ordenados c1:========");
        c1.mostrarPerros();
        System.out.println("========Perros ordenados c2:========");
        c2.mostrarPerros();
        
        c1.ordenarGatos();
        c2.ordenarGatos();
        System.out.println("\n========Gatos ordenados c1:========");
        c1.mostrarGatos();
        System.out.println("========Gatos ordenados c2:========");
        c2.mostrarGatos();
        
        
        System.out.println("\n========Verificando dueños========");
        c1.verificarMismoDuenio();
        c2.verificarMismoDuenio();
    }    
}