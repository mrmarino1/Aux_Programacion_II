package app3;
public class Estudiante extends Persona{
    private int matricula;
    private String carrera;
    Estudiante(String nombre, int carnet, int edad, int matricula, String carrera){
        super(nombre, carnet, edad);
        this.matricula = matricula;
        this.carrera = carrera;
    }
    
    private int getEdad() {
        return this.edad;
    }
    
    public static boolean mismaEdadDocente(Estudiante e, Docente d) {
        return e.getEdad() == d.getEdad();
    }
    
    public boolean mismaCarrera(Estudiante otro) {
        return this.carrera.equals(otro.carrera);
    }
    
    public String toString(){
        return super.toString() + ", matricula=" + this.matricula +", carrera=" + this.carrera;
    }
}