package clase11;

import java.util.HashMap;
import java.util.Scanner;

public class Mapas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> mapa = new HashMap<>();

        int id;
        String nombre;

        for (int i = 0; i < 3; i++) {
            System.out.println("ID:");
            id = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea después de nextInt()

            System.out.println("Nombre:");
            nombre = scanner.nextLine();
            nombre = scanner.nextLine();

            mapa.put(id, nombre);
        }

        System.out.println(mapa.values());

        boolean respuesta;
        String valor;

        System.out.println("ingrese un nombre a buscar");
        valor = scanner.nextLine();

        respuesta = mapa.containsValue(valor);
        String resultado = respuesta == true ? "el dato existe" : "El dato no existe";
        System.out.println(resultado);
        
        int posicion;
        System.out.println("Ingrese posicion a eliminar");
        mapa.remove(posicion);


        System.out.println("total de datos del Mapa");
        for(Integer i :mapa.keySet()){
            System.out.println("Nombre" + mapa.get(i));

        }




    }
}
