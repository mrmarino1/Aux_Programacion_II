package agregacion5;
public class Perro extends Animal{
    private boolean requiereBosal;
    private boolean ladraFuerte;
    
    public Perro(String nombre, int edad, String nombreDuenio, boolean requiereBosal, boolean ladraFuerte) {
        super(nombre, edad, nombreDuenio);
        this.requiereBosal = requiereBosal;
        this.ladraFuerte = ladraFuerte;
    }
    
    @Override
    public String toString(){
        return "Perro[" + super.toString() + ", requiere bosal=" +
                (requiereBosal ? "si" : "no") + ", ladra fuerte=" +
                (ladraFuerte ? "si" : "no") +
                "]";
    }
}