
import java.util.Scanner;

public class BinarioDecimal {

    public static void main(String[] args) {

        String aux1 = "";
        String aux2 = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite un valor en decimal ");
        int decimal = scanner.nextInt();
        String otroBinario = Integer.toBinaryString(decimal);
        System.out.println("el valor binario es " + otroBinario);

        String arr[] = otroBinario.split(""); // separar cadena por caracteres y guardar en un arreglo

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // imprimir cada caracter del arreglo
            aux1 = arr[i];

        }
        System.out.println(" \n");

        for (int i = arr.length - 1; i >= 0; i--) { // recorrer el arreglo de derecha a izquierda
            System.out.println(arr[i]); // imprimir cada caracter del arreglo
            aux2 = arr[i];

        }

        if (aux1.equals(aux2)) {
            System.out.println("el valor binario es palindromo");
        } else {
            System.out.println("el valor binario no es palindromo");
        }

    }
}
