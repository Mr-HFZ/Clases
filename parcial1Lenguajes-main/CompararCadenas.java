import java.util.Scanner;

public class CompararCadenas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario dos palabras
        System.out.println("Ingrese la primera palabra:");
        String palabra1 = scanner.nextLine();

        System.out.println("Ingrese la segunda palabra:");
        String palabra2 = scanner.nextLine();

        // Comparar las palabras
        int resultado = palabra1.compareTo(palabra2);

        if (resultado < 0) {
            System.out.println("La primera palabra va antes que la segunda.");
        } else if (resultado == 0) {
            System.out.println("Las palabras son iguales.");
        } else {
            System.out.println("La primera palabra va después que la segunda.");
        }

        scanner.close();
    }
}