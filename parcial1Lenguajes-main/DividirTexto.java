import java.util.Scanner;

public class DividirTexto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cadena de texto
        System.out.println("Ingrese una cadena de texto:");
        String texto = scanner.nextLine();

        // Dividir la cadena en palabras utilizando el espacio como delimitador
        String[] palabras = texto.split(" ");

        System.out.println("Las palabras son:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        scanner.close();
    }
}