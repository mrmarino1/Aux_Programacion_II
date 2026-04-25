package agregacion5;
import java.util.ArrayList;
public class CentroVeterinario {
    private String nombre;
    private int cantPerros;
    private ArrayList<Perro> perros;
    private int cantGatos;
    private ArrayList<Gato> gatos;
    
    CentroVeterinario(String nombre){
        this.nombre = nombre;
        cantPerros = 0;
        this.perros = new ArrayList<>(100);
        cantGatos = 0;
        this.gatos = new ArrayList<>(100);
    }
    
    public void addPerro(Perro p){
        this.perros.add(p);
        cantPerros++;
    }
    
    public void addGato(Gato g){
        this.gatos.add(g);
        cantGatos++;
    }
    
    @Override
    public String toString(){
        return "\tCentro Veterinario[nombre=" + nombre + 
               ", cantidad de perros=" + cantPerros + 
               ", cantidad de gatos=" + cantGatos + 
               ", \nperros=" + perros + 
               ", \ngatos=" + gatos + "]\n";
    }
    
    public void ordenarPerros() {
        for (int i = 0; i < perros.size() - 1; i++) {
            for (int j = 0; j < perros.size() - i - 1; j++) {
                Perro p1 = perros.get(j);
                Perro p2 = perros.get(j + 1);
                boolean cambiar = false;
                if (p1.edad > p2.edad) {
                    cambiar = true;
                } else if (p1.edad == p2.edad) {
                    if (p1.nombreDuenio.compareToIgnoreCase(p2.nombreDuenio) > 0) {
                        cambiar = true;
                    } else if (p1.nombreDuenio.equalsIgnoreCase(p2.nombreDuenio)) {
                        if (p1.getNombre().compareToIgnoreCase(p2.getNombre()) > 0) {
                            cambiar = true;
                        }
                    }
                }
                if (cambiar) {
                    perros.set(j, p2);
                    perros.set(j + 1, p1);
                }
            }
        }
    }
    
    public void ordenarGatos() {
        for (int i = 0; i < gatos.size() - 1; i++) {
            for (int j = 0; j < gatos.size() - i - 1; j++) {
                Gato g1 = gatos.get(j);
                Gato g2 = gatos.get(j + 1);
                boolean cambiar = false;
                if (!g1.isTomaLeche() && g2.isTomaLeche()) {
                    cambiar = true;
                } else if (g1.isTomaLeche() == g2.isTomaLeche()) {
                    if (g1.getEdad() < g2.getEdad()) {
                        cambiar = true;
                    } else if (g1.getEdad() == g2.getEdad()) {
                        if (g1.getNombre().compareToIgnoreCase(g2.getNombre()) > 0) {
                            cambiar = true;
                        }
                    }
                }
                if (cambiar) {
                    gatos.set(j, g2);
                    gatos.set(j + 1, g1);
                }
            }
        }
    }
    
    public void mostrarPerros() {
        for (Perro p : perros) {
            System.out.println(p);
        }
    }

    public void mostrarGatos() {
        for (Gato g : gatos) {
            System.out.println(g);
        }
    }
    
    public void verificarMismoDuenio() {
        ArrayList<String> revisados = new ArrayList<>();
        for (Perro p : perros) {
            String duenio = p.getNombreDuenio();
            if (!revisados.contains(duenio)) {
                int contador = 0;
                for (Perro p2 : perros) {
                    if (p2.getNombreDuenio().equalsIgnoreCase(duenio)) contador++;
                }
                for (Gato g : gatos) {
                    if (g.getNombreDuenio().equalsIgnoreCase(duenio)) contador++;
                }
                if (contador > 1) {
                    System.out.println("Dueño: " + duenio + 
                                       " tiene " + contador + " animales");
                }
                revisados.add(duenio);
            }
        }
    }
}
