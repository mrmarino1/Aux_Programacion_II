package app5;
abstract class Figura {
    protected String color;
    Figura(String color){
        this.color = color;
    }
    protected abstract double obtenerArea();
    
    public String toString(){
        return "color= "+ this.color;
    }
}
