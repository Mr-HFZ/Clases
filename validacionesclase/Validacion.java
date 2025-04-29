package validacionesclase;
import java.util.*;

public class Validacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DatosCliente> lista = new ArrayList<DatosCliente>();
        System.out.println("Ingrese total de registros: ");
        int total = sc.nextInt();

        for(int i = 0; i < total; i++) {
            DatosCliente datosC = new DatosCliente();
            System.out.println("Ingrese nombre: ");
            datosC.setNombre(sc.next());
            System.out.println("Ingrese articulo: ");
            datosC.setArticulo(sc.next());
            System.out.println("Ingrese cantidad: ");
            datosC.setCantidad(sc.nextInt());
            System.out.println("Ingrese el valor unitario: ");
            datosC.setValorUnitario(sc.nextDouble());
        }





    }
    
}
