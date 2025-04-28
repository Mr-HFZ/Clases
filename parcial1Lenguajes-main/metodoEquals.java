
import java.util.Scanner;

public class metodoEquals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre 1");
        String nombre1 = scanner.nextLine();
        System.out.println("Nombre 2");
        String nombre2 = scanner.nextLine();

        if (nombre1.equals(nombre2)) {
            System.out.println("Los nombres son iguales");
        } else {
            System.out.println("Los nombres son diferentes");
        }

    }
}