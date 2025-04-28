
import java.util.Scanner;
// Ingresar una cadena y determinar cuáles letras del alfabeto no se usan en la cadena

class AlfabetoEncontro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra o una frase de su gusto: ");
        String palabra = scanner.nextLine();
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";

        String arr[] = palabra.split("");
        String alfa[] = alfabeto.split("");

        for (int i = 0; i < alfa.length; i++) {
            boolean encontro = false;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals(alfa[i])) {
                    encontro = true;
                    break;
                }
            }

            if (!encontro) { // Imprimir la letra si no se encontró
                System.out.print(alfa[i] + " No esta en el alfabeto ");
            }
        }
    }
}
