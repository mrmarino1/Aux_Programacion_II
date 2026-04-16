package app3;

public class Docente extends Persona{
   private int antiguedad;
   private double sueldo;
   
   Docente(String nombre, int carnet, int edad, int antiguedad, double sueldo){
       super(nombre, carnet, edad);
        this.antiguedad = antiguedad;
        this.sueldo = sueldo;
   }
   
    public int getEdad() {
        return this.edad;
    }
    
   public String toString(){
        return super.toString() + ", antiguedad=" + this.antiguedad +", sueldo=" + this.sueldo;
    }
}
