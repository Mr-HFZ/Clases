
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ClaseArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        int n;
        System.out.println("Total de datos a ingresar");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un valor numerico");
            numeros.add(sc.nextInt());

        }
        /*
         * // System.out.println(numeros);
         * // for (int i = 0; i < n; i++) {
         * // System.out.println( numeros.get(i));
         * // }
         * // for (int x : numeros) {
         * // System.out.println(x);
         * // }
         * 
         * 
         * ------"El cielo está azul hoy."---------
         * 
         * Y quieres saber si esa frase contiene la palabra "azul". Para eso, puedes
         * usar el método contains().
         * 
         * 
         * int datoBuscar;
         * System.out.println("Ingrese un valor para buscar");
         * datoBuscar = sc.nextInt();
         * if(numeros.contains(datoBuscar)){
         * System.out.println("El valor existe en la lista");
         * }
         * else{
         * System.out.println("El valor no existe en la lista");
         * }
         * 
         * //eliminar un elemento
         * int indiceBorrar;
         * System.out.println("Ingrese el indice del elemento a eliminar entre 0 y "+(
         * numeros.size()-1));
         * indiceBorrar = sc.nextInt();
         * numeros.remove(indiceBorrar);
         * System.out.println(numeros);
         * 
         * //modificar
         * int indice;
         * int valorNuevo;
         * System.out.println("ingrese un indice entre el 0 y " (numeros.size() - 1) +
         * "a modificar");
         * indice = sc.nextInt();
         * System.out.println("ingrese el valor nuevo  ");
         * valorNuevo = sc.nextInt();
         * numeros.set(indice, valorNuevo);
         * System.out.println(numeros);
         * 
         * 
         * // buscar posicion de un elemento
         * 
         * int posicion;
         * System.out.println("ingrese un elemento ");
         * valor = sc.nextInt();
         * posicion = numeros.indexOf(valor);
         * if (posicion == -1) {
         * System.out.println("el dato no existe");
         * }else{
         * System.out.println("el dato existe en la posicion "+posicion);
         * }
         */

        /*
         * //oredenamiento
         * System.out.println(numeros);
         * Collections.sort(numeros);
         * System.out.println(numeros);
         */

        // leer un valor, si el valor existe se elimina, si no existe se adiciona
        int valor;
        System.out.println("ingrese un valor ");
        valor = sc.nextInt();
        if (numeros.contains(valor)) {
            numeros.remove((Integer) valor);
            System.out.println("el valor " + valor + " ha sido eliminado");
        } else {
            numeros.add(valor);
            System.out.println("el valor " + valor + " ha sido agregado");
        }
        System.out.println(numeros);

    }
}
