import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<DatosEmpleado> empleados = new ArrayList<>();

        System.out.println("Ingrese el total de registros:");
        int totalRegistro = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        for (int i = 0; i < totalRegistro; i++) {
            DatosEmpleado datosEmpleado = new DatosEmpleado();

            System.out.println("Cedula:");
            datosEmpleado.setCedula(scanner.nextLine());

            System.out.println("Nombre:");
            datosEmpleado.setNombre(scanner.nextLine());

            System.out.println("Edad:");
            datosEmpleado.setEdad(scanner.nextInt());
            scanner.nextLine(); // Consumir la nueva línea

            System.out.println("Carrera:");
            datosEmpleado.setCarrera(scanner.nextLine());

            System.out.println("Semestre:");
            datosEmpleado.setSemestre(scanner.nextInt());
            scanner.nextLine(); // Consumir la nueva línea

            empleados.add(datosEmpleado);
        }

        // Imprimir los empleados registrados
        System.out.println("\nLista de empleados registrados:");
        for (DatosEmpleado emp : empleados) {
            System.out.println("Cedula: " + emp.getCedula() + ", Nombre: " + emp.getNombre() + ", Edad: "
                    + emp.getEdad() + ", Carrera: " + emp.getCarrera() + ", Semestre: " + emp.getSemestre());
        }

        // Calcular el promedio de edad
        int acumEdad = 0;
        for (DatosEmpleado emp : empleados) {
            acumEdad += emp.getEdad();
        }

        double promedioEdad = empleados.isEmpty() ? 0 : (double) acumEdad / empleados.size();
        System.out.println("El promedio de edad de los empleados es: " + promedioEdad);

        scanner.close();
    }
}