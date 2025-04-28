
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de clientes que registro su compra: ");
        int NumeroClientes = scanner.nextInt();

        for (int i = 0; i < NumeroClientes; i++) {
            System.out.println("Ingrese el nombre del cliente: ");
            String nombre = scanner.next();
            System.out.println("Ingrese el articulo que compró: ");
            String articulo = scanner.next();
            System.out.println("Ingrese la cantidad de articulos comprados: ");
            int cantidad = scanner.nextInt();
            System.out.println("Ingrese el valor unitario del articulo: ");
            double valorUnitario = scanner.nextDouble();

            double valorTotal = cantidad * valorUnitario;
            double descuento = valorTotal * 0.1;
            double valorTotalConDescuento = valorTotal - descuento;

            System.out.println("Nombre del cliente: " + nombre);
            System.out.println("Articulo comprado: " + articulo);
            System.out.println("Cantidad de articulos comprados: " + cantidad);
            System.out.println("Valor unitario del articulo: " + valorUnitario);
            System.out.println("Valor total a pagar: " + valorTotal);
            System.out.println("Descuento aplicado: " + descuento);
            System.out.println("Valor total con descuento: " + valorTotalConDescuento);
            System.out.println("------------------------------------------------");
        }
    }
}
