package aula;
public class TestAula {
    public static void main(String[] args) {
        String[][] datos = {
            {"Ana Garcia", "85"},
            {"Luis Perez", "45"},
            {"Maria Sol", "70"}
        };
        Aula miAula = new Aula("LAB-3", 3, datos);
        miAula.mostrarDatos();
        miAula.mostrarDatos(51);
    }
}