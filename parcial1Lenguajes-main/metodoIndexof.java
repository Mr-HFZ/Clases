
import java.util.Scanner;

public class metodoIndexof {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena;
        String buscar;
        int posicion = -1;
        System.out.println("ingrese una cadena de texto");
        cadena = scanner.nextLine();
        System.out.println("ingrese un valor a buscar en la cadena");
        buscar = scanner.nextLine();

        posicion = cadena.indexOf(buscar);
        if (posicion == -1) {
            System.out.println("el elemento no es coincidente en la cadena ");
        } else {
            System.out.println("el valor coincidente esta en posicion " + posicion);
        }
    }
}
