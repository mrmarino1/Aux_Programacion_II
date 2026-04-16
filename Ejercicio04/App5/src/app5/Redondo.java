package app5;
public class Redondo extends Figura{
    private int radio;
    
    Redondo(int radio, String color){
        super(color);
        this.radio = radio;
    }
    
    protected double obtenerArea(){
        return Math.PI * radio * radio;
    }
    
    public String toString(){
        return super.toString()+", radio= "+ this.radio;
    }
}
