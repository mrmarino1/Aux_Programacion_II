package aula;

public class Aula {
    private String nombre;
    private int piso;
    private String[][] estudiantesNotas; 

    public Aula(String nombre, int piso, String[][] estudiantesNotas) {
        this.nombre = nombre;
        this.piso = piso;
        this.estudiantesNotas = estudiantesNotas;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Piso: " + piso);
    }

    public void mostrarDatos(int notaMinima) {
        System.out.println("Lista de Notas:");
        for (int i = 0; i < estudiantesNotas.length; i++) {
            String nombreEst = estudiantesNotas[i][0];
            int notaActual = Integer.parseInt(estudiantesNotas[i][1]); 
            if (notaActual >= notaMinima) {
                System.out.println(nombreEst + ": APROBADO");
            } else {
                System.out.println(nombreEst + ": REPROBADO");
            }
        }
    }
}