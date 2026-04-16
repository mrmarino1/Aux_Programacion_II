package app5;
public class Cuadrado extends Figura{
    private int lado;
    Cuadrado(int lado, String color){
        super(color);
        this.lado = lado;
    }
    
    protected double obtenerArea(){
        return lado*lado;
    }
    
    public String toString(){
        return super.toString()+", lado= "+ this.lado;
    }
}
