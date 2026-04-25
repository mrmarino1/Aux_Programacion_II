package agregacion5;
public class Animal {
    protected String nombre;
    protected int edad;
    protected String nombreDuenio;

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    public Animal(String nombre, int edad, String nombreDuenio){
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDuenio = nombreDuenio;
    }
    
    @Override
    public String toString(){
        return "nombre="+nombre+", edad="+edad+", dueño="+nombreDuenio;
    }
}