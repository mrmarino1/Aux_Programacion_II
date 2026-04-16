package app5;
public class App5 {
    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado(4, "Rojo");
        Cuadrado c2 = new Cuadrado(6, "Verde");
        Triangulo t1 = new Triangulo(3, 4, 5, "Azul");
        Triangulo t2 = new Triangulo(5, 5, 6, "Amarillo");
        Redondo r1 = new Redondo(3, "Negro");
        Redondo r2 = new Redondo(5, "Blanco");
        System.out.println("Cuadrados:");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Triángulos:");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println("Redondos:");
        System.out.println(r1);
        System.out.println(r2);
        if (c1.obtenerArea() > t1.obtenerArea()) {
            System.out.println("Color con mayor área: " + c1.color);
        } else {
            System.out.println("Color con mayor área: " + t1.color);
        }
    }    
}
