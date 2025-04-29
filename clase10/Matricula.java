import java.util.HashSet;
import java.util.Scanner;

public class Matricula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Alumno> alumnos = new HashSet<>();
        for (int i = 1; i <= 5; i++) {
            Alumno alumno = new Alumno();
            System.out.println("Nombre: ");
            alumno.setNombre(scanner.nextLine());
            System.out.println("Carrera");
            alumno.setCarrera(scanner.nextLine());
            System.out.println("Fecha de nacimiento");
            alumno.setFechaNacimiento(scanner.nextLine());

            alumnos.add(alumno);
        }

        for (Alumno alumno : alumnos){
            System.out.println(alumno.getNombre() + " " + alumno.getCarrera() + " " + alumno.getFechaNacimiento());

        }

    }
}
