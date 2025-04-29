package clase11;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Clase que utiliza una LinkedList para almacenar nombres ingresados por el usuario,
 * permite eliminar un nombre por posición y muestra el primer y último nombre de la lista.
 */
public class ClaselinkedList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> lista = new LinkedList<>();

        // Solicitar 5 nombres al usuario
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre:");
            lista.add(scanner.nextLine());
        }

        // Mostrar todos los nombres ingresados
        System.out.println("\nLista de nombres:");
        for (String valor : lista) {
            System.out.println("Nombre: " + valor);
        }

        // Solicitar posición a eliminar
        System.out.println("\nIngrese la posición a eliminar:");
        int posicion = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea pendiente

        // Validar que la posición sea válida antes de eliminar
        if (posicion >= 0 && posicion < lista.size()) {
            lista.remove(posicion);
            System.out.println("Elemento eliminado correctamente.\n");
        } else {
            System.out.println("Posición inválida. No se eliminó ningún elemento.\n");
        }

        // Mostrar la lista actualizada
        System.out.println("Lista actualizada:");
        for (String valor : lista) {
            System.out.println("Nombre: " + valor);
        }

        // Verificar que la lista no esté vacía antes de acceder al primer y último elemento
        if (!lista.isEmpty()) {
            System.out.println("\nPrimera posición: " + lista.getFirst());
            System.out.println("Última posición: " + lista.getLast());
        } else {
            System.out.println("\nLa lista está vacía.");
        }

        scanner.close();
    }
}
