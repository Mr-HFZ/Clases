
import java.util.Scanner;

public class metodoCompareto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre1;
        String nombre2;

        System.out.println("Nombre 1: ");
        nombre1 = scanner.nextLine();
        System.out.println("Nombre 2: ");
        nombre2 = scanner.nextLine();

        if (nombre1.compareTo(nombre2) < 0) {
            System.out.println(nombre1 + " va primero que " + nombre2);

        } else if (nombre2.compareTo(nombre1) < 0) {
            System.out.println(nombre2 + " va primero que " + nombre1);
        } else if (nombre2.compareTo(nombre1) == 0) {
            System.out.println("Los nombres son iguales");
        }
    }

}
