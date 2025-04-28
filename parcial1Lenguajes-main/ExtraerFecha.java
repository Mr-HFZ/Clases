import java.util.Scanner;

public class ExtraerFecha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la fecha en formato "yyyy-MM-dd"
        System.out.println("Ingrese una fecha (formato yyyy-MM-dd):");
        String fecha = scanner.nextLine();

        // Extraer el año, mes y día utilizando substring
        String año = fecha.substring(0, 4);
        String mes = fecha.substring(5, 7);
        String dia = fecha.substring(8);

        // Mostrar el día, mes y año
        System.out.println("Día: " + dia);
        System.out.println("Mes: " + mes);
        System.out.println("Año: " + año);

        scanner.close();
    }
}