package app3;
public class Persona {
    protected String nombre;
    protected int carnet;
    protected int edad;
    
    Persona(String nombre, int carnet, int edad){
        this.nombre = nombre;
        this.carnet = carnet;
        this.edad = edad;
    }
    public String toString(){
        return "nombre=" + this.nombre +", carnet=" + this.carnet + ", edad="+ this.edad;
    }
}
