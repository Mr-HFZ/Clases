import java.util.Scanner;

public class BuscarPalabra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cadena y la palabra a buscar
        System.out.println("Ingrese una cadena de texto:");
        String texto = scanner.nextLine();

        System.out.println("Ingrese la palabra a buscar:");
        String palabra = scanner.nextLine();

        // Buscar la palabra en la cadena
        int posicion = texto.indexOf(palabra);

        if (posicion != -1) {
            System.out.println("La palabra '" + palabra + "' se encuentra en la posición " + posicion);
        } else {
            System.out.println("La palabra '" + palabra + "' no se encuentra en la cadena.");
        }

        scanner.close();
    }
}