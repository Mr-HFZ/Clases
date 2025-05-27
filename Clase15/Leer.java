import java.io.File;
import java.util.Scanner;

public class Leer {
    public static void main(String[] args) {
        File archivo = new File("empleado.txt");
        Scanner scanner = new Scanner(System.in);
        {
            try {
                System.out.println("Total de registros");
                scanner  = new Scanner(archivo);
                while (scanner.hasNextLine()) {
                    String registro = scanner.nextLine();
                    System.out.println(registro);
                }
                scanner.close();
            } catch (Exception e) {
                System.out.println("Error " + e);
            }
        }
    }
    
}
