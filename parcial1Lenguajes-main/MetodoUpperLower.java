
import java.util.Scanner;

public class MetodoUpperLower {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre");
        nombre = scanner.nextLine();

        System.out.println("Nombre en mayuscula: " + nombre.toUpperCase());
        System.out.println("Nombre en minuscula: " + nombre.toLowerCase(null));
    }

}