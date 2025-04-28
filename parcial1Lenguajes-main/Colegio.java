
import java.util.Scanner;

public class Colegio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Estudiante estudiante = new Estudiante();

        String nombre;
        System.out.println("Ingrese su nombre ");
        nombre = scanner.nextLine();
        estudiante.setNombre(nombre);

        System.out.println("Ingrese la nota 1 ");
        estudiante.setNota1(scanner.nextFloat());
        System.out.println("Ingrese la nota 2 ");
        estudiante.setNota2(scanner.nextFloat());
        System.out.println("Ingrese la nota 3 ");
        estudiante.setNota3(scanner.nextFloat());

        estudiante.setDefinitiva((estudiante.getNota1() + estudiante.getNota2() + estudiante.getNota3()) / 3);
        System.out.println("la nota definitiva es " + estudiante.getDefinitiva());

    }

}
