package agregacion1;
public class Libro {
    private String nombre;
    private String autor;
    private int anio;
    
    public Libro(String nombre, String autor, int anio){
        this.nombre = nombre;
        this.autor = autor;
        this.anio = anio;
    }
    
    public void mostrar(){
        System.out.println("Libro[nombre="+this.nombre+", autor="+this.autor+", año="+this.anio+"]");
    }
    
    public String getNombre(){
        return this.nombre;
    }
}
