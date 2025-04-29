package validacionesclase.ejemplo;
import java.util.*;
public class Validar {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //Expresiones regulares
        String nombre;
        String edadV;
        int edad;
        String estaturaV;
        float estatura;

        do {

            System.out.println("Nombre");
            nombre = in.nextLine();
        } while (!validarNombre(nombre) == true);
        do {

            System.out.println("Edad");
            edadV = in.next();
        } while (!validarEdad(edadV) == true);
        do {

            System.out.println("Estatura");
            estaturaV = in.next();
        } while (!validarEstatura(estaturaV) == true);
    }

    public static boolean validarEstatura(String est) {

        return est.matches("[\\d.]{3,4}+");   //    \
    }

    public static boolean validarEdad(String ed) {

        return ed.matches("[0-9]{2}+");
    }
    
    public static boolean validarNombre(String nom) {

        return nom.matches("[a-zA-Z ]{7,40}+");
    }
}
