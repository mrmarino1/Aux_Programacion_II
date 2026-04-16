
package app3;

public class App3 {

    public static void main(String[] args) {
        Estudiante s = new Estudiante ("Belen", 24282705, 23, 1895385, "informatica");
        System.out.println (s);
        Estudiante s2 = new Estudiante ("Juan", 48415214, 44, 4928549, "Contabilidad");
        System.out.println(s2);
        Docente d = new Docente("Tellez", 8587451, 44, 5, 12500);
        System.out.println(d);
        System.out.println("Misma edad estudiante 1 a docente");
        System.out.println(s.mismaEdadDocente(s, d));
        System.out.println("Misma edad estudiante 2 a docente");
        System.out.println(s2.mismaEdadDocente(s2, d));
        System.out.println("Misma carrera estudiante 1 a estudiante 2");
        System.out.println(s.mismaCarrera(s2));
    }
    
}
