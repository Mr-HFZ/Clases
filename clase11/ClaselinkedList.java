package clase11;

import java.util.LinkedList;
import java.util.Scanner;

public class ClaselinkedList {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        LinkedList<String> lista = new LinkedList<>();

        for (int i = 0 ; i < 5; i++){

            System.out.println("ingrese Nimbre ");
            lista.add(scanner.nextLine());

        }
        for (String valor : lista){

            System.out.println("Nombre " + valor);


        }

        int posicion;
        System.out.println("ingrese posicion a eliminar");
        posicion = scanner.nextInt();
        lista.remove(posicion);
        

        for(Sreing : posicion){
            System.out.println("Nombre ;" + valor );

        }
        System.out.println("primera posicio es "+ lista.getfirt());
        System.out.println("Ultima posicio es "+ lista.getLast());






        
    }
}
