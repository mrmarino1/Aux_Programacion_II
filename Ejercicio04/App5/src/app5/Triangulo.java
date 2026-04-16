package app5;
public class Triangulo extends Figura{
    private int lado1;
    private int lado2;
    private int lado3;
    
    Triangulo(int lado1, int lado2, int lado3, String color){
        super(color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    protected double obtenerArea(){
        double s = (lado1 + lado2 + lado3) / 2.0;
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }
    
    public String toString(){
        return super.toString()+", lado a= "+ this.lado1+", lado b= "+ this.lado2+", lado c= "+ this.lado3;
    }
}
