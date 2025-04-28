import java.util.Scanner;

public class CompararFrases {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario las dos frases
        System.out.println("Ingrese la primera frase:");
        String frase1 = scanner.nextLine();

        System.out.println("Ingrese la segunda frase:");
        String frase2 = scanner.nextLine();

        // Comparar las frases usando equals
        if (frase1.equals(frase2)) {
            System.out.println("Las frases son idénticas.");
        } else {
            System.out.println("Las frases son diferentes.");
        }

        scanner.close();
    }
}