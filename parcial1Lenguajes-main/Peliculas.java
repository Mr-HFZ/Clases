import java.util.ArrayList;
import java.util.Scanner;

public class Peliculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de peliculas de su Lista: ");
        int numPelis = scanner.nextInt();

        ArrayList<String> peliculas = new ArrayList<>(); // ArrayList vacío

        for (int i = 0; i < numPelis; i++) {
            System.out.println("Ingrese la pelicula que desea agregar a la lista: ");
            String pelicula = scanner.next(); // Lee la película
            peliculas.add(pelicula); // Agrega la película al ArrayList
        }

        System.out.println("Desea buscar una pelicula en la lista?  (si/no); ");
        String respuesta = scanner.next(); // leer respuesta
        respuesta = respuesta.toUpperCase();

        if (respuesta.equals("SI")) {
            System.out.println("Ingrese el nombre de la pelicula que desea buscar: ");
            String buscar = scanner.next(); // leer pelicula a buscar

            for (int i = 0; i < peliculas.size(); i++) {
                if (peliculas.get(i).equals(buscar)) { // cambie contains por equals
                    System.out.println("La pelicula se encuentra en la lista");
                    System.out.println("Deseas eliminar la pelicula de la lista? (si/no)");
                    String eliminar = scanner.next();
                    eliminar = eliminar.toLowerCase();

                    if (eliminar.equals("SI")) {
                        peliculas.remove(i);
                        System.out.println("La pelicula ha sido eliminada de la lista");
                    }
                    break;

                } else {
                    System.out.println("La pelicula no se encuentra en la lista");
                    System.out.println("Desea agregar tu pelicula a la lista? (si/no)");
                    String agregar = scanner.next();
                    agregar = agregar.toLowerCase();

                    if (agregar.equals("SI")) {
                        System.out.println("Ingrese la pelicula que desea agregar a la lista: ");
                        String agregarPelicula = scanner.next();
                        peliculas.add(agregarPelicula);
                    }
                    break;
                }
            }
        }
    }
}

/*
 * pedirle al usuario la cantidad de peliculas que ingresara(o por sentinelas)
 * tener la opcion de buscar una pelicula por su nombre en caso de que no este
 * en la lista
 * preguntar si quiere añadir la pelicula a la lista
 * en caso de que si, preguntar si quiere eliminarla de la lista
 */