import java.util.Arrays;
import java.util.Scanner;

public class SumarNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario una secuencia de números separados por espacios
        System.out.println("Ingrese una secuencia de números separados por espacios:");
        String input = scanner.nextLine();

        // Convertir la cadena en un arreglo de enteros
        int[] numeros = Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Calcular la suma total de los números
        int sumaTotal = 0;
        for (int num : numeros) {
            sumaTotal += num;
        }

        System.out.println("La suma total de los números es: " + sumaTotal);

        scanner.close();
    }
}