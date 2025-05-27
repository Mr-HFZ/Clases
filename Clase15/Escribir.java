import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escribir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriter archivo = null;

        try {
            archivo = new FileWriter("empleado.txt", true); // modo append

            String respuesta;
            String nombre;
            String profesion;
            String edad;
            String registro;

            System.out.println("¿Desea agregar un registro? (S)i / (N)o");
            respuesta = scanner.nextLine();

            while (respuesta.equalsIgnoreCase("s")) {
                System.out.println("Ingrese nombre:");
                nombre = scanner.nextLine();

                System.out.println("Ingrese profesión:");
                profesion = scanner.nextLine();

                System.out.println("Ingrese edad:");
                edad = scanner.nextLine();

                registro = nombre + " "+ profesion + " " + edad ;
                archivo.write(registro + "\n");


                System.out.println("¿Desea agregar un registro? (S)i / (N)o");
                respuesta = scanner.nextLine();
            }

            archivo.close();

        } catch (IOException e) {
    
        }
    }
}
