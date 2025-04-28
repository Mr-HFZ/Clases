
import java.util.Scanner;

public class metodoSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arreglo[] = new String[50];
        String cadena;

        System.out.println("ingrese una cadena ");
        cadena = scanner.nextLine();
        arreglo = cadena.split(" ");

        for (String valor : arreglo) {
            System.out.println("elementos " + valor);
        }

    }
}
