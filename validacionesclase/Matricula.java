package validacionesclase;

import java.util.ArrayList;
import java.util.Scanner;

public class Matricula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Alumno> arreglo = new ArrayList<Alumno>();
        String nombre;
        String nota1V;
        String nota2V;
        String nota3V;
        float definitiva;
        int totalAlumnos;

        System.out.println("Total de alumnos:");
        totalAlumnos = scanner.nextInt();

        for (int i = 1; i <= totalAlumnos; i++) {
            Alumno alumno = new Alumno();

            do {
                System.out.println("Ingrese el nombre del alumno:");
                nombre = scanner.next();
            } while (!validarNombre(nombre));

            do {
                System.out.println("Ingrese la nota 1 del alumno:");
                nota1V = scanner.next();
            } while (!validarNota1(nota1V));

            do {
                System.out.println("Ingrese la nota 2 del alumno:");
                nota2V = scanner.next();
            } while (!validarNota2(nota2V));

            do {
                System.out.println("Ingrese la nota 3 del alumno:");
                nota3V = scanner.next();
            } while (!validarNota3(nota3V));

            alumno.setNombre(nombre);
            alumno.setNota1(Float.parseFloat(nota1V));
            alumno.setNota2(Float.parseFloat(nota2V));
            alumno.setNota3(Float.parseFloat(nota3V));

            // Promedio corregido con paréntesis
            alumno.setDefinitiva((alumno.getNota1() + alumno.getNota2() + alumno.getNota3()) / 3);
            arreglo.add(alumno);
        }

        for (int i = 0; i < arreglo.size(); i++) {
            System.out.println("Nombre: " + arreglo.get(i).getNombre() + " - Definitiva: " +
                    arreglo.get(i).getDefinitiva());
        }
    }

    // Validar que sea un número entre 0.0 y 5.0 (hasta 3 caracteres con punto decimal)
    public static boolean validarNota1(String nota) {
        return nota.matches("[0-5](\\.\\d+)?");
    }

    public static boolean validarNota2(String nota) {
        return nota.matches("[0-5](\\.\\d+)?");
    }

    public static boolean validarNota3(String nota) {
        return nota.matches("[0-5](\\.\\d+)?");
    }

    public static boolean validarNombre(String nombre) {
        return nombre.matches("[A-Za-záéíóúÁÉÍÓÚñÑ]{2,30}");
    }
}
