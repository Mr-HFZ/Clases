package clase11;

import java.util.HashMap;
import java.util.Scanner;

public class Mapas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer entradas del usuario
        HashMap<Integer, String> mapa = new HashMap<>(); // Crear un HashMap para almacenar ID y nombre

        int id;
        String nombre;

        // Solicitar al usuario que ingrese 3 pares de ID y nombre
        for (int i = 0; i < 3; i++) {
            System.out.println("ID:");
            id = scanner.nextInt(); // Leer el ID como entero
            scanner.nextLine(); // Consumir el salto de línea pendiente después de nextInt()

            System.out.println("Nombre:");
            nombre = scanner.nextLine(); // Leer el nombre como texto

            mapa.put(id, nombre); // Guardar el par ID - Nombre en el HashMap
        }

        // Mostrar todos los valores (nombres) almacenados en el mapa
        System.out.println(mapa.values());

        boolean respuesta;
        String valor;

        // Solicitar un nombre para buscar en el mapa
        System.out.println("Ingrese un nombre a buscar:");
        valor = scanner.nextLine();

        // Verificar si el nombre existe en los valores del mapa
        respuesta = mapa.containsValue(valor);
        String resultado = respuesta == true ? "El dato existe" : "El dato no existe";
        System.out.println(resultado);

        int posicion;
        // Solicitar el ID de un dato para eliminarlo del mapa
        System.out.println("Ingrese posición a eliminar:");
        posicion = scanner.nextInt(); // Leer el ID (clave) a eliminar
        mapa.remove(posicion); // Eliminar la entrada correspondiente al ID

        // Mostrar todos los datos restantes en el mapa
        System.out.println("Total de datos del Mapa:");
        for (Integer i : mapa.keySet()) { // Recorrer todas las claves del mapa
            System.out.println("Nombre: " + mapa.get(i)); // Mostrar el nombre asociado a cada ID
        }

        scanner.close(); // Cerrar el Scanner
    }
}
