
import java.util.Arrays;
import java.util.Scanner;

public class metodoSplitInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arreglo[] = new int[50];
        System.out.println("ingrese un secuencia de numeros separados por un espacio");
        arreglo = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int x : arreglo) {
            System.out.println("valor " + x);
        }

    }
}
