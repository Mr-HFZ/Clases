import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriter archivo = null;
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(50) + 1;
        boolean adivino = false;

        try {
            archivo = new FileWriter("empleado.txt", true); 

            for (int intento = 1; intento <= 10; intento++) {
                System.out.println("Try: " + intento + " - Ingrese un numero del 1 al 50:");
                int numeroIngresado = scanner.nextInt();

                if (numeroIngresado == numeroSecreto) {
                    System.out.println("¡Adivino!");
                    archivo.write("Intento " + intento + " - " + numeroIngresado + " Adivino\n");
                    adivino = true;
                    break;
                } else {
                    int diferencia = numeroIngresado - numeroSecreto;

                    if (diferencia < 0) { 
                        if (-diferencia <= 2) {
                            System.out.println("Muy cerca por debajo");
                        } else if (-diferencia <= 5) {
                            System.out.println("Cerca por debajo");
                        } else {
                            System.out.println("Muy lejos");
                        }
                    } else { 
                        if (diferencia <= 2) {
                            System.out.println("Muy cerca por encima");
                        } else if (diferencia <= 5) {
                            System.out.println("Cerca por encima");
                        } else {
                            System.out.println("Muy lejos");
                        }
                    }

                    archivo.write("Intento " + intento + " - " + numeroIngresado + " No Adivino\n");
                }
            }

            if (!adivino) {
                System.out.println("Se acabaron las vidas. El número era: " + numeroSecreto);
            }

            archivo.close();

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

        scanner.close();
    }
}
