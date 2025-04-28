
import java.util.Scanner;

public class metodoSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fecha;
        System.out.println("ingrese una fecha");
        fecha = scanner.nextLine();
        System.out.println("dia " + fecha.substring(8));
        System.out.println("mes " + fecha.substring(5, 7));

        System.out.println("año " + fecha.substring(0, 4));

    }
}
