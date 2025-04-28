
import java.util.Scanner;

public class ConversionEnvolvente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String decimal;

        System.out.println("Digite un valor binaario");
        String binario = scanner.nextLine();
        int numero = Integer.parseInt(binario);
        System.out.println("el binario es " + numero);

        System.out.println("Digite un valor en decimal ");
        int decimal = scanner.nextInt();
        String otroBinario = Integer.toBinaryString(decimal);
        System.out.println("el valor binario es " + otroBinario);

    }

}