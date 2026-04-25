package agregacion5;
public class Gato extends Animal{
    private boolean cazaRatones;
    private boolean tomaLeche;
    
    public boolean isTomaLeche() {
        return tomaLeche;
    }
    
    public Gato(String nombre, int edad, String nombreDuenio, boolean cazaRatones, boolean tomaLeche) {
        super(nombre, edad, nombreDuenio);
        this.cazaRatones = cazaRatones;
        this.tomaLeche = tomaLeche;
    }
    
    @Override
    public String toString(){
        return "Gato[" + super.toString() + ", caza ratones=" +
                (cazaRatones ? "si" : "no") + ", toma leche=" +
                (tomaLeche ? "si" : "no") +
                "]";
    }
}
