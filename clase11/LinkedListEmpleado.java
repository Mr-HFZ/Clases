package clase11;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListEmpleado {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Crear objeto Scanner para leer datos del usuario
        LinkedList<Empleado> listaEmpleado = new LinkedList<Empleado>(); // Crear una LinkedList para almacenar objetos Empleado

        // Solicitar los datos de 3 empleados
        for (int i = 0; i < 3; i++) {
            Empleado empleado = new Empleado(); // Crear una nueva instancia de Empleado

            System.out.println("Nombre:");
            empleado.setNombre(scanner.nextLine()); // Leer y asignar el nombre

            System.out.println("Profesión:");
            empleado.setProfecion(scanner.nextLine()); // Leer y asignar la profesión

            System.out.println("Empresa:");
            empleado.setEmpresa(scanner.nextLine()); // Leer y asignar la empresa

            listaEmpleado.add(empleado); // Agregar el empleado a la lista
        }

        // Recorrer y mostrar todos los empleados almacenados en la lista
        for (Empleado empleado : listaEmpleado) {
            System.out.println(empleado.getNombre() + " " 
                + empleado.getProfecion() + " " 
                + empleado.getEmpresa());
        }

        scanner.close(); // Cerrar el Scanner para liberar recursos
    }
}
